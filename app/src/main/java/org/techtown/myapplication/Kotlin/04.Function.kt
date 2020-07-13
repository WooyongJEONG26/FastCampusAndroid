package org.techtown.myapplication.Kotlin

// 04. Function
// - FUnction
// - getting specific output from any input


// - how to declare a function
// fun functionName (variable: type, variable: type....): return type{
//     statements
//      return value
// }

fun plus(first: Int, second: Int): Int {
    println(first)
    println(second)
    val result: Int = first + second
    println(result)
    return result

}
// - Function with default
fun plusFive(first: Int, second: Int = 5): Int {
    val result: Int = first + second
    return result
}

// - Function with no return(1)
// Unit is void here
// you can erase unit if you want
fun printPlus(first: Int, second: Int): Unit {
    val result: Int = first + second
    println(result)
}

// Simple declaration of function
// Not recomanded
fun plusShort(first: Int, second: Int) = first + second

// 가변인자를 갖는 함수 선언하는 방법
// Function that can take multiple arguments
fun plusMany(vararg numbers:Int){
    for (number in numbers){
        println(number)
    }
}

fun main(array: Array<String>) {
    val result: Int = plus(10, 10)
    val result2 = plus(first = 20, second = 40)
    println(result)
    println(result2)

    // calling function with default
    val resultFive: Int = plusFive(50)
    println(resultFive)

    val resultFive2: Int = plusFive(50, 19)
    println(resultFive2)

    printPlus(10, 10)

    val result3 = plusShort(10, 10)
    println(result3)

    println()
    plusMany(1,2,3,4,5,6)
}