package com.example.ac_study

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTimeButton()

    }

    private fun setTimeButton() {
        time_button.setOnClickListener {
            time_button.visibility=View.INVISIBLE
            Handler().postDelayed({
                time_button.visibility = View.VISIBLE
            }, 1000)
        }
    }


    private fun getCurrentTime(): String {
        return Calendar.getInstance().getTime().toString()
    }

    private fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT /* 보여주는 시간*/).show()
    } //인자에 해당하는 토스트 메시지(String형) 출력.

}