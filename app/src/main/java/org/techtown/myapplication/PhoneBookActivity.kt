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


    // creating a fake phone book to as a source for views
    // fakeNumber = variable for amount numbers in the phone book
    // phoneBook = argument that has default setting of instance of PhoneBook class
    // return type = PhoneBook instance
    fun createFakePhoneBook(fakeNumber:Int = 10, phoneBook: PhoneBook = PhoneBook()): PhoneBook{
        for (i in 0 until fakeNumber){
            // keep adding PhoneNumber to phone book
            phoneBook.addNumber(PhoneNumber(name = "" + i + " 번째 사람", number = "" + i +" 번째 전화 번호"))
        }

        return phoneBook
    }

    // createPhoneBookList = function to display phone number of the phone book
    fun createPhoneBookList(phoneBook: PhoneBook){
        // layoutInflater to put layout here at PhoneBookActivity
        // this@PhoneBookActivity context that has related info about this activity
        val layoutInflater = LayoutInflater.from(this@PhoneBookActivity)
        // where the view will be held
        val container = findViewById<LinearLayout>(R.id.phonebook_list_container)

        for (i in 0 until phoneBook.phoneNumberList.size){
            // view = an object of layout phonenumber , root has to be null
            // need it to access other views inside of layout
            val view = layoutInflater.inflate(R.layout.phonenumber, null)

            // phoneNUmberName = an object of view for phonNumber_name where we can access it by findViewById<TextView>(R.id.phoneNumber_name) with view(var)
            val phoneNumberName = view.findViewById<TextView>(R.id.phoneNumber_name)
            // set phoneNumberName text from phoneNumberList element
            phoneNumberName.setText(phoneBook.phoneNumberList.get(i).name)
            // adding setOnClickListener to each view
            addSetOnClickListener(phoneBook.phoneNumberList.get(i), view)
            // add this view to the container
            container.addView(view)
        }

    }

    // addSetOnClickListener = function to put setOnClickListener for each view
    // number = arguement of number instance to access information of the instnace
    // view = argument of to access layout of phonumber
    fun addSetOnClickListener(number:PhoneNumber, view: View){
        // when view is clicked do this bitch
        // need to think of life cycle of activity
        view.setOnClickListener{
            // intent = Intent to put info about context of PhoneBookActivity and numberDetail for where will be sent
            val intent = Intent(this@PhoneBookActivity, numberDetail::class.java)
            // key value format
            intent.putExtra("name", number.name)
            intent.putExtra("number", number.number)
            // startActivity to send intent to numberDetail
            startActivity(intent)

        }

    }



}

// class for Phone book
// have a phonumberList as a ArrayList PhonNumber type variable to add number
// phoneNumberList = ArrayList to put PhoneNumber class's instance
class PhoneBook(){
    // Phone book

    val phoneNumberList = ArrayList<PhoneNumber>()
    // addNumber = function to add PhoneNumber's class instance to phoNumberList
    fun addNumber(number: PhoneNumber){
        phoneNumberList.add(number)
    }
}

// PhoneNumber class creates instance that has name and number
class PhoneNumber(val name:String, var number: String){
    // element of phone book
}