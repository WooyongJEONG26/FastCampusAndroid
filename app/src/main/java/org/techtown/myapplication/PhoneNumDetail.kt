package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_number_detail.*

class PhoneNumDetail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_num_detail)

        getNumberInfo()

        back.setOnClickListener{
            onBackPressed()
        }
    }

    fun getNumberInfo(){
        val name = intent.getStringExtra("name")
        val number = intent.getStringExtra("number")

        number_name.setText(name)
        number_number.setText(number)
    }
}
