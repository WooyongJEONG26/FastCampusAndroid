package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_resource.*

class ResourceActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        val ment = resources.getString(R.string.Hello)
        Log.d("Ment", "ment : "+ ment)


        val ment2= getString(R.string.Hello)
        Log.d("Ment", "ment2: " + ment2)

        val color = getColor(R.color.textView_color)
        Log.d("Ment", "Color : " + color)


        button2.setBackgroundColor(getColor(R.color.textView_color))
    }
}
