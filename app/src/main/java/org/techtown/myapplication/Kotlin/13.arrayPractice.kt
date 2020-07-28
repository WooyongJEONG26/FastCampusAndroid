package org.techtown.myapplication.Kotlin

fun main(array: Array<String>) {
    val array = arrayOf<Int>(1, 2, 3)

    // get set
    // index always start with 0
    val number = array.get(0)
    println(number)
//     index out of range
//    val number2 = array.get(100)
//    same logic apply to .set()
    array.set(0, 100)
    val number2 = array[0]
    println(number2)

    // how to make an array 3
    // Recommended way
    val a1 = intArrayOf(1, 2, 3)
    val a2 = charArrayOf('a', 'b', 'c')
    val a3 = doubleArrayOf(0.0, 1.0)
    val a4 = booleanArrayOf(true, false)

    // how to make an arry 4
    // var arrayName = Array(size: size-1(index), {initial value})
    var a5 = Array(10, { 0 }) // using lambda { 0 }
    var a6 = Array(5, {6})
    println(a6[0])
    println(a6[1])
    println(a6[2])
    println(a6[3])
    println(a6[4])


}