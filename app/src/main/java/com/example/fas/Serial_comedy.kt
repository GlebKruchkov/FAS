package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Serial_comedy : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serial_comedy)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.trudny_trailer -> {
                val intent = Intent(applicationContext, Trudny::class.java)
                startActivity(intent)
            }
            R.id.add_trudny -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Трудные подростки" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.zuki_trailer -> {
                val intent = Intent(applicationContext, Zuki::class.java)
                startActivity(intent)
            }
            R.id.add_zuki -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Жуки" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.kitchen_trailer -> {
                val intent = Intent(applicationContext, Kitchen::class.java)
                startActivity(intent)
            }
            R.id.add_kitchen -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Кухня" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.ivanovi_trailer -> {
                val intent = Intent(applicationContext, Ivanovi::class.java)
                startActivity(intent)
            }
            R.id.add_ivanovi -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Ивановы-Ивановы" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.eleon_trailer -> {
                val intent = Intent(applicationContext, Eleon::class.java)
                startActivity(intent)
            }
            R.id.add_eleon -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Отель Элеон" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.soderzanki_trailer -> {
                val intent = Intent(applicationContext, Soderzanki::class.java)
                startActivity(intent)
            }
            R.id.add_soderzanki -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Содержанки" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
        }
    }
}