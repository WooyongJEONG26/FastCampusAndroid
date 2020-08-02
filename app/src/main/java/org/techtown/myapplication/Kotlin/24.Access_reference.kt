package org.techtown.myapplication.Kotlin

fun main(array: Array<String>){
    val testArray: TestAccess = TestAccess("bs")

    testArray.test()
    println(testArray.name)
    testArray.name = "Holy shit"
    println(testArray.name)

    val reward: Reward = Reward()

}

class Reward(){
    var rewardAmound: Int = 100
}

class TestAccess{
    // if we put private in front of var
    // it cannot be accessed from outside
    // needed if we want certain functions and var not be accessed easily
    var name: String = "WTF"
    constructor(name:String){
        this.name = name
    }

    fun test(){
        println("fuck you")
    }
}

class Running(){
    fun runFast(){

    }

    fun run(){

    }
}