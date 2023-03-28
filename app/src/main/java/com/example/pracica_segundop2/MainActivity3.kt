package com.example.pracica_segundop2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun send (v: View) {
        when (v.getId()) {
            R.id.activity_main3 -> {
                val intent = Intent(this, Acivity_frame::class.java)
                startActivity(intent)
            }

        }

    }
}