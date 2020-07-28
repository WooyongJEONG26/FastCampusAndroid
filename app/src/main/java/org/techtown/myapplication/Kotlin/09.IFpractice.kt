package org.techtown.myapplication.Kotlin

fun main(args: Array<String>) {
    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null) {
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }


    // 엘비스 연산자
    // 자주 사용할듯
    // can deal with null
    val number: Int? = 100
    // if number is null number2 will be assigned with 10
    // val variable = otherVariable?: value
    // ? means null if it is not null assigned number2 with 100
    val number2 = number ?: 10
    println()
    println(number2)

    // if I want to assign variable with null
    // there should be ? after type declaration
    val test : Int? = null
    val canHaveNull: Int? = 100
    // if canHaveNull is null assign 10
    // if not assign the value of canHaveNull
    val haveNull: Int? = canHaveNull ?: 10
    println("Practice")
    println(haveNull)

    val num1: Int = 10
    val num2: Int = 20

    // if statement with return statement have to return something
    val max = if (num1 > num2) {
        a // 10
    } else if (num1 == num2) {
        b // 20
    } else {
        10000
    }


}