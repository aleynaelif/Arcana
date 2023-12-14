package com.leys.arcana

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
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

            //Navigation.findNavController(it).navigate(R.id.SingleCardButton)
        }
        binding.ThreeCardButton.setOnClickListener {

        }
        binding.FiveCardButton.setOnClickListener {

        }
        binding.SevenCardButton.setOnClickListener {

        }
        binding.HorseShoeButton.setOnClickListener {

        }
        binding.CelticCrossButton.setOnClickListener {

        }
    }


}
