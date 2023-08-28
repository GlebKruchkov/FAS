package com.example.fas

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class User : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        val films = findViewById<View>(R.id.films) as TextView
        val serials = findViewById<View>(R.id.serials) as TextView
        val db = Firebase.firestore
        val log = intent.getStringExtra("log")
        val film = db.collection(log.toString()).document("Фильм")
        film.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val filteredData = document.data?.keys
                    val name = filteredData.toString()
                    films.setText(name)
                } else {
                    Log.d(TAG, "No such document")
                }
            }
            .addOnFailureListener { exception ->
                Log.d(TAG, "get failed with ", exception)
            }


        val serial = db.collection(log.toString()).document("Сериал")
        serial.get()
            .addOnSuccessListener { document ->
                if (document != null) {
                    val filteredData = document.data?.keys
                    val name = filteredData.toString()
                    serials.setText(name)
                } else {
                    Log.d(TAG, "No such document")
                }
            }
            .addOnFailureListener { exception ->
                Log.d(TAG, "get failed with ", exception)
            }
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.back_from_user -> {
                finish()
            }
        }
    }
}