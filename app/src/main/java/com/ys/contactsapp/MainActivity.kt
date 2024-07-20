package com.ys.contactsapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ys.contactsapp.data.DataSource
import com.ys.contactsapp.model.Contact


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = {
                            Text("Contacts App")
                        },
                        actions = {
                            IconButton(onClick = { openDialer("0227953811") }) {
                                Icon(
                                    painter = painterResource(id = R.drawable.home_icon),
                                    contentDescription = "Call Home"
                                )
                            }
                        }

                    )
                }) { innerPadding ->
                ContactsAppGrid(
                    contacts = DataSource().getData(),
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}

@Composable
fun ContactsAppGrid(contacts: List<Contact>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = modifier
    )
    {
        items(contacts) {
            ContactItem(contact = it)
        }
    }
}

@Composable
fun ContactItem(contact: Contact, modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Column(
        modifier = modifier.background(Color.LightGray)
            .clickable {
                (context as ComponentActivity).openDialer(contact.phoneNumber)
            },
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter = painterResource(contact.photo),
            contentDescription = "Contact Image"
        )
        Text(
            text = contact.name,
            fontWeight = FontWeight.Medium,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 4.dp)
        )
        SelectionContainer {
            Text(
                text = contact.phoneNumber,
                fontWeight = FontWeight.Light,
                fontSize = 12.sp
            )
        }
    }
}

// Extension Function
fun ComponentActivity.openDialer(phoneNumber: String) {
    val intent = Intent(Intent.ACTION_DIAL).apply {
        // convert phone to Uri format
        data = Uri.parse("tel:$phoneNumber")
    }
    startActivity(intent)
}
