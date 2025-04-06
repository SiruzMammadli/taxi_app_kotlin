package com.example.simpletaxiapp.components.main_activity.bottom_sheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpletaxiapp.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OverBottomSheetLocation() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(6.dp))
            .background(Color.White)
            .padding(horizontal = 10.dp, vertical = 20.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 6.dp)
                .width(16.dp)
                .height(80.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color(0xFF26E28F))
                    .size(14.dp)
            )
            Box(
                modifier = Modifier
                    .weight(1f)
                    .width(2.dp)
                    .border(width = 1.dp, color = Color(0xFF8C8C8C))
            )
            Image(
                painter = painterResource(id = R.drawable.location_filled_icon),
                contentDescription = "location_icon",
                modifier = Modifier
                    .size(16.dp),
                colorFilter = ColorFilter.tint(Color(0xFFF30604))
            )
        }
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            LocationItem("Teslim Alma Konumu")
            LocationItem("Varış Konumu")
        }
    }
}

@Composable
fun LocationItem(heading: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
            .padding(end = 8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            Text(heading, color = Color(0xFF848484), fontSize = 16.sp)
            Text("Lorem ipsum dolor sit amet", fontSize = 14.sp)
        }
        Box(
            modifier = Modifier
                .align(Alignment.Bottom)
                .padding(bottom = 2.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.close_icon),
                contentDescription = "close_icon",
                modifier = Modifier
                    .size(16.dp),
                colorFilter = ColorFilter.tint(Color(0xFF848484))
            )
        }
    }
}