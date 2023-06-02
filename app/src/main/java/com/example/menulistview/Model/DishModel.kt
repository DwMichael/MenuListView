package com.example.menulistview.Model



 class Dish(
     private val name: String,
     private val recipe: String,
     private val img: Int,) {

     fun getName(): String = name

     fun getRecipe(): String = recipe

     fun getImg(): Int = img
     override fun toString(): String = name
 }