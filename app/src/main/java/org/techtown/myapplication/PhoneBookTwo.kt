package org.techtown.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class PhoneBookTwo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book_two)
    }

    // dummy phone book
    fun DummyPhoneBook(length: Int = 30, phoneBook2: PhoneBook2) : PhoneBook2{
        for(i in 0 until length){
            val phoneNumber: PhoneNumber2 = PhoneNumber2("" + i +"번째 친구", "" + i + "번째 친구 번호")
            phoneBook2.addNumber(phoneNumber)
        }
        return phoneBook2
    }

    fun CreatingNumberView(phoneBook : PhoneBook2){
        val layoutInflater = LayoutInflater.from(this@PhoneBookTwo)
        val container = findViewById<LinearLayout>(R.id.phonebook_list_container)


        for ( i in 0 until phoneBook.phoneNumberList.size){
            val view = layoutInflater.inflate(R.layout.phonenumber, null)

            val phoneNumberElement = view.findViewById<TextView>(R.id.phoneNumber_name)
            phoneNumberElement.setText(phoneBook.phoneNumberList.get(i).name)
            container.addView(view)
        }
    }


    fun addSetOnClickListener(number: PhoneNumber2, view : View){
        view.setOnClickListener {
            val intent = Intent(this@PhoneBookTwo, PhoneNumDetail::class.java)
            intent.putExtra("name", number.name)
            intent.putExtra("number", number.number)
            startActivity(intent)
        }
    }
}


class PhoneBook2(){

    val phoneNumberList = ArrayList<PhoneNumber2>()

    fun addNumber(number : PhoneNumber2){
        phoneNumberList.add(number)
    }
}

class PhoneNumber2(var name: String,var number: String){

}
