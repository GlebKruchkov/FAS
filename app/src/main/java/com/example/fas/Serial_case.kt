package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Serial_case : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serial_case)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.comedy -> {
                val log = intent.getStringExtra("log")
                val intent = Intent(applicationContext, Serial_comedy::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
            R.id.horror -> {
                val log = intent.getStringExtra("log")
                val intent = Intent(applicationContext, Serial_horror::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
            R.id.family -> {
                val log = intent.getStringExtra("log")
                val intent = Intent(applicationContext, Serial_family::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
        }
    }
}