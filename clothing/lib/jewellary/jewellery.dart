
import 'package:flutter/material.dart';

class Jewellery {
  final String image, title, description;
  final int price, id;
  final Color color;

  Jewellery({
    this.id,
    this.image,
    this.title,
    this.description,
    this.price,
    this.color
  });
}

List<Jewellery> jewellery = [
  Jewellery(
    id: 1,
    image: "assets/jwellery_1.png",
    title: "Imitation",
    description: "Beautiful necklace for parties and weddings ",
    price: 1200,
    color: Color(0xFFE60015)
  ),
  Jewellery(
      id: 2,
      image: "assets/jwellery_2.png",
      title: "Imitation",
      description: "Beautiful necklace for parties and weddings",
      price: 1200,
      color: Color(0xFF006F22)
  ),
  Jewellery(
      id: 3,
      image: "assets/jwellery_8.png",
      title: "Gold ",
      description: "Shimmering Bridal necklace which give a stunning look",
      price: 1200,
      color: Color(0xFFDAA520)
  ),
  Jewellery(
      id: 4,
      image: "assets/jwellery_9.png",
      title: "Gold",
      description: "Shimmering Bridal necklace which give a stunning look",
      price: 1200,
      color: Color(0xFF8B0000)
  ),
  Jewellery(
      id: 5,
      image: "assets/jwellery_11.png",
      title: "Diamond",
      description: "Diamond necklace for Receptions ",
      price: 1200,
      color: Color(0xFF000000 )
  ),
  Jewellery(
      id: 6,
      image: "assets/jwellery_3.png",
      title: "Imitation",
      description: "Beautiful necklace for parties and weddings",
      price: 1200,
      color: Color(0xFF23731A)
  ),
  Jewellery(
      id: 7,
      image: "assets/jewellary13.png",
      title: "Imitation",
      description: "Beautiful necklace for parties and weddings",
      price: 1200,
      color: Color(0xFF3CB371)
  ),
  Jewellery(
      id: 8,
      image: "assets/jwellery_14.png",
      title: "Gold",
      description: "Shimmering Bridal necklace which give a stunning look",
      price: 1200,
      color: Color(0xFF000058)
  ),
];
