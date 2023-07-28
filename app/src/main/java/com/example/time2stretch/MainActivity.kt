package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val main_wholebody = findViewById<ImageButton>(R.id.main_wholebody)
        val main_arm= findViewById<ImageButton>(R.id.main_arm)
        val main_leg= findViewById<ImageButton>(R.id.main_leg)
        val main_abdomen= findViewById<ImageButton>(R.id.main_abdomen)
        val main_side= findViewById<ImageButton>(R.id.main_side)
        val main_back= findViewById<ImageButton>(R.id.main_back)


        //전신
        main_wholebody.setOnClickListener(){
            val intent = Intent(this, wholebody::class.java)
            startActivity(intent)
        }

        //팔
        main_arm.setOnClickListener(){
            val intent = Intent(this, Arm::class.java)
            startActivity(intent)
        }

        //다리
        main_leg.setOnClickListener(){
            val intent = Intent(this, Leg::class.java)
            startActivity(intent)
        }

        //복부
        main_abdomen.setOnClickListener(){
            val intent = Intent(this, abdomen::class.java)
            startActivity(intent)
        }

        //허리
        main_side.setOnClickListener(){
            val intent = Intent(this, side::class.java)
            startActivity(intent)
        }

        //등
        main_back.setOnClickListener(){
            val intent = Intent(this, back::class.java)
            startActivity(intent)
        }
    }
}