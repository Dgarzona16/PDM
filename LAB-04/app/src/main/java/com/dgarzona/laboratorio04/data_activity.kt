package com.dgarzona.laboratorio04

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class data_activity : AppCompatActivity() {
    lateinit var nameText : TextView
    lateinit var emailText : TextView
    lateinit var numberText : TextView
    lateinit var shareAction : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        bind()
        loadData()
        shareData()
    }

    private fun bind(){
        nameText = findViewById(R.id.name_txt)
        emailText = findViewById(R.id.email_txt)
        numberText = findViewById(R.id.number_txt)
        shareAction = findViewById(R.id.share_action)
    }

    private fun loadData(){
        nameText.text = nameText.text.toString()+ " " + intent.getStringExtra(NAME.toString())
        emailText.text = emailText.text.toString()+ " " + intent.getStringExtra(EMAIL.toString())
        numberText.text =numberText.text.toString()+ " " + intent.getStringExtra(NUMBER.toString())
    }

    private fun shareData(){
        val text = nameText.text.toString() + "\n" + emailText.text.toString() + "\n" + numberText.text.toString()
        shareAction.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT,  text)
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "The title")
            startActivity(Intent.createChooser(shareIntent, "Share..."))
        }
    }

    companion object{
        const val NAME = "NAME"
        const val EMAIL = "EMAIL"
        const val NUMBER = "NUMBER"
    }
}