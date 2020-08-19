package org.techtown.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.number_item.*
import org.w3c.dom.Text

class CellphoneList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cellphone_list)
        val numberList = ArrayList<CellNumberList>()


        for (i in 1 until 101){
            numberList.add(CellNumberList(""+ i ,"" + i, "000-0000-0000"))
        }

        val container = findViewById<LinearLayout>(R.id.list_container)
        val inflater = LayoutInflater.from(this@CellphoneList)

        for (i in 0 until numberList.size){
            val itemView = inflater.inflate(R.layout.number_item, null)
            val lastNameView = itemView.findViewById<TextView>(R.id.last_name)
            val fullNameView = itemView.findViewById<TextView>(R.id.full_name)
            lastNameView.setText(numberList.get(i).lastName)
            val fullName : String = numberList.get(i).lastName + " " + numberList.get(i).firstName
            fullNameView.setText(fullName)
            container.addView(itemView)
        }

        contact_info.setOnClickListener{
            val fragmentManager: FragmentManager = supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace()
        }


    }
}



class CellNumberList(val firstName: String, val lastName: String , val cellNumber: String){

}