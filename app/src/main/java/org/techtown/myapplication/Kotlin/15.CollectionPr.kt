package org.techtown.myapplication.Kotlin

fun main (array: Array<String>){
    // mutable array
    val a =  mutableListOf<Int>(1,2,3)
    // without index -> append
    println("a.add(4)")
    a.add(4)
    println(a)
    // with index -> insert
    println("a.add(0,100)")
    a.add(0, 100)
    println(a)
    println("a.set(0,2000)")
    a.set(0, 2000)
    println(a)

    // mutable set
    println("Mutalbe set")
    val b = mutableSetOf<Int>(1,2,3,4)
    println("b.add(2)")
    // no need of index
    b.add(2)
    println(b)
    // removing
    println("b.remove(2)")
    println("B.remove(199)")
    b.remove(2)
    b.remove(199)

    val c = mutableMapOf<String, Int>("One" to 1)
    println("Mutable map")
    println("c.put(\"Two\", 2)")
    c.put("Two", 2)
    println(c)
    // replace
    println("c.replace(\"Two\"), 100000")
    c.replace("Two", 1100000)
    println(c)
    println(c.keys)
    println(c.values)
    println(c)
    c.clear()
    println(c)
}