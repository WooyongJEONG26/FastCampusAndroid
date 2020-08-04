package org.techtown.myapplication.Kotlin

// if function is not fully implemented class using interface
// have to implement
// while if it is already implemented class does not have to implement

fun main (array: Array<String>){
    val me = Me_()
    me.sleep()
}
interface Person1_ {
    fun eat(){
        println("eating")
    }
    fun sleep(){
        println("sleeping")
    }

    // abstract force us to implement
    abstract fun study()
}

class Me_ : Person1_{
    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sleep() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun study() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class Mom_ : Person1_ {
    override fun eat() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun sleep() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun study() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}