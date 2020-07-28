package org.techtown.myapplication.Kotlin

// 12. Array
// Collection of something(but there is a collection)
// We can group related data


fun main(array:Array<String>){

    // How to make an array 1
    // var varName = arrayOf<DataType>(value)
    var group1 = arrayOf<Int>(1,2,3,4,5)
    println(group1 is Array)

    // How to make an array 2
    // can have different types of element
    var group2 = arrayOf(1,2,3,4,5, "Fuck you")

    // How to get element of an array
    // arrayEx.get(index)
    // index always start with 0
    // can use built in function .get(index) .set(index,newValue)
    // or using array[index]
    val element1: Int = group1.get(0)
    val element2: Int = group1.get(4)
    println(element1)
    println(element2)

    val test3 = group1[0]
    println(test3)
    group1.set(0,100)
    println(group1[0])
    group1[0] = 200
    println(group1[0])
}