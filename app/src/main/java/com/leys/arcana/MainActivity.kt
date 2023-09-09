package com.leys.arcana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.leys.arcana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun SingleCardPull(view: View){

    }

    fun ThreeCardPull(view: View){

    }

    fun FiveCardPull(view: View){

    }

    fun SevenCardPull(view: View){

    }

    fun HorseShoePull(view: View){

    }

    fun CelticCrossPull(view: View){

    }
}