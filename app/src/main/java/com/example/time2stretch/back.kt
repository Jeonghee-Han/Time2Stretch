package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class back : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_back)

        val back_one = findViewById<ImageButton>(R.id.back_one)



        //손 머리 위로 들고~
        back_one.setOnClickListener(){
            val intent = Intent(this@back, back1::class.java)
            startActivity(intent)
        }


    }
}