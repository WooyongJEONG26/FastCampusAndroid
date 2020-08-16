package org.techtown.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent2.*

class Intent2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)

        activity_back.setOnClickListener{
            val fuckyou = intent.getIntExtra("fuckyou3", 0 )
            val fuckyou2 = intent.getIntExtra("fuckyou4", 0)

            Log.d("fuckyou", fuckyou.toString())
            Log.d("fuckyou", fuckyou2.toString())

            // setting result -> aka return
            val result = fuckyou + fuckyou2
            val resultIntent = Intent()
            resultIntent.putExtra("result", result)
            setResult(Activity.RESULT_OK, resultIntent)
            finish() // Activity 종료
        }
    }
}
