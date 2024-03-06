package com.leys.arcana

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class OneCardViewModel: ViewModel() {

    private val _state = MutableStateFlow(OneCardState())
    val state = _state.asStateFlow()

}

class OneCardState