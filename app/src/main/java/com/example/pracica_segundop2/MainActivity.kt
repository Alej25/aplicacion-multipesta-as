package com.example.pracica_segundop2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

     fun send(v: View){
        when (v.getId()){

            R.id.activity_main_send ->{
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }
    }

}