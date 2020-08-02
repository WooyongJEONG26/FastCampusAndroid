package org.techtown.myapplication.Kotlin


fun main(array: Array<String>) {
    val calculator = Calculator1()

    calculator.plus(4, 5)
    calculator.minus(4, 5)
    calculator.divide(4, 6)
    calculator.multiply(4, 5)

    var calculator3 = Calculator3(3)
    // Chaining
    println(calculator3.plus(5).minus(5).multiply(10).divide(111))
}

class Calculator1() {
    fun plus(a: Int, b: Int): Int {
        return a + b
    }

    fun minus(a: Int, b: Int): Int {
        return a - b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun divide(a: Int, b: Int): Int {
        return a / b
    }
}

class Calculator2() {
    fun plus(vararg numbers: Int): Int {
        var result = 0
        numbers.forEach {
            result = result + it
        }
        return result
    }

    fun minus(vararg numbers: Int): Int {
        var result: Int = numbers[0]
        for (i in 1 until numbers.size) {
            result = result - numbers[i]
        }
        return result
    }

    fun multiply(vararg numbers: Int): Int {
        var result: Int = 1
        numbers.forEach {
            if (it != 0) {
                result = result * it
            }
        }
        return result
    }

    fun divid(vararg numbers: Int): Int{
        var result: Int  =  numbers[0]
        numbers.forEachIndexed{ index, value->
            if (index != 0){
                if (value != 0){
                    result = result/value
                }
            }
        }
        return result
    }
}

class Calculator3(var initialValue: Int){

    fun plus(number:Int): Calculator3{
        val result = this.initialValue + number
        return Calculator3(result)
    }

    fun minus(number: Int):Calculator3{
        val result = this.initialValue - number
        return Calculator3(result)
    }

    fun multiply(number: Int): Calculator3{
        val result = this.initialValue * number
        return Calculator3(result)
    }

    fun divide(number: Int): Calculator3{
        val result = this.initialValue/ number
        return Calculator3(result)
    }
}