package com.leys.arcana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.leys.arcana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        replaceFragment(HomePageFragment())

    }
    private fun replaceFragment(fragment : Fragment){

        supportFragmentManager.beginTransaction()
            .replace(R.id.frameLayout,fragment)
            .addToBackStack(null)
            .commit()
    }

}