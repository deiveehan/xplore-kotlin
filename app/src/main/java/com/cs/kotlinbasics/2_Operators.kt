package com.cs.kotlinbasics

fun main() {
    println("-------- Operators (Kotlin) ----------")
    var result = 3+2
//    result = result/2
    result *= 2
    println("Result $result")
    result = 15%2
    println("Modulus of 15 mod 2 $result")

    var isEqual = 5==3
    println("5 is equal to 3 ? : $isEqual")

    println("Sq: ${-5 > 3}")

    var myNumber = 5
    myNumber++

    println("MyNumber: $myNumber")
    myNumber+=3
    println("MyNumber: $myNumber")
}