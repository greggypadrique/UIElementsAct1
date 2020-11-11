package com.example.uielementsact1


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val picker: DatePicker = findViewById<DatePicker>(R.id.calendarView) as DatePicker
        var birthdate = "${picker.month}/${picker.dayOfMonth}/${picker.year}"
        picker.init( 1999, 12, 20, object : DatePicker.OnDateChangedListener{
            override fun onDateChanged(view: DatePicker?, year: Int, monthOfYear: Int, dayOfMonth: Int) {
               birthdate = "${picker.month}/${picker.dayOfMonth}/${picker.year}"
            }
        })


        submitBtn.setOnClickListener {

            val birth = birthdate.toString()

            val i = Intent(this@SecondActivity, ThirdActivity::class.java)
            i.putExtra("First Name", intent.getStringExtra("First Name"));
            i.putExtra("Last Name", intent.getStringExtra("Last Name"));
            i.putExtra("Age", intent.getStringExtra("Age"));
            i.putExtra("Email Address", intent.getStringExtra("Email Address"));
            i.putExtra("Phone Number", intent.getStringExtra("Phone Number"));

            i.putExtra("Birthdate", birth)

        startActivity(i)

        }
    }
}