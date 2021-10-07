package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private lateinit var secondButton : Button
    private lateinit var nameText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.i("Second","onCreate method called")

        secondButton = findViewById(R.id.second_button)
        nameText = findViewById(R.id.textView2)
        val name = intent.getStringExtra("name")
        nameText.text = "Welcome, $name"



        secondButton.setOnClickListener {
            val intent = Intent(this,RegisterActivity::class.java)
            startActivity(intent)
        }
        Toast.makeText(this,"Hello $name",Toast.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i("Second","onStart method called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Second","onResume method called")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Second","onPause method called")
    }
    override fun onStop() {
        super.onStop()
        Log.i("Second","onStop method called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Second","onDestroy method called")

    }
}