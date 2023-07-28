package com.example.time2stretch

import java.util.*
import android.content.Context
import android.media.MediaPlayer

class TimerActivity(
    private val stretchingTime: Int,
    private val tickCallback: (String) -> Unit,
    private val progressCallback: (Int) -> Unit,
    private val finishCallback: () -> Unit,
    private val context: Context)
{
    private var timer: Timer? = null
    private var time = stretchingTime
    private var isTimerRunning = false // 타이머 동작 여부를 나타내는 변수 추가
    private var bellSound: MediaPlayer? = null

    fun startTimer(durationInSeconds: Int) {
        if (isTimerRunning) {
            time = durationInSeconds
        }
        isTimerRunning = true // 타이머가 시작되었으므로 isTimerRunning을 true로 설정
        timer?.cancel()
        timer = Timer()

        bellSound = MediaPlayer.create(context, R.raw.timerbell)

        timer?.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                if (time == 0) {
                    tickCallback("%02d:%02d".format(0,0))
                    val progress = 0
                    progressCallback(progress)
                    playBellSound()
                    finishCallback()
                    timer?.cancel()
                } else {
                    val min = time / 60
                    val sec = time % 60
                    tickCallback("%02d:%02d".format(min, sec))
                    val progress = 0 + 100 * time / stretchingTime
                    progressCallback(progress)
                    time--
                }
            }
        }, 0, 1000)
    }

    fun pauseTimer() {
        isTimerRunning = false // 타이머가 일시정지되었으므로 isTimerRunning을 false로 설정
        timer?.cancel()
    }

    private fun playBellSound() {
        bellSound?.start()
    }
}