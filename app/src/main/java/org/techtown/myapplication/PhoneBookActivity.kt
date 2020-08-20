package org.techtown.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.PhoneNumberUtils
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class PhoneBookActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_book)

        val phoneBook = createFakePhoneBook(40)
        createPhoneBookList(phoneBook)
    }

    fun createFakePhoneBook(fakeNumber:Int = 10, phoneBook: PhoneBook = PhoneBook()): PhoneBook{
        for (i in 0 until fakeNumber){
            phoneBook.addNumber(PhoneNumber(name = "" + i + " 번째 사람", number = "" + i +" 번째 전화 번호"))
        }

        return phoneBook
    }

    fun createPhoneBookList(phoneBook: PhoneBook){
        val layoutInflater = LayoutInflater.from(this@PhoneBookActivity)
        val container = findViewById<LinearLayout>(R.id.phonebook_list_container)

        for (i in 0 until phoneBook.phoneNumberList.size){
            val view = layoutInflater.inflate(R.layout.phonenumber, null)

            val phoneNumberName = view.findViewById<TextView>(R.id.phoneNumber_name)
            phoneNumberName.setText(phoneBook.phoneNumberList.get(i).name)
            addSetOnClickListener(phoneBook.phoneNumberList.get(i), view)
            container.addView(view)
        }

    }

    fun addSetOnClickListener(number:PhoneNumber, view: View){
        view.setOnClickListener{
            val intent = Intent(this@PhoneBookActivity, numberDetail::class.java)
            intent.putExtra("name", number.name)
            intent.putExtra("number", number.number)
            startActivity(intent)

        }

    }



}


class PhoneBook(){
    // Phone book

    val phoneNumberList = ArrayList<PhoneNumber>()
    fun addNumber(number: PhoneNumber){
        phoneNumberList.add(number)
    }
}


class PhoneNumber(val name:String, var number: String){
    // element of phone book
}