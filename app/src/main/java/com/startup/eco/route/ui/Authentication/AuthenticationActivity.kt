package com.startup.eco.route.ui.Authentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.startup.eco.route.databinding.ActivityAuthenticationBinding
import com.startup.eco.route.ui.Authentication.Fragments.LoginFragment

class AuthenticationActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAuthenticationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAuthenticationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            showBottomSheet()
        }
    }

    private fun showBottomSheet() {
        val bottomSheetFragment = LoginFragment()
        bottomSheetFragment.show(supportFragmentManager,"BottomDialog")
    }
}