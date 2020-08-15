package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.calculator.*

class CalcualtorPractice : AppCompatActivity() {
    var result_num: Int = 0
    var firstClick: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // bit complicated could be simple
        // by using .toInt(), .toString()
        // still understanding of using built in function for Android got better
        setContentView(R.layout.calculator)
        pad1.setOnClickListener {
            if (firstClick != 0){
                result_num += 1
                firstClick = 0
            } else {
                result_num = 1
            }
            result.setText("" + result_num)
        }

        pad2.setOnClickListener {
            if (firstClick != 0){
                result_num += 2
                firstClick = 0
            } else {
                result_num = 2
            }
            result.setText("" + result_num)
        }

        pad3.setOnClickListener {
            if (firstClick != 0){
                result_num += 3
                firstClick = 0
            } else {
                result_num = 3
            }
            result.setText("" + result_num)
        }

        pad4.setOnClickListener {
            if (firstClick != 0){
                result_num += 4
                firstClick = 0
            } else {
                result_num = 4
            }
            result.setText("" + result_num)
        }

        pad5.setOnClickListener {
            if (firstClick != 0){
                result_num += 5
                firstClick = 0
            } else {
                result_num = 5
            }
            result.setText("" + result_num)
        }

        pad6.setOnClickListener {
            if (firstClick != 0){
                result_num += 6
                firstClick = 0
            } else {
                result_num = 6
            }
            result.setText("" + result_num)
        }
        pad7.setOnClickListener {
            if (firstClick != 0){
                result_num += 7
                firstClick = 0
            } else {
                result_num = 7
            }
            result.setText("" + result_num)
        }

        pad8.setOnClickListener {
            if (firstClick != 0){
                result_num += 8
                firstClick = 0
            } else {
                result_num = 8
            }
            result.setText("" + result_num)
        }

        pad9.setOnClickListener {
            if (firstClick != 0){
                result_num += 9
                firstClick = 0
            } else {
                result_num = 9
            }
            result.setText("" + result_num)
        }

        pad0.setOnClickListener {
            result_num *= 10
            result.setText("" + result_num)
        }


        addition.setOnClickListener {
            firstClick += 1
        }

        ca.setOnClickListener {
            result_num = 0
            result.setText(""+ result_num)
        }
    }
}
