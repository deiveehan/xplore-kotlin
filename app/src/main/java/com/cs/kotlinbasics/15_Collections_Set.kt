package com.cs.kotlinbasics

fun main() {
    val fruits = setOf("Apple", "Orange" , "Grape", "Apple")
    println(fruits.size)
    for(fruit in fruits ) {
        println("Fruit:  $fruit")
    }
    var newFruits = fruits.toMutableList()
    newFruits.add("Water melon")
    newFruits.add("Pear")
    println(newFruits.elementAt(4))
}