package com.magdy.contactsapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Contact
    (
    @StringRes val name : Int ,
    @DrawableRes val picture : Int,
    val phone : String
) {
}