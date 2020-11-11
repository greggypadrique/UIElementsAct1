package com.example.uielementsact1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        //get data from intent
        val intent = intent
        val fname = intent.getStringExtra("First Name")
        val lname = intent.getStringExtra("Last Name")
        val age = intent.getStringExtra("Age")
        val birth = intent.getStringExtra("Birthdate")
        val email = intent.getStringExtra("Email Address")
        val phone = intent.getStringExtra("Phone Number")


        //textview
        val result = findViewById<TextView>(R.id.result)
        //setText
        result.text = "First Name: "+fname+"\n\nLast Name: "+lname+"\n\nAge: "+ age+"\n\nBirthdate: "+ birth +"\n\nEmail: "+email +"\n\nPhone: "+phone
    }
}