package org.techtown.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_practice2.*

class Practice2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practice2)

        send.setOnClickListener {
            val inputString:String ="http://" + address.getText().toString()
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(inputString))
            startActivity(intent)
        }
    }
}
