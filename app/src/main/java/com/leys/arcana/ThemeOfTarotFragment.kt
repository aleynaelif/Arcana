package com.leys.arcana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leys.arcana.databinding.FragmentThemeOfTarotBinding


class ThemeOfTarotFragment : Fragment() {

    private var _binding: FragmentThemeOfTarotBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThemeOfTarotBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.GeneralImageView.setOnClickListener {

        }
        binding.LoveImageView.setOnClickListener {

        }
        binding.CareerImageView.setOnClickListener {

        }
    }



}