package com.example.uielementsact1

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val firstName = findViewById<EditText>(R.id.firstName)
        val lastName = findViewById<EditText>(R.id.lastName)
        val emailAd = findViewById<EditText>(R.id.emailAd)
        val ageEt = findViewById<TextView>(R.id.ageEt)
        val phoneNum = findViewById<EditText>(R.id.phoneNum)
        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val seek = findViewById<SeekBar>(R.id.ageSeekBar)

        findViewById<Switch>(R.id.switchPhone).setOnClickListener { displayStatus(findViewById<Switch>(R.id.switchPhone).isChecked) }

        ageSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar, progress: Int, fromUser: Boolean) {

                ageEt.text = progress.toString()
            }
            override fun onStartTrackingTouch(seek: SeekBar) {
            }
            override fun onStopTrackingTouch(seek: SeekBar) {
            }

        })

        nextBtn.setOnClickListener {

            val fname = firstName.text.toString()
            val lname = lastName.text.toString()
            val email = emailAd.text.toString()
            val age = ageEt.text.toString()
            val phone = phoneNum.text.toString()

            val i = Intent(this@MainActivity, SecondActivity::class.java)
            i.putExtra("First Name", fname)
            i.putExtra("Last Name", lname)
            i.putExtra("Age", age)
            i.putExtra("Email Address", email)
            i.putExtra("Phone Number", phone)
            startActivity(i)
        }
    }
    private fun displayStatus(status: Boolean) {
        phoneNum.setVisibility(if (phoneNum.getVisibility() === View.VISIBLE) View.GONE else View.VISIBLE)

    }
}