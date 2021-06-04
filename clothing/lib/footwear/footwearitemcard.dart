import 'package:clothing/footwear/Footwear.dart';
import 'package:flutter/material.dart';
import '../constants.dart';

class ItemCardFootWear extends StatelessWidget {
  final FootWear footWear;
  final Function press;

  const ItemCardFootWear({
    Key key,
    this.footWear,
    this.press,
  }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return GestureDetector(
      onTap: press,
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          Expanded(
              child: Container(
            padding: EdgeInsets.all(kDefaultPaddin),
            height: 160,
            width: 150,
            decoration: BoxDecoration(
              color: footWear.color,
              borderRadius: BorderRadius.circular(16),
            ),
            child: Hero(
              tag: "${footWear.id}",
              child: Image.asset(footWear.image),
            ),
          )),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
            child: Text(
              footWear.title,
              style: TextStyle(color: kTextLightColor),
            ),
          ),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
            child: Text(
              "\$${footWear.price}",
              style: TextStyle(fontWeight: FontWeight.bold),
            ),
          )
        ],
      ),
    );
  }
}
