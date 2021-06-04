import 'package:flutter/material.dart';
import '../constants.dart';
import 'watch.dart';

class WatchDescription extends StatelessWidget {
  const WatchDescription({Key key, this.watch}) : super(key: key);
  final Watch watch;

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.symmetric(vertical: kDefaultPaddin),
      child: Text(
        watch.description,
        style: TextStyle(height: 1.5),
      ),
    );
  }
}
