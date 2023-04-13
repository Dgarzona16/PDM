package com.dgarzona.laboratorio04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var nameInput : EditText
    lateinit var emailInput : EditText
    lateinit var numberInput : EditText
    lateinit var saveAction : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bind()
        saveData()
    }

    private fun bind() {
        nameInput = findViewById(R.id.name_input)
        emailInput = findViewById(R.id.email_input)
        numberInput = findViewById(R.id.number_input)
        saveAction = findViewById(R.id.save_action)
    }

    private fun saveData(){
        saveAction.setOnClickListener {
            val intent = Intent(this, data_activity::class.java)
            intent.putExtra(NAME, nameInput.text.toString())
            intent.putExtra(EMAIL, emailInput.text.toString())
            intent.putExtra(NUMBER, numberInput.text.toString())
            startActivity(intent)
        }
    }

    companion object{
        const val NAME = "NAME"
        const val EMAIL = "EMAIL"
        const val NUMBER = "NUMBER"
    }
}
