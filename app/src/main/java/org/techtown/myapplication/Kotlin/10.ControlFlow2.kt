package org.techtown.myapplication.Kotlin

// 10 제어 흐름

// When

fun main(args: Array<String>){
    val value: Int  = 3
    // result of condition does not have to be True or False
    when (value){
        1 -> {
            println("Value is 1")
        }
        2 -> {
            println("Value is 2")
        }
        3 -> {
            println("Value is 3")
        }
        else ->{
            println("Idk the value")
        }
    }

    if (value == 1){
        println("Value is 1")
    } else if (value ==2){
        println("Value is 2")
    } else if (value == 3){
        println("Value is 3")
    } else {
        println("IDK the value")
    }

    val value2 = when(value){
        1 -> 10
        2 -> 20
        3 -> 30
        else -> 100
    }
    println(value2)
}