package com.example.time2stretch

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.ProgressBar
import android.widget.TextView

class abdomen1 : AppCompatActivity() {
    private lateinit var timerUtil: TimerActivity
    private val stretchingTime = 20 // 해당 스트레칭에 맞게 소요 시간 설정
    private var isTimerRunning = false // 타이머 동작 여부를 나타내는 변수 추가
    private lateinit var progressBar2: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_abdomen1)

        progressBar2 = findViewById(R.id.progressBar2)
        progressBar2.max = 100

        // 타이머 초기화
        timerUtil = TimerActivity(
            stretchingTime,
            { time -> // 타이머 tick 콜백
                updateTimer(time)
            },
            { progress ->
                updateProgressBar(progress)
            },
            { // 타이머 종료 콜백
                isTimerRunning = false
            },
            this
        )

        val floatingActionButton7 = findViewById<FloatingActionButton>(R.id.floatingActionButton7)
        val floatingActionButton6 = findViewById<FloatingActionButton>(R.id.floatingActionButton6)
        val floatingActionButton4 = findViewById<FloatingActionButton>(R.id.floatingActionButton4)

        // FAB 클릭 리스너 추가
        floatingActionButton7.setOnClickListener {

            val intent = Intent(this@abdomen1, abdomen2::class.java)
            startActivity(intent)
            timerUtil.pauseTimer()
        }

        floatingActionButton6.setOnClickListener{
            timerUtil.startTimer(stretchingTime)
        }

        floatingActionButton4.setOnClickListener{
            timerUtil.pauseTimer()
        }
    }
    private fun updateTimer(time: String) {
        runOnUiThread {
            val textViewTime = findViewById<TextView>(R.id.textViewTime)
            textViewTime.text = time
        }
    }
    private fun updateProgressBar(progress: Int) {
        runOnUiThread {
            progressBar2.progress = progress
        }
    }
}