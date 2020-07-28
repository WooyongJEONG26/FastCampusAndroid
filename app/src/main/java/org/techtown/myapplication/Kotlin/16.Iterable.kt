package org.techtown.myapplication.Kotlin

// 16. Iterable

fun main(array: Array<String>) {
    // list can be iterated
    // which mean it's iterable
    val a = mutableListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // how to iterate 1
    println("how to iterate 1")
    for (item in a) {
        if (item == 5) {
            println("item is five")
        } else {
            println("item is not five")
        }
    }
    println()

    // how to iterate 2
    println("how to iterate 2")
    for ((index, item) in a.withIndex()) {
        println("index : " + index + " value: " + item)
    }

    println()

    // how to iterate 3
    println("How to iterate 3")
    // lambda style iteration
    // got to remember this format
    a.forEach{
        println(it)
    }

    println()
    // How to iterate 4
    println("How to iterate 4")
    a.forEach { item ->
        println(item)
    }
    println()
    println("forEach usage with index, item")
    // forEach usage
    a.forEachIndexed { index, item ->
        println("index : " + index + " value: " + item)
    }

    println()
    println("How to iterate 6")
    println("a.size: "+ a.size)
    // until 0 to (a.size - 1)
    for (i in 0 until a.size){
        println(a.get(i))
    }
    println()
    println("iteration with step()")
    for ( i in 0 until a.size step(2)){
        println(i)
    }

    // how to iterate 7
    println("how to iterate 7")
    for ( i in a.size -1 downTo(0)){
        // 8 to 0
        println(i)
    }
    println("with step()")
    // how to iterate 9
    for (i in a.size -1 downTo(0) step(2)){
        println(i)
    }

    // how to iterate 10
    println("how to iterate 10")
    for (i in 0..10){
        println(i)
    }
    // until vs ..
    // until not inclusive
    // .. inclusive

    // fuck this
    // how to iterate 11
    println("How to iterate 11")
    var b: Int = 0
    var c: Int = 4

    while(b<c){
    // while condition statement is true keep iterating
    // So there must be something to stop iteration
        b++
        println("b")
    }

    // while 2
    println("while statement 2")
    b = 0
    do {
        println("Hello")
    } while (b < c)
    // difference of one iteration and multiple iteration
    // and whether Kotlin proceed statement or not
    
}