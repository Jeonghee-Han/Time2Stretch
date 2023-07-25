package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity



class Leg: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leg)

        val leg_one = findViewById<ImageButton>(R.id.leg_one)
        val leg_two = findViewById<ImageButton>(R.id.leg_two)

        val leg_three = findViewById<ImageButton>(R.id.leg_three)
        val leg_four = findViewById<ImageButton>(R.id.leg_four)

        //와이드 스쿼트

        leg_one.setOnClickListener {
            val intent = Intent(this@Leg, leg1_1::class.java)
            startActivity(intent)
        }
//백런지
        leg_two.setOnClickListener {
            val intent = Intent(this@Leg, leg2::class.java)
            startActivity(intent)
        }

 /*앉아서 햄스트링 */

      leg_three.setOnClickListener {
            val intent = Intent(this@Leg, leg3::class.java)
            startActivity(intent)
        }
//옆으로 누워~

        leg_four.setOnClickListener {
            val intent = Intent(this@Leg, leg4::class.java)
            startActivity(intent)
        }


    }
}