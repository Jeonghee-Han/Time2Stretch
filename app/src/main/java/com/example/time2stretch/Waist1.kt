package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class waist1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_waist1)

        val floatingActionButton7 = findViewById<FloatingActionButton>(R.id.floatingActionButton7)

        // FAB 클릭 리스너 추가
        floatingActionButton7.setOnClickListener {

            val intent = Intent(this@waist1, waist2::class.java)
            startActivity(intent)
        }
    }
}
