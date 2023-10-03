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

        binding.PickACardButton.setOnClickListener {
            //imageView change
            binding.CardImage.setImageResource(R.drawable.lovegoth)
            // instruction text change
            if(binding.HowToText.text.equals(getString(R.string.pick_a_card_text))){
                binding.HowToText.text = getString(R.string.instruction_to_send_tarot_text)
            }
            //button text and color change
            if (binding.PickACardButton.text.equals(getString(R.string.lucky))) {
                binding.PickACardButton.text = getString(R.string.send_tarot)
                binding.PickACardButton.setTextColor(ContextCompat.getColor(requireActivity(), R.color.buttonBrown))
                binding.PickACardButton.setBackgroundColor(ContextCompat.getColor(requireActivity(), R.color.Beige))
            }
            binding.PickACardButton.setOnClickListener {
                (activity as? AppCompatActivity)?.fragmentToFragment(ThemeOfTarotFragment(),R.id.frameLayout, addToBackStack = true)
            }
        }


    }

}