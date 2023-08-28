package com.example.fas

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.firestore.SetOptions
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class Menu : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.film -> {
                /*val log = intent.getStringExtra("log")
                val db = Firebase.firestore
                val city = hashMapOf(
                    "name" to "Los Angeles",
                    "state" to "CA",
                    "country" to "USA",
                )
                if (log != null) {
                    db.collection(log).document("LA")
                        .set(city)
                        .addOnSuccessListener { Log.d(TAG, "DocumentSnapshot successfully written!") }
                        .addOnFailureListener { e -> Log.w(TAG, "Error writing document", e) }
                }
                 */
                val log = intent.getStringExtra("log")
                val intent = Intent(applicationContext, Film_case::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
            R.id.serial -> {
                val log = intent.getStringExtra("log")
                val intent = Intent(applicationContext, Serial_case::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
            R.id.user -> {
                val log = intent.getStringExtra("log")
                val intent = Intent(applicationContext, User::class.java)
                intent.putExtra("log", log)
                startActivity(intent)
            }
        }
    }
}