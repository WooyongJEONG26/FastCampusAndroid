package org.techtown.myapplication.Kotlin

// 11. Control flow when practice

fun main(args: Array<String>) {

    val value: Int? = null

    when (value) {
        null -> println("value is Null")
        else -> println("Value is not null")
    }

    // Tips: better to think of all the possible outcomes
    val value2: Boolean? = null
    when (value2) {
        true -> {
            println("")
        }
        false -> {
            println("")
        }
        null -> {
            println("")
        }
    }

    // when condition statement has return statement
    // have to return for any condition
    val value3 = when (value2) {
        true -> 1
        false -> 3
        null -> -1
    }

    val value4: Int = 10
    when (value4) {
        // is return data type of variable
        is Int -> println("value4 is int")
        else -> println("value4 is not int")
    }

    val value5: Int = 87
    // .. is range
    // 1 .. 5 12345
    when (value5) {
        in 60..70 -> {
            println("value is in 60 - 70")
        }
        in 70..80 -> {
            println("value is in 70 - 80")
        }
        in 80..90 -> {
            println("value is in 80 - 90")

        }
    }
}