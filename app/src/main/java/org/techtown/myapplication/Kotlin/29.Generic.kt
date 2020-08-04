package org.techtown.myapplication.Kotlin

// 29. Generic(제너릭)

// How to use generic

fun main(args: Array<String>){

    // No generic
    val list1 = listOf(1,2,3,4,"fuck")
    val b: String = list1[2].toString()

    // Generic
    // Generic ensures the type (type safe)

    val list2 = listOf<Int>(1,2,3,4,5)
    val c: Int = list2[2]

    // 강한 타입을 체크 할수 있다
    val list3 = listOf(1,2,3,4,"fufufufuck", 3.1)
    val list4 = listOf<Int>(1,2,3,4)
}