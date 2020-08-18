package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_addview_acitivty.*
import kotlinx.android.synthetic.main.addview_item.*
import org.w3c.dom.Text

class AddviewAcitivty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addview_acitivty)
        val carList = ArrayList<CarForList>()

        for(i in 0 until 100){
            carList.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진"))
        }

        val container = findViewById<LinearLayout>(R.id.addview_container)
        val inflater = LayoutInflater.from(this@AddviewAcitivty)

        for (i in 0 until carList.size) {
           val itemView =  inflater.inflate(R.layout.addview_item, null)
            val carNameView = itemView.findViewById<TextView>(R.id.car_name)
            val carEngineView = itemView.findViewById<TextView>(R.id.car_engine)
            val imageView = itemView.findViewById<ImageView>(R.id.image_nayoun)
            carNameView.setText(carList.get(i).name)
            carEngineView.setText(carList.get(i).engine)
            Glide.with(this@AddviewAcitivty)
                .load("https://i.pinimg.com/originals/64/f5/13/64f513085fb15d5abd1588e5bdb70b79.jpg")
                .centerCrop()
                .into(imageView)
            container.addView(itemView)
        }

    }
}

class CarForList(val name: String, val engine: String){


}