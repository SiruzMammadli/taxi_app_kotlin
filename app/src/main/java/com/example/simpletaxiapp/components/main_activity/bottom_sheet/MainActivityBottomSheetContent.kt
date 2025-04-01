package com.example.simpletaxiapp.components.main_activity.bottom_sheet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MainActivityBottomSheetContent() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .height(LocalConfiguration.current.screenHeightDp.dp / 2.2f - 54.dp)
    ) {
        MainActivityBottomSheetDriverItem()
        Box(
            modifier = Modifier
                .background(Color(0xFF13365C))
                .fillMaxWidth()
                .height(54.dp),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                "Şimdi binin", style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White
                )
            )
        }
    }
}