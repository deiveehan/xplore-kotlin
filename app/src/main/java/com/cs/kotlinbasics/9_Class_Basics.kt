package com.cs.kotlinbasics

fun main() {
   var deivee = Person("Deiveehan", "Nallazhagappan")
    deivee.printPerson()
    deivee.printHobby()

    var john = Person(lastName = "Samuel")
    john.hobby = "Skiing"
    john.printPerson()
    john.printHobby()

    var ramasamy = Person("Ramasamy", "Muthu", 33)
    ramasamy.printPerson()
    ramasamy.printHobby()
    ramasamy.printAge()

}

class Person(firstName: String = "John", lastName: String = "Doe") {
    // Member variables - Properties
    var age : Int? = null
    var hobby: String = "Watch Prime video"
    init {
        println("Person created $firstName $lastName")
    }

    // Member secondary constructor
    constructor(firstName: String, lastName: String, age: Int): this(firstName, lastName) {
        this.age = age
    }

    // Member function
    fun printPerson() {
        println("Function ")
    }
    // Member function
    fun printAge() {
        println("Age $age ")
    }
    fun printHobby() {
        println("My hobby is : $hobby")
    }
}