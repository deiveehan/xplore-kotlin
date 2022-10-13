package com.cs.kotlinbasics

fun main() {
    var season = 6

    when(season) {
        1 -> println("Spring")
        2 -> println("Summer")
        3 -> {
            println("Fall")
            println("Autumn")
        }
        4 -> println("Winter")
        else -> println("Enter the season 1-4 correctly")

    }

    var month = 10

    when (month) {
        in 3..5 -> println("Spring")
        in 6..8 -> println("Fall")
        in 9..11 -> println("Fall")
        in 12 downTo 2 -> println("Winter")
    }

    var x : Any = "C"

    when(x) {
        is Int -> println("$x is an inte")
        is Double -> println("$x is a Double")
        is String -> println("$x is String")
        is Boolean -> println("$x is boolean")
        else -> println("I dont know what is x")
    }
}