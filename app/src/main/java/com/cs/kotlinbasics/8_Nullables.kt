package com.cs.kotlinbasics

fun main() {
    var name: String = "Denis"
    // name = null // Compilation rror
    var nullableName: String? = "Samson"
    nullableName = null
    println("Mullable name: " + nullableName)
    var len = name.length
    var nullablelen = nullableName?.length

    println("Len : $len")
    println("NullableName : $nullableName")
    println("Chars nullable name:" + nullableName?.chars() )

    var nameValue = nullableName?: "Deiveehan"
    println("Namevalue: " + nameValue)

    // Forcing exception
    println("Chars nullable name:" + nullableName!!.toString() )

}