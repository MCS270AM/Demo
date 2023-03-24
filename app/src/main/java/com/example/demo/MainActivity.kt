package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isInvisible

public class MainActivity : AppCompatActivity() {
    private lateinit var  mGreeting: TextView
    private lateinit var mGoodbyeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mGoodbyeButton = findViewById(R.id.goodbye_button)
        mGreeting = findViewById(R.id.greeting)
        var temp = false
        mGoodbyeButton.setOnClickListener {
            if(!temp){
                mGoodbyeButton.visibility = View.INVISIBLE
                Toast.makeText(applicationContext, "Invisible", Toast.LENGTH_SHORT).show()
            }
            else {
                mGoodbyeButton.visibility = View.VISIBLE
                Toast.makeText(applicationContext, "Visible", Toast.LENGTH_SHORT).show()
            }
            temp = !temp
        }

    }
}