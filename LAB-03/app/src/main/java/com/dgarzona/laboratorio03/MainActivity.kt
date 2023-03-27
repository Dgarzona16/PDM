package com.dgarzona.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var counter : TextView
    private lateinit var fiveCents : ImageView
    private lateinit var tenCents : ImageView
    private lateinit var quarter : ImageView
    private lateinit var dollar : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        bind()
        listener()
    }

    private fun bind() {
        counter = findViewById(R.id.counter)
        fiveCents = findViewById(R.id.five_cent_img)
        tenCents = findViewById(R.id.ten_cents_img)
        quarter = findViewById(R.id.Quarter_img)
        dollar = findViewById(R.id.dollar_img)
    }

    private fun listener() {
        fiveCents.setOnClickListener { add(0.05) }
        tenCents.setOnClickListener { add(0.10) }
        quarter.setOnClickListener { add(0.25) }
        dollar.setOnClickListener { add(1.00) }
    }

    private fun add(qty: Double) {
        var count = counter.text.toString().toDouble()
        count += qty
        count = (count * 100.0).roundToInt() / 100.0
        counter.text = count.toString()
    }
}