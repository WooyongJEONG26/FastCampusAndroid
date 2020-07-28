package org.techtown.myapplication.Kotlin


// 제어문
// - if, else


fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

    if (a > b) {
        // if the condition is true
        println("a is bigger than b")
    } else {
        // if the  condition is not true
        println("b is bigger than a")
    }
    println("Regardless of the result of if statement")
    // if else else if

    if (a > b) {
        println("b is smaller than a")
    } else if (a < b) {
        println("a is smaller than b")
    } else {
        println("None of the case applied")
    }

    // if statement can return
    var max = if (a < b) {
        a
    } else {
        b
    }

    max = if (a > b) a else b

    println()
    println(max)
}