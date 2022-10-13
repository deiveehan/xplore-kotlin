package com.cs.kotlinbasics

fun main() {
    println("-------- Datatype (Kotlin) ----------")

    // Char
    var letterChar = 'A'
    println(letterChar)

    // String datatypes
    var name="Deiveehan"
    name = "Nallazhagappan"
    println("Hello " + name)
    println("Name[3]: " + name[3])
    // String interpolation
    println("Interpolation -> NAME: $name")

    // basic datatypes
    val myByte: Byte = 13
    val myShort: Short = 123
    val myInt: Int = 1231234123
    val myLong: Long = 123992883883838838

    // Float and double
    val myFloat: Float = 13.22F
    val myDouble: Double = 13.3223423343433

    // Booleans:
    var isSunny: Boolean = true

    println("Sunny: " + isSunny)

    println(myInt)

}
