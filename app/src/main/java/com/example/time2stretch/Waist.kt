package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class waist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waist)

        val sideone = findViewById<ImageButton>(R.id.sideone)
        val sidetwo = findViewById<ImageButton>(R.id.sidetwo)



        //나비스트레칭
        sideone.setOnClickListener{
            val intent = Intent(this@waist, waist1::class.java)
            startActivity(intent)
        }

        //측면로우번지
        sidetwo.setOnClickListener{
            val intent = Intent(this@waist, waist2::class.java)
            startActivity(intent)
        }



    }
}