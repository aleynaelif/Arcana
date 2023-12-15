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
            val actionOne = HomePageFragmentDirections.actionHomePageFragmentToOneCardFragment(Constants.ONE_INT)
            Navigation.findNavController(it).navigate(actionOne)
        }
        binding.ThreeCardButton.setOnClickListener {
            val actionThree = HomePageFragmentDirections.actionHomePageFragmentToThreeCardFragment(Constants.THREE_INT)
            Navigation.findNavController(it).navigate(actionThree)
        }
        binding.FiveCardButton.setOnClickListener {
            val actionFive = HomePageFragmentDirections.actionHomePageFragmentToFiveCardFragment(Constants.FIVE_INT)
            Navigation.findNavController(it).navigate(actionFive)
        }
        binding.SevenCardButton.setOnClickListener {
            val actionSeven = HomePageFragmentDirections.actionHomePageFragmentToSevenCardFragment(Constants.SEVEN_INT)
            Navigation.findNavController(it).navigate(actionSeven)
        }
        binding.HorseShoeButton.setOnClickListener {
            val actionHorse = HomePageFragmentDirections.actionHomePageFragmentToHorseShoeFragment(Constants.SEVEN_INT)
            Navigation.findNavController(it).navigate(actionHorse)
        }
        binding.CelticCrossButton.setOnClickListener {
            val actionCeltic = HomePageFragmentDirections.actionHomePageFragmentToCelticCrossFragment(Constants.TEN_INT)
            Navigation.findNavController(it).navigate(actionCeltic)
        }
    }


}
