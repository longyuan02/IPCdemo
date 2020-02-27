package com.kt.test.ipcdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

/**
 * @Author: dr
 * @Data: 2020-02-26
 */
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        println("userId"+UserManager.sUserId)
        tv_second.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }

    }
}