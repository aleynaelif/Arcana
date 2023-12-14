package com.leys.arcana
import kotlin.random.Random

class SelectCards {


// should I add weights for different themes?? IDK
    fun CardNumberSelector(): Int {
        return Random.nextInt(0, 78)
    }
}