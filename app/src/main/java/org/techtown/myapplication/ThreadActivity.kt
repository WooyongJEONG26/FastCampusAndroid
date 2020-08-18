package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_thread.*

class ThreadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)


        val runnable : Runnable = object : Runnable {
            override fun run() {
                Log.d("Thread-1", "Thread is made")
            }
        }
        val thread: Thread = Thread(runnable)

        button.setOnClickListener {
            thread.start()
        }

        // None lambda
        Thread(object: Runnable{
            override fun run() {
                Log.d("Thread-1", "Thread2 is made")
                TODO("Not yet implemented")
            }
        }).start()
        // lambda
        Thread(Runnable{
            Thread.sleep(2000)
            Log.d("Thread-1", "Thread3 is made")
        }).start()



    }
}
