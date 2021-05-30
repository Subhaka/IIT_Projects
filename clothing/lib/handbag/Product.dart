import 'package:flutter/material.dart';

class Product {
  final String image, title, description;
  final int price, size, id;
  final Color color;

  Product({
    this.id,
    this.image,
    this.title,
    this.price,
    this.description,
    this.size,
    this.color,


  });

}
List<Product>products=[
  Product(
    id: 1,
    title: "Office Code",
    price: 1200,
    size: 12,
    description:"2021 Luxury Handbag tote leather bag for women trendy small chain PU shoulder bag ",
    image:"assets/bag_1.png",
    color:  Color(0xFF000067)
  ),
  Product(
      id: 2,
      title: "Party Code",
      price: 2500,
      size: 10,
      description:"2020 Luxury Handbag tote leather bag for women trendy small chain PU shoulder bag",
      image:"assets/bag_2.png",
      color:  Color(0xFFEE1422)
  ),
  Product(
      id: 3,
      title: "Office Code",
      price: 1350,
      size: 12,
      description:"2019 Luxury Handbag tote leather bag for women trendy small chain PU shoulder bag",
      image:"assets/bag_3.png",
      color:  Color(0xFF262626)
  ),
  Product(
      id: 4,
      title: "Casual Code",
      price: 3500,
      size: 11,
      description:"2020 Luxury Handbag tote leather bag for women trendy small chain PU shoulder bag",
      image:"assets/bag_4.png",
      color:  Color(0xFFFFD100)
  ),
  Product(
      id: 5,
      title: "Office Code",
      price: 4500,
      size: 12,
      description:"2020 Luxury Handbag tote leather bag for women trendy small chain PU shoulder bag",
      image:"assets/bag_5.png",
      color:  Color(0xFF6f4e37)
  ),
  Product(
      id: 6,
      title: "Office Code",
      price: 2900,
      size: 12,
      description:"2020 Luxury Handbag tote leather bag for women trendy small chain PU shoulder bag",
      image:"assets/bag_6.png",
      color:  Color(0xFFA9A9A9)
  ),
  Product(
      id: 7,
      title: "Party Wear",
      price: 2900,
      size: 14,
      description:"Dummy Text",
      image:"assets/bag_7.png",
      color:  Color(0xFFFF1493)
  ),
  Product(
      id: 8,
      title: "Office Code",
      price: 3900,
      size: 12,
      description:"2016 Luxury Handbag tote leather bag for women trendy small chain PU shoulder bag",
      image:"assets/bag_8.png",
      color:  Color(0xFF6b8e23)
  ),


];