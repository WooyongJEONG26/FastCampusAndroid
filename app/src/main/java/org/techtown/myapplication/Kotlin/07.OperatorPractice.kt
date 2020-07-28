package org.techtown.myapplication.Kotlin

fun main(array:Array<String>){

    var a = 10 +1
    var b = (10 - 1)
    var c = 1 * 9
    var d = 20/3
    var e = 20%3

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    // 대입연산자
    val f = 5
    println(f)

    // 복합 대입 연산자
    a += 10
    b -= 10
    c *= 4
    d /= 1
    e %= 2
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    a++
    b--
    println(a)
    println(b)

    var g = a > b
    var h = (a != b)
    var i = !(h)
    println()
    println(g)
    println(h)
    println(i)

    // 논리연산자
    var j = h&& i
    var k = h || i
    println(j)
    println(k)
}