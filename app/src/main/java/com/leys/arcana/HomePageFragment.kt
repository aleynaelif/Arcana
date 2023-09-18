package com.leys.arcana

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.leys.arcana.databinding.FragmentHomePageBinding


class HomePageFragment : Fragment() {

    private var _binding: FragmentHomePageBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomePageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.SingleCardButton.setOnClickListener {
            (activity as? AppCompatActivity)?.fragmentToFragment(OneCardFragment(),R.id.frameLayout, addToBackStack = true)
        }
        binding.ThreeCardButton.setOnClickListener {
            (activity as? AppCompatActivity)?.fragmentToFragment(ThreeCardFragment(),R.id.frameLayout, addToBackStack = true)
        }
        binding.FiveCardButton.setOnClickListener {
            (activity as? AppCompatActivity)?.fragmentToFragment(FiveCardFragment(),R.id.frameLayout, addToBackStack = true)
        }
        binding.SevenCardButton.setOnClickListener {
            (activity as? AppCompatActivity)?.fragmentToFragment(SevenCardFragment(),R.id.frameLayout, addToBackStack = true)
        }
        binding.HorseShoeButton.setOnClickListener {
            (activity as? AppCompatActivity)?.fragmentToFragment(HorseShoeFragment(),R.id.frameLayout, addToBackStack = true)
        }
        binding.CelticCrossButton.setOnClickListener {
            (activity as? AppCompatActivity)?.fragmentToFragment(CelticCrossFragment(),R.id.frameLayout, addToBackStack = true)
        }
    }


}
