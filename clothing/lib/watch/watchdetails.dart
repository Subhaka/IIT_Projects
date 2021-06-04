import 'package:clothing/constants.dart';
import 'package:clothing/watch/watchbodtdetails.dart';
import 'package:flutter/material.dart';

import 'watch.dart';

void main() {
  runApp() {
    DetailsScreenWatch();
  }
}

class DetailsScreenWatch extends StatelessWidget {
  final Watch watch;

  const DetailsScreenWatch({Key key, this.watch}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: watch.color,
      appBar: buildAppBar(context),
      body: DetailsBodyWatch(
        watch: watch,
      ),
    );
  }

  AppBar buildAppBar(BuildContext context) {
    return AppBar(
      backgroundColor: watch.color,
      elevation: 0,
      leading: IconButton(
        icon: Icon(Icons.arrow_back_outlined),
        onPressed: () {
          Navigator.pop(context);
        },
        color: Colors.white,
      ),
      actions: <Widget>[
        IconButton(icon: Icon(Icons.search), onPressed: () {}),
        IconButton(icon: Icon(Icons.shopping_cart_outlined), onPressed: () {}),
        SizedBox(
          width: kDefaultPaddin / 2,
        )
      ],
    );
  }
}
