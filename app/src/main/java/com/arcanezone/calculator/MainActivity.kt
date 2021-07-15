package com.arcanezone.calculator

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var textFirstLine: TextView
    lateinit var textSecondLine: TextView

    lateinit var btn0: Button
    lateinit var btn1: Button
    lateinit var btn2: Button
    lateinit var btn3: Button
    lateinit var btn4: Button
    lateinit var btn5: Button
    lateinit var btn6: Button
    lateinit var btn7: Button
    lateinit var btn8: Button
    lateinit var btn9: Button
    lateinit var btnC: Button
    lateinit var btnBracket: Button
    lateinit var btnPercentage: Button
    lateinit var btnDiv: Button
    lateinit var btnMul: Button
    lateinit var btnAdd: Button
    lateinit var btnSub: Button
    lateinit var btnEqual: Button
    lateinit var imgDelete:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textFirstLine = findViewById(R.id.FirstLine)
        textSecondLine = findViewById(R.id.secondLine)

        btn0 = findViewById(R.id.button0)
        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
        btn4 = findViewById(R.id.button4)
        btn5 = findViewById(R.id.button5)
        btn6 = findViewById(R.id.button6)
        btn7 = findViewById(R.id.button7)
        btn8 = findViewById(R.id.button8)
        btn9 = findViewById(R.id.button9)

        btnC = findViewById(R.id.buttonC)
        btnBracket = findViewById(R.id.buttonBracket)
        btnPercentage = findViewById(R.id.buttonModulus)

        btnMul = findViewById(R.id.buttonMultiply)
        btnAdd = findViewById(R.id.buttonAdd)
        btnSub = findViewById(R.id.buttonSub)
        btnDiv = findViewById(R.id.buttonDivide)

        btnEqual = findViewById(R.id.buttonEqual)

        imgDelete=findViewById(R.id.imgDelete)

        var mValue1: Int = 0
        var mValue2: Int = 0
        var operator: String = ""
        var result: Int = 0

        btn1.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "1"
            else textFirstLine.text = textFirstLine.text.toString() + "1"
        }
        btn2.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "2"
            else textFirstLine.text = textFirstLine.text.toString() + "2"
        }
        btn3.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "3"
            else textFirstLine.text = textFirstLine.text.toString() + "3"
        }
        btn4.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "4"
            else textFirstLine.text = textFirstLine.text.toString() + "4"
        }
        btn5.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "5"
            else textFirstLine.text = textFirstLine.text.toString() + "5"
        }
        btn6.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "6"
            else textFirstLine.text = textFirstLine.text.toString() + "6"
        }
        btn7.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "7"
            else textFirstLine.text = textFirstLine.text.toString() + "7"
        }
        btn8.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "8"
            else textFirstLine.text = textFirstLine.text.toString() + "8"
        }
        btn9.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "9"
            else textFirstLine.text = textFirstLine.text.toString() + "9"
        }
        btn0.setOnClickListener {
            if (textFirstLine.text.toString() == "0") textFirstLine.text = "0"
            else textFirstLine.text = textFirstLine.text.toString() + "0"
        }
        btnC.setOnClickListener {
            textFirstLine.text = "0"
            textSecondLine.text = "0"
            mValue1 = 0
            mValue2 = 0
        }

        btnAdd.setOnClickListener {
            mValue1 = textFirstLine.text.toString().toInt()
            textSecondLine.text = textFirstLine.text.toString() + "+"
            textFirstLine.text = "0"
            operator = "+"
        }
        btnSub.setOnClickListener {
            mValue1 = textFirstLine.text.toString().toInt()
            textSecondLine.text = textFirstLine.text.toString() + "-"
            textFirstLine.text = "0"
            operator = "-"
        }
        btnMul.setOnClickListener {
            mValue1 = textFirstLine.text.toString().toInt()
            textSecondLine.text = textFirstLine.text.toString() + "×"
            textFirstLine.text = "0"
            operator = "*"
        }
        btnDiv.setOnClickListener {
            mValue1 = textFirstLine.text.toString().toInt()
            textSecondLine.text = textFirstLine.text.toString() + "÷"
            textFirstLine.text = "0"
            operator = "÷"
        }

        btnEqual.setOnClickListener {
            if (textSecondLine.text != "0" )
                mValue2 = textFirstLine.text.toString().toInt()

            when (operator) {
                "+" -> {
                    result = mValue1 + mValue2
                    textFirstLine.text = result.toString()
                    textSecondLine.text = "Answer"
                }
                "-" -> {
                    result = mValue1 - mValue2
                    textFirstLine.text = result.toString()
                    textSecondLine.text = "Answer"
                }
                "*" -> {
                    result = mValue1 * mValue2
                    textFirstLine.text = result.toString()
                    textSecondLine.text = "Answer"
                }
                "÷" -> {
                    if (mValue2 != 0) {
                        result = mValue1 / mValue2
                        textFirstLine.text = result.toString()
                    } else {
                        textFirstLine.text = "Cant be Determined"
                    }

                    textSecondLine.text = "Answer"
                }
            }
        }
        imgDelete.setOnClickListener {
            if (textFirstLine.text!="0")
            textFirstLine.text= textFirstLine.text.substring(0, textFirstLine.text.length - 1)
            else
            {
                textFirstLine.text=textSecondLine.text.substring(0, textSecondLine.text.length - 1)
                textSecondLine.text="0"
            }

        }



    }
}