package com.example.shoeapp_project1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.shoeapp_project1.R
import com.example.shoeapp_project1.databinding.FragmentShoeDetailsBinding
import com.example.shoeapp_project1.model.Shoe
import com.example.shoeapp_project1.viewmodel.ShoeViewModel


class ShoeDetailsFragment : Fragment() {
  private  val  _shoeviewm : ShoeViewModel = ShoeViewModel()
    lateinit var shoe:Shoe
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentShoeDetailsBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_details, container, false)
        binding.btnCancel.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_shoeDetailsFragment_to_homeFragment))
        binding.btnSave.setOnClickListener(object : View.OnClickListener{
            override fun onClick(view: View?) {
               var name=binding.editTextName.text.toString()
               var size=binding.editTextSize.text.toString().toDouble()
                var company=binding.editTextCompany.toString()
               var desc=binding.editTextDesc.toString()
                shoe = Shoe(name,size,company,desc)
                _shoeviewm.addNewShoe(shoe)
                Navigation.createNavigateOnClickListener(R.id.action_shoeDetailsFragment_to_homeFragment)
            }
        })


        return binding.root
    }



}