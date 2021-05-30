import 'package:clothing/constants.dart';
import 'package:clothing/dress/dress.dart';
import 'package:clothing/dress/dressdetails.dart';
import 'package:clothing/dress/dressitemcard.dart';
import 'package:flutter/material.dart';

void main(){
  runApp(DressBody());
}

class DressBody extends StatelessWidget {
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
                  itemCount: dress.length,
                  gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                      crossAxisCount: 2,
                      childAspectRatio: 0.65,
                      mainAxisSpacing: kDefaultPaddin,
                      crossAxisSpacing: kDefaultPaddin),
                  itemBuilder: (context, index) => ItemCardDress(
                    dress: dress[index],
                    press: () => Navigator.push(context,
                        MaterialPageRoute(builder: (context) {
                          return DetailsScreenDress(
                            dress: dress[index],
                          );
                        })
                    ),
                  )),
            )),
      ],
    );
  }
}
