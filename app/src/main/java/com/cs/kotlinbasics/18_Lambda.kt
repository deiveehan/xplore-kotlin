package com.cs.kotlinbasics

fun main(){
    val result = add(10,33)
    println("Result: $result")

    val subtract: (Int, Int) -> Int = {
        a: Int, b: Int -> a-b
    }
    println(subtract(15, 5))

    // even shorter

    val sub = {a: Int, b: Int -> (a-b)}
    println(sub(25, 5))
}

fun add(a: Int, b: Int): Int {
    return a+ b
}