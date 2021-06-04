import 'package:flutter/material.dart';

class FootWear {
  final String image, title, description;
  final int price, id, size;
  final Color color;

  FootWear(
      {this.image,
      this.title,
      this.description,
      this.price,
      this.id,
      this.color,
      this.size});
}

List<FootWear> footwear = [
  FootWear(
      id: 1,
      image: "assets/footwear1.png",
      title: "Regal",
      description:
          "These pink high heel open-toed sandals will make you look bewitching and exquisite. "
          "These open-toed designs will show off your perfectly polished nails and are perfect for keeping"
          " your feet cool on hot summer days.",
      price: 1240,
      color: Color(0xFFDF006C),
      size: 6),
  FootWear(
      id: 2,
      image: "assets/footwear2.png",
      title: "Clanks",
      description:
          "These pink high heel open-toed sandals will make you look bewitching and exquisite. "
          "These open-toed designs will show off your perfectly polished nails and are perfect for keeping"
          " your feet cool on hot summer days",
      price: 2340,
      color: Color(0xFF008B8B),
      size: 8),
  FootWear(
      id: 3,
      image: "assets/footwear12.png",
      title: "Liberty",
      description:
          "These gold high heel open-toed sandals will make you look bewitching and exquisite. "
          "These open-toed designs will show off your perfectly polished nails and are perfect for keeping"
          " your feet cool on hot summer days",
      price: 4240,
      color: Color(0xFFE8B923),
      size: 6),
  FootWear(
      id: 4,
      image: "assets/footwear4.png",
      title: "Clanks",
      description:
          "These cream high heel open-toed sandals will make you look bewitching and exquisite. "
          "These open-toed designs will show off your perfectly polished nails and are perfect for keeping"
          " your feet cool on hot summer days",
      price: 4540,
      color: Color(0xFFE6A389),
      size: 5),
  FootWear(
      id: 5,
      image: "assets/footwear5.png",
      title: "Regal",
      description:
          "These yellow high heel open-toed sandals will make you look bewitching and exquisite. "
          "These open-toed designs will show off your perfectly polished nails and are perfect for keeping"
          " your feet cool on hot summer days",
      price: 2250,
      color: Color(0xFFFDFF00),
      size: 6),
  FootWear(
      id: 6,
      image: "assets/footwear6.png",
      title: "Liberty",
      description:
          "These silver high heel open-toed sandals will make you look bewitching and exquisite. "
          "These open-toed designs will show off your perfectly polished nails and are perfect for keeping"
          " your feet cool on hot summer days",
      price: 1690,
      color: Color(0xFFD5D5D7),
      size: 6),
  FootWear(
      id: 7,
      image: "assets/footwear7.png",
      title: "Khadims",
      description:
          "These black high heel open-toed sandals will make you look bewitching and exquisite. "
          "These open-toed designs will show off your perfectly polished nails and are perfect for keeping"
          " your feet cool on hot summer days",
      price: 3560,
      color: Color(0xFF000000),
      size: 6),
  FootWear(
      id: 8,
      image: "assets/footwear8.png",
      title: "Khadims",
      description:
          "These red high heel open-toed sandals will make you look bewitching and exquisite. "
          "These open-toed designs will show off your perfectly polished nails and are perfect for keeping"
          " your feet cool on hot summer days",
      price: 2300,
      color: Color(0xFFB20010),
      size: 6),
];
