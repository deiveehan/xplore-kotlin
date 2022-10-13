package com.cs.kotlinbasics

fun main() {
    var x = 1
    while (x < 10) {
        x = x + 1
        println("X value is : $x")
    }


    x = 1

    do {
        println("$x")
        x++

    }while (x< 10)
}