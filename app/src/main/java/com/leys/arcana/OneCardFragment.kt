package com.leys.arcana

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation



class OneCardFragment : Fragment() {

    private lateinit var composeView: ComposeView
    private val viewModel: OneCardViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).also {
            composeView = it
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //get the card number from the arguments in HomePageFragment

        /*arguments?.let {
            cardNumber = OneCardFragmentArgs.fromBundle(it).cardNumber
        }
        */
        composeView.setContent {
            val state by viewModel.state.collectAsState()
            OneCardScreen(
                state = state,
                onNextClick = {
                    val action = OneCardFragmentDirections.actionOneCardFragmentToThemeOfTarotFragment(Constants.ONE_INT)
                    Navigation.findNavController(view).navigate(action)
                }
            )

        }
    }
}