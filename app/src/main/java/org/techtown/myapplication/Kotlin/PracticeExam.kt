package org.techtown.myapplication.Kotlin

fun first() {
    var group1 = mutableListOf<Int>()
    var group2 = mutableListOf<Boolean>()

    for (i in 0 until 10) {
        group1.add(i)
    }
    group1.forEach { item ->
        if (item % 2 == 0) {
            group2.add(true)
        } else {
            group2.add(false)
        }
    }
    println(group1)
    println(group2)
}

fun second(input: Int) {

    if (input >= 80) {
        println("A")
    } else if (input >= 70) {
        println("B")
    } else if (input >= 60) {
        println("C")
    } else {
        println("F")
    }
}

fun secondT(input: Int): String {
    when (input) {
        in 90..100 -> {
            return "A"
        }
        in 80..89 -> {
            return "B"
        }
        in 70..79 -> {
            return "C"
        }
        else -> {
            return "F"
        }
    }
}

fun third(input: Int):Int {
    val a:Int = input%10
    val b:Int = input/10
    return a + b
}

fun fourth() {
    for (i in 0 until 10) {
        for (j in 0 until 10) {
            val result:Int = i*j
            println("$i x $j = $result")
        }
    }
}

fun main(array: Array<String>) {
    first()
    second(90)
    third(52)
    fourth()
}