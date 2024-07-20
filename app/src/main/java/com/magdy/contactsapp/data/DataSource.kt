package com.magdy.contactsapp.data

import androidx.compose.ui.res.stringResource
import com.magdy.contactsapp.R
import com.magdy.contactsapp.model.Contact
import com.magdy.contactsapp.data.constants.Constants


class DataSource {

    fun getContacts(): List<Contact> {
        var contacts = mutableListOf<Contact>()
        contacts.add(
            Contact(
                name = R.string.auntie,
                picture = R.drawable.auntie,
                phone = Constants.AUNTIE
            )
        )

        contacts.add(
            Contact(
                name = R.string.brother,
                picture = R.drawable.brother,
                phone = Constants.BROTHER
            )
        )
        contacts.add(
            Contact(
                name = R.string.daughter,
                picture = R.drawable.daughter,
                phone = Constants.DAUGHTER
            )
        )
        contacts.add(
            Contact(
                name = R.string.friend1,
                picture = R.drawable.friend_1,
                phone = Constants.FRIEND1
            )
        )
        contacts.add(
            Contact(
                name = R.string.friend2,
                picture = R.drawable.friend_2,
                phone = Constants.FRIEND2
            )
        )
        contacts.add(
            Contact(
                name = R.string.grandfather,
                picture = R.drawable.grandfather,
                phone = Constants.GRANDFATHER
            )
        )
        contacts.add(
            Contact(
                name = R.string.granny,
                picture = R.drawable.granny,
                phone = Constants.GRANNY
            )
        )
        contacts.add(
            Contact(
                name = R.string.neighbour,
                picture = R.drawable.neigbour,
                phone = Constants.NEIGHBOUR
            )
        )
        contacts.add(
            Contact(
                name = R.string.sister,
                picture = R.drawable.sister,
                phone = Constants.SISTER
            )
        )
        contacts.add(
            Contact(
                name = R.string.son,
                picture = R.drawable.son,
                phone = Constants.SON
            )
        )
        contacts.add(
            Contact(
                name = R.string.uncle,
                picture = R.drawable.uncle,
                phone = Constants.UNCLE
            )
        )

        return contacts
    }
}