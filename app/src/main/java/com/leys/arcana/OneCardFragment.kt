package com.leys.arcana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.leys.arcana.databinding.FragmentOneCardBinding


class OneCardFragment : Fragment() {

    private var _binding: FragmentOneCardBinding? = null
    private val binding get() = _binding!!

   // private var cardNumber = 0


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

        /*arguments?.let {
            cardNumber = OneCardFragmentArgs.fromBundle(it).cardNumber
        }
*/
        binding.PickACardButton.setOnClickListener {
            val action = OneCardFragmentDirections.actionOneCardFragmentToThemeOfTarotFragment(Constants.ONE_INT)
            Navigation.findNavController(it).navigate(action)
        }


    }

}