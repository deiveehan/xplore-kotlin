package com.cs.kotlinbasics

fun main() {

    for (i in 1 until 10)
        println("$i")

    for (i in 1 until 10 step 2)
        println("$i")


    for (i in 10 downTo 1)
        println("$i")


    for(num in 1..100) {
        println("$num")
        if (num == 90) {
            print("IT'S OVER 90!!!")
            break
        }
    }
}