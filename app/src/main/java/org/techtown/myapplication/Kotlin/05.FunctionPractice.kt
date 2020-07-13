package org.techtown.myapplication.Kotlin


// creating functions that can add subtract divide and multiply
// addition
fun plusFun(first: Int, second: Int, third: Int): Int {
    val result: Int = first + second + third
    return result
}

// subtraction
fun subsFun(first: Int, second: Int): Int {
    val result: Int = first - second
    return 0
}
// subtratcion simple format
fun subsFun1(first:Int, second:Int, third:Int) = first - second - third

// division
fun divisionFun(first: Int, second: Int): Int {
    val result: Int = first / second
    return result
}

// multiplication
fun multiFun(first: Int = 1, second: Int = 1): Int {
    val result: Int = first * second
    return result
}

// Inner function
fun showMyPlus(first: Int, second: Int): Int{
    println (first)
    println (second)
    fun plus(first: Int, second:Int): Int{
        return first + second
    }
    return plus(first, second)
}

fun main(array: Array<String>) {
    val result1: Int = plusFun(1, 3, 4)
    val result2: Int = subsFun(1, 3)
    val result3: Int = divisionFun(1, 3)
    val result4: Int = multiFun(1, 3)
    val result5: Int = multiFun()

    println(result1)
    println(result2)
    println(result3)
    println(result4)
    println(result5)

    println()
    val result6: Int = showMyPlus(5,5)
    println(result6)

}
