package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_number_detail.*

class numberDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_number_detail)

        getPersonInfo()

        // onBackPressed()
        back.setOnClickListener{
            onBackPressed()
        }

    }


    // getting info from an intent
    // and setting textView based on retrieved info
    fun getPersonInfo(){
        val name = intent.getStringExtra("name")
        val number = intent.getStringExtra("number")


        number_name.setText(name)
        number_number.setText(number)
    }




}
