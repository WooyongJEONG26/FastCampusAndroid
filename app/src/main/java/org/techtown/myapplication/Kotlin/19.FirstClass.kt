package org.techtown.myapplication.Kotlin

class Calculator {
    var x: Int
    var y: Int

    constructor(x: Int, y: Int) {
        this.x = x
        this.y = y
    }

    fun addition(inputX: Int, inputY: Int): Int {
        return inputX + inputY
    }

    fun substraction(inputX: Int, inputY: Int): Int {
        return inputX - inputY
    }

    fun division(inputX: Int, inputY: Int): Int {
        return inputX / inputY
    }

    fun multiplication(inputX: Int, inputY: Int): Int {
        return inputX * inputY
    }
}

