package com.example.fas

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView

class Kush : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kush)
        val video : VideoView = findViewById(R.id.video)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(video)
        val ur = Uri.parse("android.resource://$packageName/${R.raw.big_kush}")
        video.setMediaController(mediaController)
        video.setVideoURI(ur)
        video.requestFocus()
        video.start()
    }
    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.back_from_Kush -> {
                finish()
            }
        }
    }
}