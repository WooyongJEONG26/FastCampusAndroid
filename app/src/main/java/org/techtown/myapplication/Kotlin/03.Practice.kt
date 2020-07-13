package org.techtown.myapplication.Kotlin

var a = 1+2+3+4+5 // 연산의 결과 값을 기입 가능하다
var b = "1"
var c = b.toInt() // c 에는 1이 있다
var d = b.toFloat() // d에는 1.0 이 있다

var e = "John"
var f = "My name is $e Nice to meet you"

// Null : Kotlin is Null safe
// - Value is not existed
// - There are specific type that  can accept Null
// - put ? after data type

var abc1 : Int? = null
var abc2 : Double? = null

var g = a + 3

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(g)
}