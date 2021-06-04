import 'package:flutter/material.dart';
import '../constants.dart';
import 'watch.dart';

class WatchTitleWithImage extends StatelessWidget {
  const WatchTitleWithImage({
    Key key,
    @required this.dress,
  }) : super(key: key);
  final Watch dress;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          Text(
            "Ladies Watch",
            style: TextStyle(color: Colors.white),
          ),
          Text(
            dress.title,
            style: Theme.of(context)
                .textTheme
                .headline4
                .copyWith(color: Colors.white, fontWeight: FontWeight.bold),
          ),
          SizedBox(
            height: kDefaultPaddin / 28,
          ),
          Row(
            children: <Widget>[
              RichText(
                  text: TextSpan(children: [
                TextSpan(text: "Price\n"),
                TextSpan(
                    text: "\$${dress.price}",
                    style: Theme.of(context).textTheme.headline3.copyWith(
                        color: Colors.white, fontWeight: FontWeight.bold))
              ])),
              SizedBox(
                width: kDefaultPaddin / 0.3,
              ),
              Expanded(
                  child: Hero(
                      tag: "${dress.id}",
                      child: Image.asset(
                        dress.image,
                        fit: BoxFit.fill,
                      )))
            ],
          )
        ],
      ),
    );
  }
}
