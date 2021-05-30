
import 'Product.dart';
import 'body_details.dart';
import 'package:clothing/constants.dart';
import 'package:flutter/material.dart';
void main() {
  runApp() {
    DetailsScreen();
  }
}

class DetailsScreen extends StatelessWidget {
  final Product product;

  const DetailsScreen({Key key, this.product}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: product.color,
      appBar: buildAppBar(context),
      body: DetailsBody(product: product,),
    );
  }

  AppBar buildAppBar(BuildContext context) {
    return AppBar(
      backgroundColor: product.color,
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
