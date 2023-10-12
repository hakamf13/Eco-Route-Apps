package com.startup.eco.route

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.startup.eco.route.ui.Login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            finish()
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        },2000)
    }
}