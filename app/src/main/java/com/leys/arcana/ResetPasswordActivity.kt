package com.leys.arcana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import com.google.api.Context
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.leys.arcana.databinding.ActivityResetPasswordBinding

class ResetPasswordActivity : AppCompatActivity() {
    private lateinit var auth : FirebaseAuth
    private lateinit var binding : ActivityResetPasswordBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResetPasswordBinding.inflate(layoutInflater)

        auth = Firebase.auth

        val view = binding.root
        setContentView(view)

        val email = binding.ResetEmailText.toString()

        binding.ResetButton.setOnClickListener {
            val inputMethodManager = getSystemService(android.content.Context.INPUT_METHOD_SERVICE) as InputMethodManager
            inputMethodManager.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
            if(email.isNullOrEmpty())
                Toast.makeText(this,"Email address is not provided!" , Toast.LENGTH_SHORT).show()
            else{
                auth.sendPasswordResetEmail(email).addOnCompleteListener { task ->
                    if(task.isSuccessful){
                        Toast.makeText(this,"Reset password link is mailed. Check your email!" , Toast.LENGTH_SHORT).show()
                    }
                    else
                        Toast.makeText(this,"Password reset link could not be sent! Try checking your internet connection!" , Toast.LENGTH_SHORT).show()
                }
            }
        }

    }
}