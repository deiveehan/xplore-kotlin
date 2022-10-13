package com.ca.kotlinbasics

fun main() {
    val months = listOf("Jan", "Feb", "Mar")
    val anyTypes = listOf(1,2,3, true, false, "STringval")

    print(anyTypes.size)

    println(months[2])
    for (month in months) {
        println("Month : $month")
    }

}