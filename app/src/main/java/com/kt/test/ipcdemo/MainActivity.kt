package com.kt.test.ipcdemo

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_main.setOnClickListener {
            UserManager.sUserId=2
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }
}
