import 'package:clothing/footwear/Footwear.dart';
import 'package:flutter/material.dart';
import '../colordot.dart';
import '../constants.dart';

class FootWearColorAndSize extends StatelessWidget{
  const FootWearColorAndSize({
    Key key, this.footWear
  }):super(key: key);
  final FootWear footWear;
  @override
  Widget build(BuildContext context) {
    return  Row(
      children: <Widget>[
        Expanded(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [Text("Color"),
              Row(children: <Widget>[
                ColorDot(color: footWear.color,isSelected: true,),
                ColorDot(color: Color(0xFFF8C078)),
                ColorDot(color: Color(0xFFA29B9B),),
              ],)
            ],
          ),
        ),
        Expanded(child:
        RichText(text: TextSpan(
            style: TextStyle(color: kTextColor),
            children:[
              TextSpan(text: "Size\n",),
              TextSpan(text: "\$${footWear.size} ",
                  style: Theme.of(context).textTheme.headline5.copyWith(
                      fontWeight: FontWeight.bold))
            ])))
      ],
    );
  }

}
