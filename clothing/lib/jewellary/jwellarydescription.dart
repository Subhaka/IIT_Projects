import 'package:clothing/jewellary/jewellery.dart';
import 'package:flutter/material.dart';

import '../constants.dart';


class JwellaryDescription extends StatelessWidget{
  const JwellaryDescription({
    Key key, this.jewellery
  }):super(key: key);
  final Jewellery jewellery;
  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: kDefaultPaddin),
      child: Text(jewellery.description,style: TextStyle(height: 1.5),),
    );
  }

}