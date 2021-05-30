import 'package:clothing/constants.dart';
import 'package:flutter/material.dart';
import 'Product.dart';
import '../categories.dart';
import 'details.dart';
import 'itemcard.dart';
void main(){
  runApp(Body());
}

class Body extends StatelessWidget {
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
              itemCount: products.length,
              gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
                  crossAxisCount: 2,
                  childAspectRatio: 0.65,
                  mainAxisSpacing: kDefaultPaddin,
                  crossAxisSpacing: kDefaultPaddin),
              itemBuilder: (context, index) => ItemCard(
                    product: products[index],
                    press: () => Navigator.push(context,
                        MaterialPageRoute(builder: (context) {
                      return DetailsScreen(
                        product: products[index],
                      );
                    })),
                  )),
        )),
      ],
    );
  }
}
