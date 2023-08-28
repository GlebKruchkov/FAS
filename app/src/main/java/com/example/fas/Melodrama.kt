package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Melodrama : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_melodrama)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.on_trailer -> {
                val intent = Intent(applicationContext, On::class.java)
                startActivity(intent)
            }
            R.id.add_on -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Он и она" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.posle_trailer -> {
                val intent = Intent(applicationContext, Posle::class.java)
                startActivity(intent)
            }
            R.id.add_posle -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("После" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.vek_trailer -> {
                val intent = Intent(applicationContext, Vek::class.java)
                startActivity(intent)
            }
            R.id.add_vek -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Век Адалин" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.gray_trailer -> {
                val intent = Intent(applicationContext, Gray::class.java)
                startActivity(intent)
            }
            R.id.add_gray -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("50 оттенков серого" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.sun_trailer -> {
                val intent = Intent(applicationContext, Sun::class.java)
                startActivity(intent)
            }
            R.id.add_sun -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Полночное солнце" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.stars_trailer -> {
                val intent = Intent(applicationContext, Stars::class.java)
                startActivity(intent)
            }
            R.id.add_stars -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Виноваты звезды" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
        }
    }
}