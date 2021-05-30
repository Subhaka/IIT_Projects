
import 'package:clothing/constants.dart';
import 'package:clothing/dress/dressbodtdetails.dart';
import 'package:clothing/footwear/Footwear.dart';
import 'package:clothing/footwear/footwearbodydetails.dart';
import 'package:clothing/jewellary/bodydetailsjwellary.dart';
import 'package:clothing/jewellary/jewellery.dart';
import 'package:clothing/jewellary/jewellerybody.dart';
import 'package:flutter/material.dart';

import 'dress.dart';
void main() {
  runApp() {
    DetailsScreenDress();
  }
}

class DetailsScreenDress extends StatelessWidget {
  final Dress dress ;

  const DetailsScreenDress({Key key, this.dress}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: dress.color,
      appBar: buildAppBar(context),
      body: DetailsBodyDress(dress: dress,),
    );
  }

  AppBar buildAppBar(BuildContext context) {
    return AppBar(
      backgroundColor: dress.color,
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
