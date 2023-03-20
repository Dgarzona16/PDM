package com.dgarzona.bmi.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import org.w3c.dom.Text
import kotlin.math.roundToInt
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    lateinit var weight : TextView
    lateinit var height : TextView
    private lateinit var calculate : Button
    lateinit var result : TextView
    lateinit var status : TextView
    private var BMI = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        binding()

        evenList()
    }

    private fun showResult() {
        result.text = BMI.toString()

        when (true){
            (BMI < 18.5) -> {
                status.text = "Underweight"
                status.setTextColor(ContextCompat.getColor(this, R.color.under_weight))
            }
            (BMI > 18.5 && BMI < 24.99) -> {
                status.text = "Healthy"
                status.setTextColor(ContextCompat.getColor(this, R.color.normal_weight))
            }
            (BMI > 25 && BMI < 29.99) -> {
                status.text = "Overweight"
                status.setTextColor(ContextCompat.getColor(this, R.color.over_weight))
            }
            else -> {
                status.text = "Obese"
                status.setTextColor(ContextCompat.getColor(this, R.color.obese))
            }
        }
    }

    private fun binding() {
        weight = findViewById(R.id.weight_value)
        height = findViewById(R.id.height_value)
        calculate = findViewById(R.id.action_calculate)
        result = findViewById(R.id.result_txt)
        status = findViewById(R.id.status_txt)
    }

    private fun evenList() {
        calculate.setOnClickListener {
            if (weight.text.isEmpty() || height.text.isEmpty()){
                Toast.makeText(this, "Error: Empty Fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            BMI = calBMI()

            showResult()
        }
    }

    private fun calBMI(): Double {
        var heightInMeter = height.text.toString().toDouble() / 100
        return ((weight.text.toString().toDouble() / Math.pow(heightInMeter, 2.0))*100).roundToInt() / 100.0
    }
}