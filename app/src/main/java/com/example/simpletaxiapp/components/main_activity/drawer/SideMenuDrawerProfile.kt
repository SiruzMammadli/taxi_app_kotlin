package com.example.simpletaxiapp.components.main_activity.drawer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpletaxiapp.R

@Composable
fun SideMenuDrawerProfile() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(.3f)
            .background(Color(0xFF13365C))
            .padding(horizontal = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(percent = 50))
                .border(
                    width = 2.dp,
                    color = Color.White,
                    shape = RoundedCornerShape(percent = 50)
                )
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "avatar",
                modifier = Modifier
                    .size(width = 100.dp, height = 100.dp)
            )
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            Text(
                "Siruz Mammadli", style = TextStyle(
                    fontSize = 16.sp,
                    color = Color.White
                )
            )
            Text(
                "siruz.mammadli@gmail.com", style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.White
                )
            )
            Spacer(modifier = Modifier.height(6.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
            ) {
                Text(
                    "Profili düzenle",
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                )
            }
        }
    }
}