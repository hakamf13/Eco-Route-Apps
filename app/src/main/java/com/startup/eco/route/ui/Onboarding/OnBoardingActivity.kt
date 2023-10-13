package com.startup.eco.route.ui.Onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.startup.eco.route.adapter.ViewPagerAdapter
import com.startup.eco.route.databinding.ActivityOnBoardingBinding
import com.startup.eco.route.ui.Onboarding.fragments.FistFragment
import com.startup.eco.route.ui.Onboarding.fragments.SecondFragment
import com.startup.eco.route.ui.Onboarding.fragments.ThridFragment

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding : ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentList = arrayListOf<Fragment>(
            FistFragment(),
            SecondFragment(),
            ThridFragment(),
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            this.supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter
        binding.dotsIndicator.attachTo(viewPager2 = binding.viewPager)

    }
}