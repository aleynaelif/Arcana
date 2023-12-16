package com.leys.arcana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.leys.arcana.databinding.FragmentFiveCardBinding
import com.leys.arcana.databinding.FragmentSevenCardBinding

class SevenCardFragment : Fragment() {

    private var _binding: FragmentSevenCardBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSevenCardBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.pickACardButton.setOnClickListener {
            val action = SevenCardFragmentDirections.actionSevenCardFragmentToThemeOfTarotFragment(Constants.SEVEN_INT)
            Navigation.findNavController(it).navigate(action)
        }
    }

}