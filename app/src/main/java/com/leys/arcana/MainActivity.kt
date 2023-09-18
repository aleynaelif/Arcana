package com.leys.arcana

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.leys.arcana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        activityToFragment(HomePageFragment(),R.id.frameLayout, addToBackStack = true)

    }

}