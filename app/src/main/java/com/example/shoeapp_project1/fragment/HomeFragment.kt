package com.example.shoeapp_project1.fragment

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoeapp_project1.R
import com.example.shoeapp_project1.databinding.FragmentHomeBinding
import com.example.shoeapp_project1.viewmodel.ShoeViewModel
import kotlin.math.log

class HomeFragment : Fragment(){
    var  shoeVm : ShoeViewModel = ShoeViewModel()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {
        // Inflate the layout for this fragment
        setHasOptionsMenu(true)
        val binding: FragmentHomeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home, container, false)
        binding.floatingActionButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_shoeDetailsFragment))
        shoeVm = ViewModelProvider(this).get(ShoeViewModel::class.java)



        return binding.root
    }
        override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_logout, menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }

    override fun onResume() {
        if (shoeVm.items.value!!.size>0){
            Log.e("enter","sized"+shoeVm.items.value!!.size)
        }
        super.onResume()
    }



 }