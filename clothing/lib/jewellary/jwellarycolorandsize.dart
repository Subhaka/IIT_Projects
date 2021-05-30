import 'package:clothing/jewellary/jewellery.dart';
import 'package:flutter/material.dart';

import '../colordot.dart';



class JwellaryColorAndSize extends StatelessWidget{
  const JwellaryColorAndSize({
    Key key, this.jewellery
  }):super(key: key);
  final Jewellery jewellery;
  @override
  Widget build(BuildContext context) {
    return  Row(
      children: <Widget>[
        Expanded(
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [Text("Color"),
              Row(children: <Widget>[
                ColorDot(color: jewellery.color,isSelected: true,),
                ColorDot(color: Color(0xFFF8C078)),
                ColorDot(color: Color(0xFFA29B9B),),
              ],)
            ],
          ),
        ),
        // Expanded(child:
        // RichText(text: TextSpan(
        //     style: TextStyle(color: kTextColor),
        //     children:[
        //       TextSpan(text: "Size\n",),
        //       TextSpan(text: "\$${jewellery.size} cm",
        //           style: Theme.of(context).textTheme.headline5.copyWith(
        //               fontWeight: FontWeight.bold))
        //     ])))
      ],
    );
  }

}
