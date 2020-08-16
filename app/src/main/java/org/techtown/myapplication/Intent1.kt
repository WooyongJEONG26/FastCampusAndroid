package org.techtown.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent1.*

class Intent1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent1)


        activity_change.setOnClickListener {
//            val intent = Intent(this@Intent1, Intent2::class.java)
//
//            // Key value way -> sending key and value together
//            intent.putExtra("fuckyou", 1)
//            intent.putExtra("fuckyou2", 2)
//            startActivity(intent)

//            val intent3 = Intent(this@Intent1, Intent2::class.java)
//            // apply
//            // -> intent3 에적용한다 this 라고 표기된 아래에서 intent3 에서 사용된다.
//            intent3.apply {
//                this.putExtra("fuckyou3", 1)
//                this.putExtra("fuckyou4", 3)
//            }
//
//            // startActivity() -> intent with no return
//            // startActivity() -> intent with a return
//            startActivityForResult(intent3, 200)

            // Implicit intent
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com"))
            startActivity(intent)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == 200) {
            Log.d("fuckyou", requestCode.toString())
            Log.d("fuckyou", resultCode.toString())
            val result = data?.getIntExtra("result", 0)
            Log.d("fuckyou", result.toString())

        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}
