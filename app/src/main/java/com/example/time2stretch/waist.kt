package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class waist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waist)

        val side_one = findViewById<ImageButton>(R.id.side_one)
        val side_two = findViewById<ImageButton>(R.id.side_two)


        //나비 스트레칭
        side_one.setOnClickListener(){
            val intent = Intent(this@waist, waist1::class.java)
            startActivity(intent)
        }

        //측면로우번지
        side_two.setOnClickListener(){
            val intent = Intent(this@waist, waist2::class.java)
            startActivity(intent)
        }



    }
}