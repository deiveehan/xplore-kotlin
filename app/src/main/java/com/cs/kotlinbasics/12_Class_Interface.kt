package com.cs.kotlinbasics

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake() {
        println("Drivable is braking")
    }
}

open class Carr(override val maxSpeed: Double, val name: String, val brand: String): Drivable {
    override fun drive() : String {
        return "Driving the interface method drive"
    }
    override fun brake() {
        super.brake()
        println("CARR is braking")
    }
}


fun main() {
    var msda = Carr(240.0, "CX5", "Mazda")
    var result = msda.drive()
    println("Result : $result")
    msda.brake()
}