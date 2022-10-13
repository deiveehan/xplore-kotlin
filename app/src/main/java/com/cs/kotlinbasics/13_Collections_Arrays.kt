package com.cs.kotlinbasics

fun main() {
    println("Arrays...")

//    var numbers: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var numbers = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    println("numbers: ${numbers.toString()}")

    printArrayVal(numbers)

    println("------ Changing vals ----")
    numbers[0]= 900
    numbers[3] = 345
    numbers[7] = 734

    printArrayVal(numbers)

    var days = arrayOf("Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sunb")
    println(days.contentToString())

    var fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Grape", 2.6))
    println(fruits.contentToString())

    var mixedDataArray = arrayOf("Sun", "Mon", 2.5, 3,2, Fruit("Orange", 5.3), Fruit("Kiwi", 9.2))
    println(mixedDataArray.contentToString())
}

data class Fruit(val name: String, val price: Double)

fun printArrayVal(vals: IntArray) {
    for (element in vals) {
        println(element)
    }
}