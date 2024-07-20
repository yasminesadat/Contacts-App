package com.ys.contactsapp.data

import com.ys.contactsapp.R
import com.ys.contactsapp.model.Contact

class DataSource {

    fun getData(): List<Contact>{
        val contacts = mutableListOf<Contact>()
        contacts.add(Contact(
            name = "Auntie",
            phoneNumber = "+201012345678",
            photo = R.drawable.auntie
        ))
        contacts.add(Contact(
            name = "Brother",
            phoneNumber = "+201123456789",
            photo = R.drawable.brother
        ))
        contacts.add(Contact(
            name = "Daughter",
            phoneNumber = "+20134567890",
            photo = R.drawable.daughter
        ))
        contacts.add(Contact(
            name = "Friend1",
            phoneNumber = "+201345678901",
            photo = R.drawable.friend_1
        ))
        contacts.add(Contact(
            name = "Friend2",
            phoneNumber = "+201456789012",
            photo = R.drawable.friend_2
        ))
        contacts.add(Contact(
            name = "Grandfather",
            phoneNumber = "+201567890123",
            photo = R.drawable.grandfather
        ))
        contacts.add(Contact(
            name = "Granny",
            phoneNumber = "+201678901234",
            photo = R.drawable.granny
        ))
        contacts.add(Contact(
            name = "Neighbour",
            phoneNumber = "+201789012345",
            photo = R.drawable.neigbour
        ))
        contacts.add(Contact(
            name = "Sister",
            phoneNumber = "+201890123456",
            photo = R.drawable.sister
        ))
        contacts.add(Contact(
            name = "Son",
            phoneNumber = "+201512345678",
            photo = R.drawable.son
        ))
        contacts.add(Contact(
            name = "Uncle",
            phoneNumber = "+201912345678",
            photo = R.drawable.uncle
        ))

        return contacts
    }
}