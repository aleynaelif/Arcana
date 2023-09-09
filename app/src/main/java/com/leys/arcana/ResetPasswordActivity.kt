package com.leys.arcana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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

    }

    fun ResetButton(view : View){
        val email = binding.ResetEmailText.text.toString()

        if(email.isNullOrBlank() || email.isEmpty())
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