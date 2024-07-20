package com.ys.contactsapp.model

import androidx.annotation.DrawableRes

class Contact(
    val name: String,
    val phoneNumber: String,
    @DrawableRes val photo: Int,
) {
}