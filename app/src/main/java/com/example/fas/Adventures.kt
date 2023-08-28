package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Adventures : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_adventures)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.ancharted_trailer -> {
                val intent = Intent(applicationContext, Ancharted::class.java)
                startActivity(intent)
            }
            R.id.add_ancharted -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Анчартед: на картах не значится" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.juman_trailer -> {
                val intent = Intent(applicationContext, Juman::class.java)
                startActivity(intent)
            }
            R.id.add_juman -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Джуманджи" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.brilik_trailer -> {
                val intent = Intent(applicationContext, Brilik::class.java)
                startActivity(intent)
            }
            R.id.add_brilik -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Как украсть бриллиант" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.avatar_trailer -> {
                val intent = Intent(applicationContext, Avatar::class.java)
                startActivity(intent)
            }
            R.id.add_avatar -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Аватар" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.inter_trailer -> {
                val intent = Intent(applicationContext, Inter::class.java)
                startActivity(intent)
            }
            R.id.add_inter -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Интерстеллар" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.indiana_trailer -> {
                val intent = Intent(applicationContext, Indiana::class.java)
                startActivity(intent)
            }
            R.id.add_indiana -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Индиана Джонс и колесо судьбы" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
        }
    }
}