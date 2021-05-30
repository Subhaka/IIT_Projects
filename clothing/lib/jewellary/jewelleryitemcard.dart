
import 'package:flutter/material.dart';

import 'jewellery.dart';
import '../constants.dart';

class ItemCardJwellary extends StatelessWidget {
  final Jewellery jewellary;
  final Function press;

  const ItemCardJwellary({
    Key key,
    this.jewellary,
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
                  color: jewellary.color,
                  borderRadius: BorderRadius.circular(16),
                ),
                child:Hero(
                  tag: "${jewellary.id}",
                  child: Image.asset(jewellary.image),
                ),)
          ),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
            child: Text(
              jewellary.title,
              style: TextStyle(color: kTextLightColor),
            ),
          ),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
            child: Text(
              "\$${jewellary.price}",
              style: TextStyle(fontWeight: FontWeight.bold),
            ),
          )
        ],
      ),
    );
  }
}
