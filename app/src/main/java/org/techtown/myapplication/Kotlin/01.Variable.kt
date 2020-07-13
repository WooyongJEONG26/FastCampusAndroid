package org.techtown.myapplication.Kotlin

// 01. Variable -> 변수
// -> A box
//  - Variable it can be modified
//  - Value it cannot be modified

// how to declare a variable
// var/val name of variable = value
// Variable/Value

var num = 10
var hello = "Fuck you"
var point = 3.4

val fix = 20



fun main(args:Array<String>){

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Fuck yall"
    point = 11000.111


    println(num)
    println(hello)
    println(point)
    println(fix)

}