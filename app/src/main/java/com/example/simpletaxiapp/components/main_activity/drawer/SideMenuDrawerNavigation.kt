package com.example.simpletaxiapp.components.main_activity.drawer

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpletaxiapp.R

data class NavigationDrawerItem(
    val id: Int,
    val name: String,
    @DrawableRes val icon: Int
)

val drawerMenuItems = listOf(
    NavigationDrawerItem(1, "Sürüşlerim", R.drawable.bookmark_filled_icon),
    NavigationDrawerItem(2, "Cüzdanım", R.drawable.wallet_filled_icon),
    NavigationDrawerItem(3, "Acil Durum Kişileri", R.drawable.phone_filled_icon),
    NavigationDrawerItem(4, "Bildirimler", R.drawable.notification_filled_icon),
    NavigationDrawerItem(5, "Davetler", R.drawable.gift_filled_icon),
    NavigationDrawerItem(6, "Diller", R.drawable.globe_filled_icon),
    NavigationDrawerItem(7, "Hakkında", R.drawable.status_info_filled_icon),
)

@Composable
fun SideMenuDrawerNavigation() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(1f)
            .background(Color.White)
    ) {
        drawerMenuItems.forEach { item -> SideMenuDrawerNavigationItem(item) }
    }
}

@Composable
fun SideMenuDrawerNavigationItem(item: NavigationDrawerItem) {
    Row(
        horizontalArrangement = Arrangement.spacedBy(40.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = item.icon),
            contentDescription = item.name,
            modifier = Modifier
                .size(36.dp)
        )
        Text(item.name, style = TextStyle(
            fontSize = 22.sp
        ))
    }
}