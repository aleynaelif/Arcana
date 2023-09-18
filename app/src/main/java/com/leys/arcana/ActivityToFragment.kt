package com.leys.arcana

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

fun AppCompatActivity.activityToFragment(
    fragment: Fragment,
    containerId: Int,
    addToBackStack: Boolean = false
) {
    val fragmentManager: FragmentManager = supportFragmentManager
    val transaction: FragmentTransaction = fragmentManager.beginTransaction()

    transaction.replace(containerId, fragment)

    if (addToBackStack) {
        transaction.addToBackStack(null)
    }

    transaction.commit()
}