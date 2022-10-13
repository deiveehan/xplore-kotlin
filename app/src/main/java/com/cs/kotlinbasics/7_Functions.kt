package com.cs.kotlinbasics

fun main() {
    myFirstFunction()
    var result = calc(10, 20)
    println("Result : $result")
}

fun myFirstFunction() {
    println("My first function")
}

fun calc(a: Int, b: Int): Int {
    return (a + b)
}