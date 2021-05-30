
import 'package:clothing/constants.dart';
import 'package:clothing/footwear/Footwear.dart';
import 'package:clothing/footwear/footwearbodydetails.dart';
import 'package:flutter/material.dart';
void main() {
  runApp() {
    DetailsScreenFootWear();
  }
}

class DetailsScreenFootWear extends StatelessWidget {
  final FootWear footWear ;

  const DetailsScreenFootWear({Key key, this.footWear}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: footWear.color,
      appBar: buildAppBar(context),
      body: DetailsBodyFootWear(footWear: footWear,),
    );
  }

  AppBar buildAppBar(BuildContext context) {
    return AppBar(
      backgroundColor: footWear.color,
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
