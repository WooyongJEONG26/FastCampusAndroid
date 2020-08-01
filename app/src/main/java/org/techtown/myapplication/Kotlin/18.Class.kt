package org.techtown.myapplication.Kotlin

// 18. Class
// the most important part

// OOP -> Object Oriented Programming

fun main(array: Array<String>) {
    val car1: Car = Car("v2", "FUCK")
    println(car1.engine)
    println(car1.body)

    val superCar: SuperCar = SuperCar(engine = "V8", body = "Fuck", door = "Fuck yeah")

    val fuckCar: Car1 = Car1(engine = "V3", body = "Fuck")
    val fuckCar1: Car1 = Car1(engine = "V3", body = "Fuckfuck", door = "MotherFuck")

    println(fuckCar.door)
    println(fuckCar1.door)
    val fuckCar3: Car2 = Car2(engine = "V3", body = "Fuck")
    val fuckCar4: Car2 = Car2(engine = "V3", body = "Fuckfuck", door = "MotherFuck")
    println(fuckCar3.door)
    println(fuckCar4.door)

    val runnableCar1 : RunableCar = RunableCar("V2", "small")
    // instance method cannot be used until its class been initialized
    runnableCar1.drive()
    runnableCar1.navi("Fairfax")
    runnableCar1.ride()

    //
    val runnableCar2 : RunnableCar2 = RunnableCar2("V3", "Fucking big")
    runnableCar2.drive()
    runnableCar2.navi("My girl friend's house")
    runnableCar2.ride()
}

// how to make a class
// need to make a description first
// After I get used to it
class Car(var engine: String, var body: String) {

}

// how to make a class2
// Use this format until I get used to it
class SuperCar {
    // description aka initialization
    var engine: String
    var body: String
    var door: String

    constructor(engine: String, body: String, door: String) {
        println(engine)
        println(body)
        println(door)
        // initialization
        this.engine = engine
        this.body = body
        this.door = door
    }
}

// How to make a Class 3 -> Extension of first method
class Car1(engine: String, body: String) {
    var door: String = "Default Door"

    constructor(engine: String, body: String, door: String) : this(engine, body) {
        this.door = door
    }
}

// How to make a class 3
class Car2 {
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    constructor(engine: String, body: String) {
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String) {
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunableCar(engin:String, body: String){
    fun ride(){
        println("Broong")
    }

    fun drive(){
        println("Broong Broong")
    }

    fun navi(destination: String){
        println("Heading $destination")
    }
}

class RunnableCar2{
    var engine: String
    var body: String

    constructor(engine: String, body:String){
        this.engine = engine
        this.body = body
    }
    // the first thing that runs after initialization of the class
    // as an instance
    // need to use if it you want to use initialize something
    init{
        println("RunnableCar2 가 만들어 졌습니다.")
    }
    fun ride(){
        println("Broong")
    }

    fun drive(){
        println("Broong Broong")
    }

    fun navi(destination: String){
        println("Heading $destination")
    }
}

// Overloading
// If two functions that has same name can be used if
// each function has different parameters
class TestClass(){
    fun test(){

    }
    fun test(fuckit:String){

    }
}