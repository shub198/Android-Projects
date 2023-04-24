package com.example.changetextcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button = findViewById(R.id.button_id)
        val txt:TextView = findViewById(R.id.text_id)

        btn.setOnClickListener(){
            val num = Random().nextInt(6)+1
            val colour = when(num){
                1->R.color.a
                2->R.color.b
                3->R.color.c
                4->R.color.d
                5->R.color.e
                6->R.color.d
                else ->R.color.d
            }

            txt.setTextColor(resources.getColor(colour, null))

        }
    }
}