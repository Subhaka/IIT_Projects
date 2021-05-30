
import 'package:clothing/constants.dart';
import 'package:clothing/jewellary/bodydetailsjwellary.dart';
import 'package:clothing/jewellary/jewellery.dart';
import 'package:clothing/jewellary/jewellerybody.dart';
import 'package:flutter/material.dart';
void main() {
  runApp() {
    DetailsScreenJwellary();
  }
}

class DetailsScreenJwellary extends StatelessWidget {
  final Jewellery jewellery ;

  const DetailsScreenJwellary({Key key, this.jewellery}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: jewellery.color,
      appBar: buildAppBar(context),
      body: DetailsBodyJewellary(jewellery: jewellery,),
    );
  }

  AppBar buildAppBar(BuildContext context) {
    return AppBar(
      backgroundColor: jewellery.color,
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
