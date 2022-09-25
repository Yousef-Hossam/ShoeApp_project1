package com.example.shoeapp_project1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.shoeapp_project1.R
import com.example.shoeapp_project1.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false)
        binding.loginButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_onBoardingFragment))
        return binding.root
    }

}