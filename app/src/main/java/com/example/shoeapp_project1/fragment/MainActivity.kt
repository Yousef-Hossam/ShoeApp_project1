package com.example.shoeapp_project1.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.shoeapp_project1.R
import com.example.shoeapp_project1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,
            R.layout.activity_main
        )

      //  drawerLayout=binding.drawerLayout
        val navController = this.findNavController(R.id.nav_host)
        NavigationUI.setupActionBarWithNavController(this,navController,null)


    }
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host)
        return NavigationUI.navigateUp(navController,null)
    }
}