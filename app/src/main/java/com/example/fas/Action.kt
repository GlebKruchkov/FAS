package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Action : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.forsaz_trailer -> {
                val intent = Intent(applicationContext, Forsaz::class.java)
                startActivity(intent)
            }
            R.id.add_forsaz -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Форсаж" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.answer_trailer -> {
                val intent = Intent(applicationContext, Answer::class.java)
                startActivity(intent)
            }
            R.id.add_answer -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Без ответа" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.pula_trailer -> {
                val intent = Intent(applicationContext, Pula::class.java)
                startActivity(intent)
            }
            R.id.add_pula -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Шальная пуля" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.bamblbi_trailer -> {
                val intent = Intent(applicationContext, Bamblbi::class.java)
                startActivity(intent)
            }
            R.id.add_bamblbi -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Бамблби" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.luci_trailer -> {
                val intent = Intent(applicationContext, Luci::class.java)
                startActivity(intent)
            }
            R.id.add_luci -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Люси" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.hankok_trailer -> {
                val intent = Intent(applicationContext, Hankok::class.java)
                startActivity(intent)
            }
            R.id.add_hankok -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Хэнкок" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
        }
    }
}