package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.widget.Toolbar
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class Register : AppCompatActivity(), View.OnClickListener {
    private lateinit var mAuth : FirebaseAuth
    private lateinit var refUsers : DatabaseReference
    private var firebaseUserId: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        mAuth = FirebaseAuth.getInstance()
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_register -> {
                registerUser()
            }
        }
    }
    private fun registerUser() {
        val username : String = findViewById<EditText>(R.id.name).text.toString()
        val email : String = findViewById<EditText>(R.id.email).text.toString()
        val password : String = findViewById<EditText>(R.id.password).text.toString()
        val re_password : String = findViewById<EditText>(R.id.et_repassword).text.toString()

        if (username == "") {
            Toast.makeText(this@Register, "Enter your name", Toast.LENGTH_LONG).show()
        } else if (email == "") {
            Toast.makeText(this@Register, "Enter your email", Toast.LENGTH_LONG).show()
        } else if (password == "") {
            Toast.makeText(this@Register, "Enter your password", Toast.LENGTH_LONG).show()
        } else if (password != re_password) {
            Toast.makeText(this@Register, "passwords don't match", Toast.LENGTH_LONG).show()
        } else {
            mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener {
                    task ->
                    if (task.isSuccessful) {
                        firebaseUserId = mAuth.currentUser!!.uid
                        refUsers = FirebaseDatabase.getInstance().reference.child("Users").child(firebaseUserId)

                        val userHashMap = HashMap<String, Any>()
                        userHashMap["uid"] = firebaseUserId
                        userHashMap["email"] = email
                        userHashMap["username"] = username

                        val intent = Intent(applicationContext, Login::class.java)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this@Register, task.exception!!.message.toString(), Toast.LENGTH_LONG).show()
                    }
                }
        }
    }
}