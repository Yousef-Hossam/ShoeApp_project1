package com.example.shoeapp_project1.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Shoe(
var name: String, var size: Double, var company: String, var description:String,
) : Parcelable
