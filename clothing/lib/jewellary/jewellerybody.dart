import 'package:clothing/constants.dart';
import 'package:clothing/jewellary/jwellarydetail.dart';
import 'package:flutter/material.dart';
import 'jewellery.dart';
import 'jewelleryitemcard.dart';
void main(){
  runApp(JewellaryBody());
}

class JewellaryBody extends StatelessWidget {
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
                  itemCount: jewellery.length,
                  gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                      crossAxisCount: 2,
                      childAspectRatio: 0.65,
                      mainAxisSpacing: kDefaultPaddin,
                      crossAxisSpacing: kDefaultPaddin),
                  itemBuilder: (context, index) => ItemCardJwellary(
                    jewellary: jewellery[index],
                    press: () => Navigator.push(context,
                        MaterialPageRoute(builder: (context) {
                          return DetailsScreenJwellary(
                            jewellery: jewellery[index],
                          );
                        })
                    ),
                  )),
            )),
      ],
    );
  }
}
