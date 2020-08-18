package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.activity_fragment.*

class Fragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("life_cycle","Fuck just created" )

        val fragment1: FragmentOne = FragmentOne()

        // How to add data input a fragment
        // got to make a bundle
        val bundle: Bundle = Bundle()
        bundle.putString("Hello","fuckyou")
        fragment1.arguments = bundle


        button.setOnClickListener{
            // Fragment replace/add 추가하는 방법
            // need these two lines of code to make replace view to fragment
            val fragmentManager :FragmentManager = supportFragmentManager


            // also need to implement these to replace container view to fragment
            // Transaction
            // 작업의 단위 -> 시작과 끝이 있다.
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container, fragment1)
            fragmentTransaction.commit()
            // 끝을 내는 방법
            // commit -> 시간 될 때 해
            // commitnow-> 지금 당장해

        }

        button_replace.setOnClickListener {
            // Fragment remove/ detach 재거 방법
            val fragmentManager : FragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.remove(fragment1)
            fragmentTransaction.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("life_cycle","Fuck just started" )
    }

    override fun onResume() {
        super.onResume()
        Log.d("life_cycle","Fuck just resume" )
    }

    override fun onPause() {
        super.onPause()
        Log.d("life_cycle","Fuck just paused" )
    }

    override fun onStop() {
        super.onStop()
        Log.d("life_cycle","Fuck just stopped" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("life_cycle","Fuck just destroyed" )
    }
}
