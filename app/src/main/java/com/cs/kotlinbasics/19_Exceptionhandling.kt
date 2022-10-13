package com.cs.kotlinbasics

fun main() {
    var a = 10
    var b = 0
    try {
        var result = a/b

    } catch (e: ArithmeticException ) {
        println(e.toString()b)
    }
}