package com.cs.kotlinbasics

// All class in kotlin are final by default, make it open to inherit
open class Vehicle {
}

open class Car( val name: String, val brand: String) {
    open var range: Double = 0.0
    fun extendRange(amount: Double) {
        if(amount > 0) {
            range += amount
        }
    }

    open fun drive(distance: Double) {
        println("Drove my $name $brand for $distance kms")
    }
}

class ElectricCar(name: String, brand: String, batteryLife: Double) : Car(name, brand) {
    var chargerType = "Type1"

    override var range = batteryLife * 6
    override fun drive(distance: Double) {
        println("Drove my $name $brand with Electricity for $distance kms with range $range")

    }
}


fun main() {
    var mazda = Car("CX5", "Mazda")
    var tsla = ElectricCar("S-Model", brand = "TSLA", batteryLife = 85.0)

    mazda.drive(200.0)
    tsla.drive(200.0)
    tsla.extendRange(50.0)
    tsla.drive(300.0)
    tsla.chargerType="Type2"

}