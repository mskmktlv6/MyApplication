package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_choose.setOnClickListener{
            var i = (0..1).random()
            if(i == 0){
                txt_result.text = edt_food1.text
            }
            else{
                txt_result.text = edt_food2.text
            }
        }
    }
}