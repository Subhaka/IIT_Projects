import 'package:clothing/footwear/Footwear.dart';
import 'package:flutter/material.dart';


import '../constants.dart';

class FootWearDescription extends StatelessWidget{
  const FootWearDescription({
    Key key, this.footWear
  }):super(key: key);
  final FootWear footWear;
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: kDefaultPaddin),
      child: Text(footWear.description,style: TextStyle(height: 1.5),),
    );
  }

}