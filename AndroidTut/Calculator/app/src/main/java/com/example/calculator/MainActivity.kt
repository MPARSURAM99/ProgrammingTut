

package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calculator.R
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    private lateinit var num1EditText: EditText
    private lateinit var num2EditText: EditText
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        num1EditText = findViewById(R.id.editTextNumber)
        num2EditText = findViewById(R.id.editTextNumber2)
        resultTextView = findViewById(R.id.textView3)

        val addButton: Button = findViewById(R.id.button3)
        addButton.setOnClickListener { performCalculation('+') }

        val subtractButton: Button = findViewById(R.id.button4)
        subtractButton.setOnClickListener { performCalculation('-') }

        val multiplyButton: Button = findViewById(R.id.button5)
        multiplyButton.setOnClickListener { performCalculation('*') }

        val divideButton: Button = findViewById(R.id.button6)
        divideButton.setOnClickListener { performCalculation('/') }
    }

    @SuppressLint("SetTextI18n")
    private fun performCalculation(operator: Char) {
        val num1Str = num1EditText.text.toString()
        val num2Str = num2EditText.text.toString()

        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            Toast.makeText(this, "Please enter both numbers", Toast.LENGTH_SHORT).show()
            return
        }

        val num1 = num1Str.toDouble()
        val num2 = num2Str.toDouble()
        var result = 0.0

        when (operator) {
            '+' -> result = num1 + num2
            '-' -> result = num1 - num2
            '*' -> result = num1 * num2
            '/' -> {
                if (num2 != 0.0) {
                    result = num1 / num2
                } else {
                    Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show()
                    return
                }
            }
        }

        val df = DecimalFormat("#.##")
        resultTextView.text = "Result: ${df.format(result)}"
    }
}