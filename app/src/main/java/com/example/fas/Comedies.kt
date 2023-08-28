package com.example.fas

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Comedies : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comedies)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.shurik_trailer -> {
                val intent = Intent(applicationContext, Shurik::class.java)
                startActivity(intent)
            }
            R.id.add_shurik -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Операция 'Ы' и другие приключения Шурика" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.one_plus_one -> {
                val intent = Intent(applicationContext, One::class.java)
                startActivity(intent)
            }
            R.id.add_one_plus_one -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("1+1" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.kush -> {
                val intent = Intent(applicationContext, Kush::class.java)
                startActivity(intent)
            }
            R.id.add_kush -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Большой куш" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.noth -> {
                val intent = Intent(applicationContext, Many_but_nothing::class.java)
                startActivity(intent)
            }
            R.id.add_noth -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("100 вещей и ничего лишнего" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.alone -> {
                val intent = Intent(applicationContext, Alone_at_home::class.java)
                startActivity(intent)
            }
            R.id.add_alone -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Один дома" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.Ivan -> {
                val intent = Intent(applicationContext, Ivan::class.java)
                startActivity(intent)
            }
            R.id.add_Ivan -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Иван Васильевич меняет профессию" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
            R.id.Stazer -> {
                val intent = Intent(applicationContext, Stazer::class.java)
                startActivity(intent)
            }
            R.id.add_Stazer -> {
                val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                if (log != null) {
                    val data = hashMapOf("Стажёр" to true)
                    db.collection(log).document("Фильм")
                        .set(data, SetOptions.merge())
                }
            }
        }
    }
}