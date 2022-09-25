package com.example.shoeapp_project1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.shoeapp_project1.R
import com.example.shoeapp_project1.databinding.FragmentInstructionsBinding
import com.example.shoeapp_project1.databinding.FragmentOnBoardingBinding


class InstructionsFragment : Fragment() {
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentInstructionsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_instructions, container, false)
        binding.buttonInstruction.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_instructionsFragment_to_homeFragment))

        return binding.root
    }


}