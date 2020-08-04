package org.techtown.myapplication.Kotlin

// 27. Interface
// kind of instruction of what we should implement on inherited class

//class Person(){
//    fun eat(){
//
//    }
//    fun sleep(){
//
//    }
//}
// if function has similar or same function got to use inheritance
// if function has different function but have to be named similarly interface
interface Person_ {
    fun eat()
    fun sleep()
}

class Student_ : Person_{
    override fun eat(){

    }
    override fun sleep(){

    }
}