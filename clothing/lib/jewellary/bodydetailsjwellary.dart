import 'package:clothing/constants.dart';
import 'package:clothing/jewellary/jewellarywithimage.dart';
import 'package:clothing/jewellary/jewellery.dart';
import 'package:clothing/jewellary/jwellarycolorandsize.dart';
import 'package:clothing/jewellary/jwellarydescription.dart';
import 'package:flutter/material.dart';

import '../counterwithsvg.dart';


class DetailsBodyJewellary extends StatelessWidget {
  final Jewellery jewellery;

  const DetailsBodyJewellary({Key key, this.jewellery}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    Size size = MediaQuery.of(context).size;
    return SingleChildScrollView(
      child: Column(
        children: <Widget>[
          SizedBox(
            height: size.height,
            child: Stack(
              children: <Widget>[
                Container(
                  margin: EdgeInsets.only(top: size.height * 0.3),
                  padding: EdgeInsets.only(
                      top: size.height * 0.12,
                      left: kDefaultPaddin,
                      right: kDefaultPaddin),
                  // height: 500,
                  decoration: BoxDecoration(
                    color: Colors.white,
                    borderRadius: BorderRadius.only(
                        topLeft: Radius.circular(24),
                        topRight: Radius.circular(20)),
                  ),
                  child: Column(
                    children: <Widget>[
                      JwellaryColorAndSize(jewellery: jewellery,),
                      SizedBox(height: kDefaultPaddin/2,),
                      JwellaryDescription(jewellery: jewellery,),
                      SizedBox(height: kDefaultPaddin/2,),
                      CounterWithSaveBtn(),
                      Padding(
                          padding: const EdgeInsets.symmetric(vertical: kDefaultPaddin),
                          child:Row(children: [
                            Container(
                              margin: EdgeInsets.only(right: kDefaultPaddin),
                              height: 50,width: 58,
                              decoration: BoxDecoration(
                                  borderRadius: BorderRadius.circular(18),
                                  border: Border.all(
                                    color: jewellery.color,)),child: IconButton(icon: Icon(
                              Icons.add_shopping_cart_outlined,color: jewellery.color,),onPressed: (){},),
                            ),
                            Expanded(
                              child: SizedBox(
                                height: 50,
                                child: FlatButton(
                                  shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(18)),
                                  color: jewellery.color,
                                  onPressed: (){},child: Text("Buy Now".toUpperCase(),
                                  style: TextStyle(fontSize: 17,
                                      fontWeight: FontWeight.bold,color: Colors.white),),),
                              ),
                            ),
                          ],)


                      )],
                  ),
                ),
                JwellaryTitleWithImage(jewellery: jewellery)
              ],
            ),
          )
        ],
      ),
    );
  }
}
