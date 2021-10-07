package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("First","onCreate method called")

        first_button.setOnClickListener {
        val intent =Intent(applicationContext,SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i("First","onStart method called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("First","onResume method called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("First","onPause method called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("First","onStop method called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("First","onDestroy method called")

    }




}