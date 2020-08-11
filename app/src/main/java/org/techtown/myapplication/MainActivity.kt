package org.techtown.myapplication



import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // it draws screen
        setContentView(R.layout.final_assignment)

        Log.d("life_cycle","Fuck just created" )
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
