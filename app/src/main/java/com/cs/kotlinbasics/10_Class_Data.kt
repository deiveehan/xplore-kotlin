package com.cs.kotlinbasics

data class AppUser(val id: Long, var name: String) {
}

fun main() {
    val deivee = AppUser(1, "Deivee")

    var name = deivee.name
    println("Name:  $name")
    deivee.name = "Deiveehan"
    name = deivee.name
    println("Name:  $name")

    println("Deivee obj: $deivee" )

    val updatedDeivee = deivee.copy()
    updatedDeivee.name = "Vasantha Deiveehan "
    println("Vasantha Deivee: $updatedDeivee")
}