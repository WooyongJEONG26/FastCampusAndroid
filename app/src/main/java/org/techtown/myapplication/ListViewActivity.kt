package org.techtown.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)


        val carList = ArrayList<CarForList>()
        for (i in 0 until 10){
            carList.add(CarForList("" +i + "차", "" + i +"엔진"))
        }

        val adapter = ListViewAdapter(carList, LayoutInflater.from(this@ListViewActivity))
        // val adapter = ListViewAdapter(carList, this@ListViewActivity)
        list_view.adapter = adapter
        list_view.setOnItemClickListener { parent, view, position, id ->
            val carName = (adapter.getItem(position) as CarForList).name
            val carEngine= (adapter.getItem(position) as CarForList).engine

            Toast.makeText(this@ListViewActivity, carName + " " + carEngine + "", Toast.LENGTH_SHORT).show()
        }

    }
}

// val layoutInflater: LayoutInflater
class ListViewAdapter(
    val carForList: ArrayList<CarForList>,
    val layoutInflater: LayoutInflater
    ): BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
//       val layoutInflater  = LayoutInflater.from(context)
//        val view = layoutInflater.inflate(R.layout.addview_item, null)
//
//        val carNameTextView = view.findViewById<TextView>(R.id.car_name)
//        val carEngineTextView = view.findViewById<TextView>(R.id.car_engine)
//
//        carNameTextView.setText(carForList.get(position).name)
//        carEngineTextView.setText(carForList.get(position).engine)
//
//        return  view

        val view: View
        val holder: ViewHolder

        if (convertView == null){
            view = layoutInflater.inflate(R.layout.addview_item, null)
            holder = ViewHolder()

            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engine)

            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            view = convertView
        }
        holder.carName?.setText(carForList.get(position).name)
        holder.carEngine?.setText(carForList.get(position).engine)

        return view
    }

    override fun getItem(position: Int): Any {
        return carForList.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return carForList.size
    }
}


class ViewHolder{
    var carName: TextView? = null
    var carEngine: TextView? = null
}