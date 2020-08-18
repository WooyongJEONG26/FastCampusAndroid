package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_liabrary.*

class LiabraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_liabrary)

        Glide.with(this@LiabraryActivity)
            .load("https://i.pinimg.com/originals/64/f5/13/64f513085fb15d5abd1588e5bdb70b79.jpg")
            .centerCrop()
            .into(glide)


        Glide.with(this@LiabraryActivity)
            .load("https://i.pinimg.com/originals/64/f5/13/64f513085fb15d5abd1588e5bdb70b79.jpg")
            .centerCrop()
            .into(glide2)

    }
}
