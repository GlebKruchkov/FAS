package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Family : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.lilu_trailer -> {
                val intent = Intent(applicationContext, Lilu::class.java)
                startActivity(intent)
            }
            R.id.add_lilu -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Лилу и Бриггс" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.charli_trailer -> {
                val intent = Intent(applicationContext, Charli::class.java)
                startActivity(intent)
            }
            R.id.add_charli -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Чарли" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.paddington_trailer -> {
                val intent = Intent(applicationContext, Paddington::class.java)
                startActivity(intent)
            }
            R.id.add_paddington -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Приключения Паддингтона" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.fast_fam_trailer -> {
                val intent = Intent(applicationContext, Fast_fam::class.java)
                startActivity(intent)
            }
            R.id.add_fast_fam -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Семья по-быстрому" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.chebu_trailer -> {
                val intent = Intent(applicationContext, Chebu::class.java)
                startActivity(intent)
            }
            R.id.add_chebu -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Чебурашка" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.marry_trailer -> {
                val intent = Intent(applicationContext, Marry::class.java)
                startActivity(intent)
            }
            R.id.add_marry -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("После свадьбы" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
        }
    }
}