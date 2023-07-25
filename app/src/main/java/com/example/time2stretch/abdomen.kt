package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class abdomen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abdomen)

        val abdomen_one = findViewById<ImageButton>(R.id.abdomen_one)
        val abdomen_two = findViewById<ImageButton>(R.id.abdomen_two)
        val abdomen_three = findViewById<ImageButton>(R.id.abdomen_three)


        //서서 옆으로
        abdomen_one.setOnClickListener(){
            val intent = Intent(this@abdomen, abdomen1::class.java)
            startActivity(intent)
        }

        //바이시클
        abdomen_two.setOnClickListener(){
            val intent = Intent(this@abdomen, abdomen2::class.java)
            startActivity(intent)
        }

        //플랭크
        abdomen_three.setOnClickListener(){
            val intent = Intent(this@abdomen, abdomen3::class.java)
            startActivity(intent)
        }

    }
}