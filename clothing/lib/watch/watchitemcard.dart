import 'package:flutter/material.dart';
import '../constants.dart';
import 'watch.dart';

class ItemCardDress extends StatelessWidget {
  final Watch watch;
  final Function press;

  const ItemCardDress({
    Key key,
    this.watch,
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
              color: watch.color,
              borderRadius: BorderRadius.circular(16),
            ),
            child: Hero(
              tag: "${watch.id}",
              child: Image.asset(watch.image),
            ),
          )),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
            child: Text(
              watch.title,
              style: TextStyle(color: kTextLightColor),
            ),
          ),
          Padding(
            padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
            child: Text(
              "\$${watch.price}",
              style: TextStyle(fontWeight: FontWeight.bold),
            ),
          )
        ],
      ),
    );
  }
}
