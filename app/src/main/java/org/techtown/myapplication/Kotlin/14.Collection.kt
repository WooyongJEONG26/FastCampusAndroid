package org.techtown.myapplication.Kotlin

// 14. Collection
// similar to array
// -> list, set, map
// Collection does not allowed modification later

fun main(array: Array<String>){
    // Immutable Collection
    // List
    // Duplication okay
    val numberList = listOf<Int>(1,2,3,4,4,4,4,4,4)
    println("List")
    println(numberList)
    println(numberList.get(0))
    println(numberList[1])

    // Set
    // No duplication
    // there is no index
    val numberSet = setOf<Int>(1,2,3,3,3)
    println("Set")
    println(numberSet)
    numberSet.forEach {
        println(it)
    }

    // Map -> Key, value like dictionary
    val numberMap  = mapOf<String, Int>(
        "One" to 1, "Two" to 2
    )
    // for Map key replace index
    println("Map")
    println(numberMap.get("One"))


    // Mutable collection
    // List
    val mNumberList = mutableListOf<Int>(1,2,3)
    mNumberList.add(3,4)
    println("Mutable list")
    println(mNumberList)

    // set
    val mNumberSet = mutableSetOf<Int>(1,2,3,4,5,5,5,5)
    mNumberSet.add(19)
    println("Mutable set")
    println(mNumberSet)


    val mNumberMap = mutableMapOf<String, Int>(
        "One" to 1
    )
    println("Mutable Map")
    mNumberMap.put("Two", 2)
    println(mNumberMap)

}