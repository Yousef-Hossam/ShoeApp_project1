package com.example.shoeapp_project1.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.shoeapp_project1.model.Shoe

class ShoeViewModel:ViewModel() {
    private  var shoeList: MutableLiveData<List<Shoe>> = MutableLiveData(listOf())
    val items: LiveData<List<Shoe>>
    get() = shoeList



    fun addNewShoe(shoeObj :Shoe) {
        val listItem = Shoe(shoeObj.name, shoeObj.size,shoeObj.company,shoeObj.description)
        shoeList.value = shoeList.value?.plus(listItem) ?: listOf(listItem)
        Log.e("sized","listSize+ ${shoeList.value!!.size.toString()}")
    }


}