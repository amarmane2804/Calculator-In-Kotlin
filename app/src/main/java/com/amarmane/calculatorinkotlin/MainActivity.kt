package com.amarmane.calculatorinkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var edtFirstNumber: EditText
    lateinit var edtSecondNumber: EditText
    lateinit var txtAns: TextView
    lateinit var btnAddition: Button
    lateinit var btnSubtraction: Button
    lateinit var btnMultiplication: Button
    lateinit var btnDivision: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtFirstNumber = findViewById(R.id.edtFirstNumber)
        edtSecondNumber = findViewById(R.id.edtSecondNumber)
        txtAns = findViewById(R.id.txtAns)
        btnAddition = findViewById(R.id.btnAddition)
        btnSubtraction = findViewById(R.id.btnSubtraction)
        btnMultiplication = findViewById(R.id.btnMultiplication)
        btnDivision = findViewById(R.id.btnDivision)

        btnAddition.setOnClickListener {

            val firstNumber: Int; var secondNumber: Int; var ans: Int;

            firstNumber = Integer.parseInt(edtFirstNumber.text.toString())
            secondNumber = Integer.parseInt(edtSecondNumber.text.toString())

            ans = firstNumber + secondNumber

            txtAns.setText("Ans is = " + ans)

        }

        btnSubtraction.setOnClickListener {

            val firstNumber: Int; var secondNumber: Int; var ans: Int;

            firstNumber = Integer.parseInt(edtFirstNumber.text.toString())
            secondNumber = Integer.parseInt(edtSecondNumber.text.toString())

            ans = firstNumber - secondNumber

            txtAns.setText("Ans is = " + ans)

        }

        btnMultiplication.setOnClickListener {

            val firstNumber: Int; var secondNumber: Int; var ans: Int;

            firstNumber = Integer.parseInt(edtFirstNumber.text.toString())
            secondNumber = Integer.parseInt(edtSecondNumber.text.toString())

            ans = firstNumber * secondNumber

            txtAns.setText("Ans is = " + ans)

        }

        btnDivision.setOnClickListener {

            val firstNumber: Int; var secondNumber: Int; var ans: Int;

            firstNumber = Integer.parseInt(edtFirstNumber.text.toString())
            secondNumber = Integer.parseInt(edtSecondNumber.text.toString())

            ans = firstNumber / secondNumber

            txtAns.setText("Ans is = " + ans)

        }

    }
}