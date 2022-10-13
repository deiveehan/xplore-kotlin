package com.cs.kotlinbasics

fun main() {
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[2])

    for (key in daysOfTheWeek.keys)
        println(daysOfTheWeek[key])
}