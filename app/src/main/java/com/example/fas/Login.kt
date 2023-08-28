package com.example.fas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Login : AppCompatActivity(), View.OnClickListener {
    private lateinit var mAuth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mAuth = FirebaseAuth.getInstance()
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_login -> {
                login_user()
            }
        }
    }

    private fun login_user() {
        val email : String = findViewById<EditText>(R.id.e_mail_log).text.toString()
        val password : String = findViewById<EditText>(R.id.password_log).text.toString()
        if (email == "") {
            Toast.makeText(this@Login, "Enter your email", Toast.LENGTH_LONG).show()
        } else if (password == "") {
            Toast.makeText(this@Login, "Enter your password", Toast.LENGTH_LONG).show()
        } else {
            mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener {
                    task ->
                    if (task.isSuccessful) {
                        val intent = Intent(applicationContext, Menu::class.java)
                        intent.putExtra("log", email)
                        startActivity(intent)
                    } else {
                        Toast.makeText(this@Login, task.exception!!.message.toString(), Toast.LENGTH_LONG).show()
                    }
                }
        }
    }
}
