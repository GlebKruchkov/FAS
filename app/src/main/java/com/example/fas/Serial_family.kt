package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Serial_family : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serial_family)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.manuna_trailer -> {
                val intent = Intent(applicationContext, Manuna::class.java)
                startActivity(intent)
            }
            R.id.add_manuna -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Манюня" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.sato_trailer -> {
                val intent = Intent(applicationContext, Sato::class.java)
                startActivity(intent)
            }
            R.id.add_sato -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Сато" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.pirogova_trailer -> {
                val intent = Intent(applicationContext, Pirogova::class.java)
                startActivity(intent)
            }
            R.id.add_pirogova -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("ИП Пирогова" to true)
                    db.collection(log).document("Сериал")
                        .set(data, SetOptions.merge())
                }
            }
        }
    }
}