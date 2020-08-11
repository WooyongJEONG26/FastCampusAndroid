package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)
        // 뷰를 activity 로 가져오는 방법
        //1. 직접 가지고 온다
//        val textView: TextView = findViewById(R.id.fuckyou)
        //2. xml 을 import 해서 가져온다
//        fuckyou

        // 사용자가 클릭했을 때
        // 1. lambda 방식 : 간단하게 쓰인다
        // view 에 setOn~~ 를 이용해서 사용자의 입력 값을 사용가능하다
        fuckyou.setOnClickListener {
            Log.d("click", "fucking clicked")
        }

        // 2. 익명 함수 방식
        fuckyou.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click", "fucking clicked")
            }
        })

        // 3. 이름이 필요한 경우(click)
        val click = object: View.OnClickListener{
            // Interface of OnclickListner
            // thus onClick should be implemented
            override fun onClick(v: View?) {
                Log.d("click", "fucking clicked")
            }
        }

        fuckyou.setOnClickListener(click)
    }
}
