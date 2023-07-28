package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Arm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arm)

        val armone = findViewById<ImageButton>(R.id.armone)
        val armtwo = findViewById<ImageButton>(R.id.armtwo)
        val armthree = findViewById<ImageButton>(R.id.armthree)


        //코브라
        armone.setOnClickListener(){
            val intent = Intent(this@Arm, arm2::class.java)
            startActivity(intent)
        }

        //버드독
        armtwo.setOnClickListener(){
            val intent = Intent(this@Arm, arm1_1::class.java)
            startActivity(intent)
        }

        /* 한팔로~~ */
        armthree.setOnClickListener(){
            val intent = Intent(this@Arm, arm3::class.java)
            startActivity(intent)
        }

    }
}