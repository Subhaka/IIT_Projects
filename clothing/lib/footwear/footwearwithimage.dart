import 'package:clothing/footwear/Footwear.dart';
import 'package:flutter/material.dart';
import '../constants.dart';


class  FootWearTitleWithImage extends StatelessWidget{
  const FootWearTitleWithImage({
    Key key,
    @required this.footWear,
  }):super(key: key);
  final FootWear footWear;
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(horizontal: kDefaultPaddin),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: <Widget>[
          Text("Ladies FootWear",style: TextStyle(color: Colors.white),
          ),
          Text(footWear.title,style: Theme.of(context).textTheme.headline4.copyWith(
              color: Colors.white,fontWeight: FontWeight.bold),),
          // SizedBox(height: kDefaultPaddin/28,),
          Row(children:<Widget> [
            RichText(text: TextSpan(children: [
              TextSpan(text: "Price\n"),
              TextSpan(text: "\$${footWear.price}",style: Theme.of(context).textTheme.headline3.copyWith(
                  color: Colors.white,fontWeight: FontWeight.bold))
            ])),
            SizedBox(width: kDefaultPaddin,),
            Expanded(
                child:Hero(
                    tag: "${footWear.id}",
                    child:Image.asset(footWear.image,fit: BoxFit.fill,)))

          ],)
        ],
      ),
    );
  }

}