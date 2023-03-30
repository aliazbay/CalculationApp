package com.aliazbay.calculationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val editTextNumber2 = findViewById<EditText>(R.id.editTextNumber2)
        val result = findViewById<TextView>(R.id.textView)

        val sum = findViewById<Button>(R.id.sum)
        val sub = findViewById<Button>(R.id.sub)
        val multi = findViewById<Button>(R.id.multi)
        val divide = findViewById<Button>(R.id.divide)

        sum.setOnClickListener() {
            val num1 = editTextNumber.text.toString().toIntOrNull()
            val num2 = editTextNumber2.text.toString().toIntOrNull()
            result.text = sum(num1, num2).toString()}
        sub.setOnClickListener() {
            val num1 = editTextNumber.text.toString().toIntOrNull()
            val num2 = editTextNumber2.text.toString().toIntOrNull()
            result.text = sub(num1, num2).toString()}
        multi.setOnClickListener() {
            val num1 = editTextNumber.text.toString().toIntOrNull()
            val num2 = editTextNumber2.text.toString().toIntOrNull()
            result.text = multi(num1, num2).toString()}
        divide.setOnClickListener() {
            val num1 = editTextNumber.text.toString().toIntOrNull()
            val num2 = editTextNumber2.text.toString().toIntOrNull()
            result.text = divide(num1, num2).toString()}


    }

    fun sum(a: Int? , b: Int?) : Int? {

        if(a != null && b != null){
            return a+b}
        else
        {println("please enter a number")
            return null}
    }

    fun sub(a: Int? , b: Int?) : Int? {

        if(a != null && b != null){
            return a-b}
        else
        {println("please enter a number")
            return null}
    }
    fun multi(a: Int? , b: Int?) : Int? {

        if(a != null && b != null){
            return a*b}
        else
        {println("please enter a number")
            return null}
    }
    fun divide(a: Int? , b: Int?) : Int? {

        if(a != null && b != null){
            return a/b}
        else
        {println("please enter a number")
            return null}
    }

}

