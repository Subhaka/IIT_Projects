import 'package:flutter/material.dart';

class Watch {
  final String image, title, description;
  final int price, id, size;
  final Color color;

  Watch(
      {this.image,
      this.title,
      this.description,
      this.price,
      this.id,
      this.size,
      this.color});
}

List<Watch> watch = [
  Watch(
      id: 1,
      image: "assets/watch1.png",
      title: "Gucci",
      size: 12,
      description: "Gucci seamaster 8464 gorgeous red watch",
      price: 3000,
      color: Color(0xFFFF0000)),
  Watch(
      id: 2,
      image: "assets/watch2.png",
      title: "Louis Vuitton",
      size: 12,
      description: "Louis Vuitton 4264 gorgeous black watch",
      price: 3000,
      color: Color(0xFF000000)),
  Watch(
      id: 3,
      image: "assets/watch3.png",
      title: "Cartier",
      size: 12,
      description: "Cartier 5473 gorgeous violet watch",
      price: 4500,
      color: Color(0xFF800080)),
  Watch(
      id: 4,
      image: "assets/watch4.png",
      title: "Omega",
      size: 12,
      description: "Omega seamaster aquatera 9605 gorgeous orange watch ",
      price: 4500,
      color: Color(0xFFFF8000)),
  Watch(
      id: 5,
      image: "assets/watch5.png",
      title: "Gucci",
      size: 12,
      description: "Gucci  7526 gorgeous brown watch",
      price: 4500,
      color: Color(0xFF8B4513)),
  Watch(
      id: 6,
      image: "assets/watch6.png",
      title: "Vincero",
      size: 12,
      description: "Vincero 2587 gorgeous blue watch",
      price: 4500,
      color: Color(0xFF000058)),
  Watch(
      id: 7,
      image: "assets/watch7.png",
      title: "Zenith",
      size: 12,
      description: "Zenith 2845 gorgeous grey watch",
      price: 4500,
      color: Color(0xFFA6A6A6)),
  Watch(
      id: 7,
      image: "assets/watch8.png",
      title: "Tudo",
      size: 12,
      description: "Tudo 2064 gorgeous light pink watch",
      price: 4500,
      color: Color(0xFFFFCCD5)),
];
