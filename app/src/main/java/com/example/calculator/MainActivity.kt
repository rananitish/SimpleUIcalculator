package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

import java.util.ArrayList
import java.util.Collections


import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val add = findViewById<Button>(R.id.add)
        val sub = findViewById<Button>(R.id.sub)
        val mul = findViewById<Button>(R.id.mul)
        val divide = findViewById<Button>(R.id.divide)

        val showBtn = findViewById<Button>(R.id.finalResultBtn)

        var no1 = findViewById<EditText>(R.id.no1)
        var no2 = findViewById<EditText>(R.id.no2)

        var resultView= findViewById<TextView>(R.id.result)

        var answer : Double = 0.0


        add.setOnClickListener{
            var num1 = no1.text.toString().toDouble()
            var num2 = no2.text.toString().toDouble()
            answer = num1 + num2


        }
        showBtn.setOnClickListener{
          //  input.setText(answer.toString())
            resultView.text = answer.toString()
            answer = 0.0
        }


        sub.setOnClickListener(){
            var num1 = no1.text.toString().toDouble()
            var num2 = no2.text.toString().toDouble()
            answer = num1 - num2
            //result.text = answer.toString()

        }

        divide.setOnClickListener(){
            var num1 = no1.text.toString().toDouble()
            var num2 = no2.text.toString().toDouble()
            if(num2!=0.0){
                answer = num1 / num2
            //result.text = answer.toString()
            }else{

                Toast.makeText(this, "Any number cant be divided by 0", Toast.LENGTH_LONG).show()
            }

        }

        mul.setOnClickListener(){
            var num1 = no1.text.toString().toDouble()
            var num2 = no2.text.toString().toDouble()
            answer = num1 * num2
//            result.text = answer.toString()

        }



    }
}