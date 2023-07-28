package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity



class wholebody : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wholebody)


        val arm_two = findViewById<ImageButton>(R.id.arm_two)
        val leg_one = findViewById<ImageButton>(R.id.leg_one)
        val abdomen_three = findViewById<ImageButton>(R.id.abdomen_three)
        val arm_four = findViewById<ImageButton>(R.id.arm_four)
//버드독
    arm_two.setOnClickListener {
        val intent = Intent(this@wholebody, arm1::class.java)
        startActivity(intent)
    }
//와이드스쿼트
        // leg_one 버튼 클릭 이벤트 처리
        leg_one.setOnClickListener {
            val intent = Intent(this@wholebody, leg1::class.java)
            startActivity(intent)
        }
//플랭크
        // abdomen_three 버튼 클릭 이벤트 처리
        abdomen_three.setOnClickListener {
            val intent = Intent(this@wholebody, wholebody1::class.java)
            startActivity(intent)
        }
//옆으로~~
        // arm_four 버튼 클릭 이벤트 처리
        arm_four.setOnClickListener {
            val intent = Intent(this@wholebody, leg4::class.java)
            startActivity(intent)
        }


}
}