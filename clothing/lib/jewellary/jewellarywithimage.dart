import 'package:clothing/jewellary/jewellery.dart';
import 'package:flutter/material.dart';
import '../constants.dart';


class  JwellaryTitleWithImage extends StatelessWidget{
  const JwellaryTitleWithImage({
    Key key,
    @required this.jewellery,
  }):super(key: key);
  final Jewellery jewellery;
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          Text("Jewellery",style: TextStyle(color: Colors.white),
          ),
          Text(jewellery.title,style: Theme.of(context).textTheme.headline4.copyWith(
              color: Colors.white,fontWeight: FontWeight.bold),),
          // SizedBox(height: kDefaultPaddin/28,),
          Row(children:<Widget> [
            RichText(text: TextSpan(children: [
              TextSpan(text: "Price\n"),
              TextSpan(text: "\$${jewellery.price}",style: Theme.of(context).textTheme.headline3.copyWith(
                  color: Colors.white,fontWeight: FontWeight.bold))
            ])),
            SizedBox(width: kDefaultPaddin,),
            Expanded(
                child:Hero(
                    tag: "${jewellery.id}",
                    child:Image.asset(jewellery.image,fit: BoxFit.fill,)))

          ],)
        ],
      ),
    );
  }

}