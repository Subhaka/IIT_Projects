import 'package:clothing/constants.dart';
import 'package:clothing/footwear/footweardetails.dart';
import 'package:clothing/footwear/footwearitemcard.dart';
import 'package:flutter/material.dart';

import 'Footwear.dart';
void main(){
  runApp(FootWearBody());
}

class FootWearBody extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Column(
      crossAxisAlignment: CrossAxisAlignment.start,
      children: <Widget>[
        Padding(
          padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin,vertical: 20),
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
                  itemCount: footwear.length,
                  gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                      crossAxisCount: 2,
                      childAspectRatio: 0.65,
                      mainAxisSpacing: kDefaultPaddin,
                      crossAxisSpacing: kDefaultPaddin),
                  itemBuilder: (context, index) => ItemCardFootWear(
                    footWear: footwear[index],
                    press: () => Navigator.push(context,
                        MaterialPageRoute(builder: (context) {
                          return DetailsScreenFootWear(
                            footWear: footwear[index],
                          );
                        })
                    ),
                  )),
            )),
      ],
    );
  }
}
