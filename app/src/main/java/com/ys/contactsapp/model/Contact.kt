package com.ys.contactsapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

class Contact(
    @StringRes val name: Int,
    @StringRes val phoneNumber: Int,
    @DrawableRes val photo: Int,
) {
}