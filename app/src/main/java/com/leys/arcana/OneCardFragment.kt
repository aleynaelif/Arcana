package com.leys.arcana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.leys.arcana.databinding.FragmentOneCardBinding


class OneCardFragment : Fragment() {

    private var _binding: FragmentOneCardBinding? = null
    private val binding get() = _binding!!

    private var cardNumber = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOneCardBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //get the card number from the arguments in HomePageFragment

        arguments?.let {
            cardNumber = OneCardFragmentArgs.fromBundle(it).cardNumber
        }

        binding.PickACardButton.setOnClickListener {
            // instruction text change
            if(binding.HowToText.text.equals(getString(R.string.pick_a_card_text))){
                //shuffle function should be in here
                binding.HowToText.text = getString(R.string.card_selected_text)
            }
            //button text and color change
            if (binding.PickACardButton.text.equals(getString(R.string.lucky))) {
                binding.PickACardButton.text = getString(R.string.send_tarot)
                binding.PickACardButton.setTextColor(ContextCompat.getColor(requireActivity(), R.color.buttonBrown))
                binding.PickACardButton.setBackgroundColor(ContextCompat.getColor(requireActivity(), R.color.Beige))
            }
            binding.PickACardButton.setOnClickListener {
                //meanings page should open up in here
            }
        }


    }

}