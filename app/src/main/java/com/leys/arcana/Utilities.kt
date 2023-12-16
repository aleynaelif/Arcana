package com.leys.arcana

import android.content.Context
import android.provider.Settings.Global.getString
import android.widget.Button
import androidx.core.content.ContextCompat

class Utilities {
    companion object {
        fun changeTheTextIfClicked(button: Button) {
            if(button.text.equals((R.string.pick_a_card_text).toString())){
                button.text = (R.string.card_selected_text).toString()
            }
        }

    }
}