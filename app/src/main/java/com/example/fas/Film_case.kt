package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Film_case : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_film_case)
    }
    override fun onClick(p0: View?) {
        val log = intent.getStringExtra("log")
        when (p0?.id) {
            R.id.comedy -> {
                val intent = Intent(applicationContext, Comedies::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
            R.id.horror -> {
                val intent = Intent(applicationContext, Horrors::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
            R.id.family -> {
                val intent = Intent(applicationContext, Family::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
            R.id.adventures -> {
                val intent = Intent(applicationContext, Adventures::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
            R.id.action -> {
                val intent = Intent(applicationContext, Action::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
            R.id.melodrama -> {
                val intent = Intent(applicationContext, Melodrama::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
        }
    }
}