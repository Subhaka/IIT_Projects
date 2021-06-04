import 'package:clothing/constants.dart';
import 'package:clothing/watch/watch.dart';
import 'package:clothing/watch/watchdetails.dart';
import 'package:clothing/watch/watchitemcard.dart';
import 'package:flutter/material.dart';

void main() {
  runApp(WatchBody());
}

class WatchBody extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: <Widget>[
        Padding(
          padding: const EdgeInsets.symmetric(
              horizontal: kDefaultPaddin, vertical: 20),
          //   child: Text(
          //     "Women",
          //     style: Theme.of(context)
          //         .textTheme
          //         .headline5
          //         .copyWith(fontWeight: FontWeight.bold),
          //   ),
        ),
        // Categories(),
        Expanded(
            child: Padding(
          padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
          child: GridView.builder(
              itemCount: watch.length,
              gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                  crossAxisCount: 2,
                  childAspectRatio: 0.65,
                  mainAxisSpacing: kDefaultPaddin,
                  crossAxisSpacing: kDefaultPaddin),
              itemBuilder: (context, index) => ItemCardDress(
                    watch: watch[index],
                    press: () => Navigator.push(context,
                        MaterialPageRoute(builder: (context) {
                      return DetailsScreenWatch(
                        watch: watch[index],
                      );
                    })),
                  )),
        )),
      ],
    );
  }
}
