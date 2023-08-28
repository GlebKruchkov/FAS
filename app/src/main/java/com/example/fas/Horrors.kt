package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Horrors : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_horrors)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.Pila_trailer -> {
                val intent = Intent(applicationContext, Pila::class.java)
                startActivity(intent)
            }
            R.id.add_Pila -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Пила" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.ono_trailer -> {
                val intent = Intent(applicationContext, Ono::class.java)
                startActivity(intent)
            }
            R.id.add_ono -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Оно" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.virus_trailer -> {
                val intent = Intent(applicationContext, Virus::class.java)
                startActivity(intent)
            }
            R.id.add_virus -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Вирус" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.time_trailer -> {
                val intent = Intent(applicationContext, Time::class.java)
                startActivity(intent)
            }
            R.id.add_time -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Время" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.otmel_trailer -> {
                val intent = Intent(applicationContext, Otmel::class.java)
                startActivity(intent)
            }
            R.id.add_otmel -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Отмель" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.day_trailer -> {
                val intent = Intent(applicationContext, Day::class.java)
                startActivity(intent)
            }
            R.id.add_day -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Счастливого дня смерти" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
        }
    }
}