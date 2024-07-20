package com.ys.contactsapp.data

import com.ys.contactsapp.R
import com.ys.contactsapp.model.Contact

class DataSource {

    fun getData(): List<Contact>{
        val contacts = mutableListOf<Contact>()
        contacts.add(Contact(
            name = R.string.auntie,
            phoneNumber = R.string.auntie_phone,
            photo = R.drawable.auntie
        ))
        contacts.add(Contact(
            name = R.string.brother,
            phoneNumber = R.string.brother_phone,
            photo = R.drawable.brother
        ))
        contacts.add(Contact(
            name = R.string.daughter,
            phoneNumber = R.string.daughter_phone,
            photo = R.drawable.daughter
        ))
        contacts.add(Contact(
            name = R.string.friend1,
            phoneNumber = R.string.friend1_phone,
            photo = R.drawable.friend_1
        ))
        contacts.add(Contact(
            name = R.string.friend2,
            phoneNumber = R.string.friend2_phone,
            photo = R.drawable.friend_2
        ))
        contacts.add(Contact(
            name = R.string.grandfather,
            phoneNumber = R.string.grandfather_phone,
            photo = R.drawable.grandfather
        ))
        contacts.add(Contact(
            name = R.string.granny,
            phoneNumber = R.string.granny_phone,
            photo = R.drawable.granny
        ))
        contacts.add(Contact(
            name = R.string.neighbour,
            phoneNumber = R.string.neighbour_phone,
            photo = R.drawable.neigbour
        ))
        contacts.add(Contact(
            name = R.string.sister,
            phoneNumber = R.string.sister_phone,
            photo = R.drawable.sister
        ))
        contacts.add(Contact(
            name = R.string.son,
            phoneNumber = R.string.son_phone,
            photo = R.drawable.son
        ))
        contacts.add(Contact(
            name = R.string.uncle,
            phoneNumber = R.string.uncle_phone,
            photo = R.drawable.uncle
        ))

        return contacts
    }
}