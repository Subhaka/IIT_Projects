import 'package:clothing/footwear/Footwear.dart';
import 'package:flutter/material.dart';


import '../constants.dart';
import 'dress.dart';

class DressDescription extends StatelessWidget{
  const DressDescription({
    Key key, this.dress
  }):super(key: key);
  final Dress dress;
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: kDefaultPaddin),
      child: Text(dress.description,style: TextStyle(height: 1.5),),
    );
  }

}