package com.example.gpa_lopelj_calculator

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.gpa_lopelj_calculator.R.layout

class MainActivity : AppCompatActivity() {

    lateinit var finput: EditText
    lateinit var sinput: EditText
    lateinit var tinput: EditText
    lateinit var ffinput: EditText
    lateinit var linput: EditText
    lateinit var otextv: EditText
    lateinit var mbutton: Button
    lateinit var bgcolor: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        finput = findViewById(R.id.fnumber)
        sinput = findViewById(R.id.snumber)
        tinput = findViewById(R.id.tnumber)
        ffinput = findViewById(R.id.cnumber)
        linput = findViewById(R.id.lnumber)
        bgcolor = findViewById(R.id.bg1color)

        otextv = findViewById(R.id.otv)
        mbutton = findViewById(R.id.button)

        mbutton.setOnClickListener{doCalculation()}

    }

    fun doCalculation(){
        val total: Int = (Integer.parseInt(finput.text.toString())
                + Integer.parseInt(sinput.text.toString())
                + Integer.parseInt(ffinput.text.toString())
                + Integer.parseInt(tinput.text.toString())
                + Integer.parseInt(linput.text.toString()))

        var gpa = total / 5

        if (gpa < 60){
        bgcolor.setBackgroundColor(Color.RED)

        } else if (gpa > 60 && gpa < 80){
        bgcolor.setBackgroundColor(Color.YELLOW)
        }
        else if (gpa > 79 && gpa < 101){
        bgcolor.setBackgroundColor(Color.GREEN)
        }

        otextv.setText("Your GPA is: " + total)

        mbutton.setText("Clear")

    }
}