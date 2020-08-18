package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NullSafety : AppCompatActivity() {

    lateinit var lateCar : Car

    class Car(){

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)


        val number: Int = 10
        val number1: Int? = null

        val number3 = number1?.plus(number)
//        Log.d("number", "Number3 : " + number3)

        // 삼항연산자 -> 엘비스 연산자(?:)
        // if number1 is null assign number4 with 10
        // if number1 is not null assign value number1 to number4
        val number4 = number1 ?: 10
//        Log.d("number", "number4 : " + number4)


        lateCar = Car()
        Log.d("Car", "Car : true")
    }

    fun plus1(a: Int, b: Int?): Int {
        if (b != null) return a + b
        else return a
    }

    fun plus2(a: Int, b: Int?): Int? {
        return b?.plus(a)
    }
}
