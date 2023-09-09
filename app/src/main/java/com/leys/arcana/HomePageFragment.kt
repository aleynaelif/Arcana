package com.leys.arcana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
            replaceFragment(OneCardFragment())
        }
        binding.ThreeCardButton.setOnClickListener {
            replaceFragment(ThreeCardFragment())
        }
        binding.FiveCardButton.setOnClickListener {
            replaceFragment(FiveCardFragment())
        }
        binding.SevenCardButton.setOnClickListener {
            replaceFragment(SevenCardFragment())
        }
        binding.HorseShoeButton.setOnClickListener {
            replaceFragment(HorseShoeFragment())
        }
        binding.CelticCrossButton.setOnClickListener {
            replaceFragment(CelticCrossFragment())
        }
    }


    private fun replaceFragment(fragment : Fragment){
        val transaction = activity?.supportFragmentManager?.beginTransaction()
        transaction?.replace(R.id.frameLayout, fragment)?.addToBackStack(null)?.commit()

    }

}
