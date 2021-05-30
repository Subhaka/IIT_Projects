import 'package:flutter/material.dart';
import '../constants.dart';
import 'dress.dart';

class ItemCardDress extends StatelessWidget {
  final Dress dress;
  final Function press;

  const ItemCardDress({
    Key key,
    this.dress,
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
                  color: dress.color,
                  borderRadius: BorderRadius.circular(16),
                ),
                child:Hero(
                  tag: "${dress.id}",
                  child: Image.asset(dress.image),
                ),)
          ),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
            child: Text(
              dress.title,
              style: TextStyle(color: kTextLightColor),
            ),
          ),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
            child: Text(
              "\$${dress.price}",
              style: TextStyle(fontWeight: FontWeight.bold),
            ),
          )
        ],
      ),
    );
  }
}
