package com.speria.calculator_asses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilNum1:TextInputLayout
    lateinit var etNum1:TextInputEditText
    lateinit var tilNum2:TextInputLayout
    lateinit var etNum2:TextInputEditText
    lateinit var btnPlus:Button
    lateinit var btnMinus:Button
    lateinit var btnMultiply:Button
    lateinit var btnDivide:Button
    lateinit var tvResult:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilNum1=findViewById(R.id.tilNum1)
        etNum1=findViewById(R.id.etNum1)
        tilNum2=findViewById(R.id.tilNum2)
        etNum2=findViewById(R.id.etNum2)
        btnPlus=findViewById(R.id.btnPlus)
        btnMinus=findViewById(R.id.btnMinus)
        btnDivide=findViewById(R.id.btnDivide)
        btnMultiply=findViewById(R.id.btnMultiply)
        tvResult=findViewById(R.id.tvResult)
        validation()

        btnMultiply.setOnClickListener {
            val number=etNum1.text.toString().toInt()
            val num=etNum2.text.toString().toInt()
            Multiplication(num,number)
        }
        btnPlus.setOnClickListener {
            val num=etNum1.text.toString().toInt()
            val number=etNum2.text.toString().toInt()
            Addition(num,number)

        }

        btnMinus.setOnClickListener {
            val number=etNum1.text.toString().toInt()
            val num=etNum2.text.toString().toInt()
            Minus(num,number)
        }
        btnDivide.setOnClickListener {
            val num=etNum1.text.toString().toInt()
            val number=etNum2.text.toString().toInt()
            Division(num,number)
        }
    }
    fun validation(){
        var error=false
        tilNum1.error=null
    }
    fun Addition(num: Int,number:Int) {
        val total1=num + number
        tvResult.text= total1.toString()
    }
    fun Multiplication(num: Int,number:Int) {
        val result= number*num
        tvResult.text=result.toString()
    }
    fun Division(num: Int,number:Int) {
        val output=num/number
        tvResult.text=output.toString()
    }
    fun Minus(num: Int,number:Int) {
        val total2 = number-num
        tvResult.text=total2.toString()
    }
}

