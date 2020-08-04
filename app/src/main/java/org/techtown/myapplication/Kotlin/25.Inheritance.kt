package org.techtown.myapplication.Kotlin

// Need to refactor if there are multiple same codes
// Inheritance
// child class takes same instruction from mother class

fun main(args: Array<String>){
    val superCar3 : SuperCar3 = SuperCar3();
    superCar3.drive()
    superCar3.stop()
}
// in the case of class private is a default setting
// for the reference
// got to open as a keyword for the reference from child class
// function within class also private so to modify it has to be opened like class
open class Car100(){
    // have to put open keyword too like open keyword in front of class
    open fun drive(): String{
        return "normal speed"
    }

    fun stop(){

    }
}

class SuperCar3(): Car100(){
    override fun drive(): String {
        val run = super.drive()
        return "fucking fast $run"
    }

}

class Bus1(): Car100(){

}