package com.example.practical_2


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast



class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext, "onCreate function called.", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onCreate function called.")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart function called.", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onStart function called.")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume function called.", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onResume function called.")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause function called.", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onPause function called.")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop function called.", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onStop function called.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy function called.", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onDestroy function called.")
    }
}