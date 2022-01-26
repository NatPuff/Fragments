package com.example.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

class MainActivity : AppCompatActivity() {

    internal lateinit var Fragmentonebutton: Button
    internal lateinit var ButtonToast: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Fragmentonebutton = findViewById(R.id.button)
        ButtonToast = findViewById(R.id.buttonToast)

        Fragmentonebutton.setOnClickListener { view ->
            supportFragmentManager.beginTransaction().add(R.id.container, FragmentOne()).commit()
        }




    }

}