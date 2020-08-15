package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calcualtor_t.*

class CalcualtorT : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcualtor_t)


        // new -> old(new+old)
        var new = "0"
        var old = "0"

        one.setOnClickListener {
            new = new + "1"
            resulthere.setText(new)
        }
        two.setOnClickListener {
            new = new + "2"
            resulthere.setText(new)
        }
        three.setOnClickListener {
            new = new + "3"
            resulthere.setText(new)
        }
        four.setOnClickListener {
            new = new + "4"
            resulthere.setText(new)
        }
        five.setOnClickListener {
            new = new + "5"
            resulthere.setText(new)
        }
        six.setOnClickListener {
            new = new + "6"
            resulthere.setText(new)
        }
        seven.setOnClickListener {
            new = new + "7"
            resulthere.setText(new)
        }
        eight.setOnClickListener {
            new = new + "8"
            resulthere.setText(new)
        }
        nine.setOnClickListener {
            new = new + "9"
            resulthere.setText(new)
        }
        zero.setOnClickListener {
            new = new + "0"
            resulthere.setText(new)
        }

        clear.setOnClickListener {
            new = "0"
            old = "0"
            resulthere.setText(old)
        }
        adding.setOnClickListener {
            old = (old.toInt() + new.toInt()).toString()
            new = "0"
            resulthere.setText(old)
        }
    }
}
