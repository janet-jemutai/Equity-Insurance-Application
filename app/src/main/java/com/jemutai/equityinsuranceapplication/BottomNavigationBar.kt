package com.jemutai.equityinsuranceapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.jemutai.equityinsuranceapplication.data.BottomNavigation

val  items = listOf(

    BottomNavigation(
        title = "Home",
        icon =  Icons.Rounded.Home
    ),
    BottomNavigation(
        title = "Policies",
        icon =  Icons.Rounded.List
    ),
    BottomNavigation(
        title = "Claims",
        icon =  Icons.Rounded.List
    ),
    BottomNavigation(
        title = "Notifications",
        icon =  Icons.Rounded.Notifications
    )

)


@Preview
@Composable
fun  BottomNavigationBar(){
    NavigationBar {
        Row(
            modifier = Modifier.background(MaterialTheme.colorScheme.onBackground)
        ) {
items.forEachIndexed{index, item ->
    
    NavigationBarItem(
        selected =index==0,
        onClick = {},
        icon = {
         Icon(
             imageVector = item.icon , contentDescription = item.title,
             tint = MaterialTheme.colorScheme.onPrimary)
        },

        label = {
            Text(text = item.title,
                color = MaterialTheme.colorScheme.onPrimary)
        }
        )

}


        }
    }

}