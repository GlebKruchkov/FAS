package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Serial_horror : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serial_horror)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.strange_trailer -> {
                val intent = Intent(applicationContext, Strange::class.java)
                startActivity(intent)
            }
            R.id.add_strange -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Странные дела" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.izvne_trailer -> {
                val intent = Intent(applicationContext, Izvne::class.java)
                startActivity(intent)
            }
            R.id.add_izvne -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Извне" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.shershni_trailer -> {
                val intent = Intent(applicationContext, Shershni::class.java)
                startActivity(intent)
            }
            R.id.add_shershni -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Шершни" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
        }
    }
}