import 'package:flutter/material.dart';

import 'cartcounter.dart';

class CounterWithSaveBtn extends StatelessWidget{
  const CounterWithSaveBtn({
    Key key
  }):super(key: key);

  @override
  Widget build(BuildContext context) {
    return  Row(
      mainAxisAlignment: MainAxisAlignment.spaceBetween,
      children: [
        CartCounter(),
        Container(
            padding: EdgeInsets.all(8),
            height: 32,width: 32,decoration: BoxDecoration(color: Color(0xFFFF6464),shape: BoxShape.circle,),
            child: Image(image: AssetImage("assets/heart.png"),
            )
        )],
    );
  }
}
