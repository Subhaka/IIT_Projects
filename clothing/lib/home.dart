import 'package:clothing/constants.dart';
import 'package:clothing/watch/watchbody.dart';
import 'package:clothing/footwear/footwearbody.dart';
import 'package:clothing/jewellary/jewellerybody.dart';
import 'package:flutter/material.dart';

import 'handbag/body.dart';

void main() {
  runApp(Home());
}

class Home extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(debugShowCheckedModeBanner: false, home: HomeScreen());
  }
}

class HomeScreen extends StatelessWidget {
  @override
  Widget build(BuildContext context) => DefaultTabController(
      length: 4,
      child: Scaffold(
        appBar: buildAppBar(),
        body: TabBarView(
          children: [
            Body(),
            JewellaryBody(),
            FootWearBody(),
            WatchBody(),
          ],
        ),
      ));
}

AppBar buildAppBar() {
  return AppBar(
    title: Text(
      "Women",
      style: TextStyle(color: Colors.black),
    ),
    backgroundColor: Colors.white,
    elevation: 0,
    leading: IconButton(
      icon: Icon(Icons.arrow_back_outlined),
      onPressed: () {},
      color: kTextColor,
    ),
    actions: <Widget>[
      IconButton(
        icon: Icon(Icons.search),
        onPressed: () {},
        color: kTextColor,
      ),
      IconButton(
        icon: Icon(Icons.shopping_cart_outlined),
        onPressed: () {},
        color: kTextColor,
      ),
      SizedBox(
        width: kDefaultPaddin / 2,
      )
    ],
    bottom: TabBar(
      indicatorColor: Colors.black,
      labelColor: Colors.black,
      labelStyle: TextStyle(fontSize: 13),
      tabs: [
        Tab(
          text: "Hand Bag",
        ),
        Tab(
          text: "Jewellery",
        ),
        Tab(
          text: "FootWear",
        ),
        Tab(
          text: "Watches",
        )
      ],
    ),
  );
}
