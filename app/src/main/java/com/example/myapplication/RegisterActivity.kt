package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.utils.showToast
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var registerButton : Button
    private lateinit var nameText: EditText
    private lateinit var userNameText: EditText
    private lateinit var passwordText: EditText
    private lateinit var repeatPasswordText: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        initSpinner()

        registerButton =findViewById(R.id.registerButton)
        nameText = findViewById(R.id.editTextTextPersonName)
        userNameText = findViewById(R.id.editTextTextPersonName2)
        passwordText = findViewById(R.id.editTextTextPassword2)
        repeatPasswordText = findViewById(R.id.editTextTextPassword3)

        registerButton.setOnClickListener(this)


    }

    private fun initSpinner() {
        val spinner: Spinner = findViewById(R.id.spinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.gender_array,
            android.R.layout.simple_spinner_item
        ).also {
            adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter = adapter
        }
    }

    override fun onClick(view: View?) {
        if (view==registerButton){


            val name = nameText.text.toString().trim()
            val userName = userNameText.text.toString().trim()
            val password = passwordText.text.toString().trim()
            val repeatPassword = repeatPasswordText.text.toString().trim()
            val result : Boolean = password == repeatPassword

            if (name.isEmpty()){
                nameText.error="Name required"
                nameText.requestFocus()
                this.showToast("Please Enter First Name")
                return
            }
            if (userName.isEmpty()){
                userNameText.error = "Username required"
                userNameText.requestFocus()
                this.showToast("Please enter the username")
                return
            }
            if (password.isEmpty()){
                passwordText.error="Password required"
                passwordText.requestFocus()
                this.showToast("Please enter the password")

                return
            }
            if (!result){
                passwordText.error = "Password doesn't match!!"
                passwordText.requestFocus()
                this.showToast("You look like sus.")

                return
            }



            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("name",name)
            startActivity(intent)
            finish()
        }
    }
}