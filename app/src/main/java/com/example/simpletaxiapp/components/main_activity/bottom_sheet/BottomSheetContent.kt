package com.example.simpletaxiapp.components.main_activity.bottom_sheet

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpletaxiapp.dtos.TransportData
import com.example.simpletaxiapp.utils.fetchJsonData

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun BottomSheetContent() {
    val context = LocalContext.current
    val transportData by produceState<List<TransportData>>(initialValue = emptyList<TransportData>()) {
        value = fetchJsonData(context, "drivers_data.json")
    }
    var (activeTransportId, setActiveTransportId) = rememberSaveable { mutableIntStateOf(-1) }

    LaunchedEffect(transportData) {
        if (transportData.isNotEmpty()) {
            setActiveTransportId(transportData[0].id)
        }
    }

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .height(LocalConfiguration.current.screenHeightDp.dp / 2.2f - 54.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier
                .padding(8.dp)
        ) {
            transportData.forEach { data ->
                BottomSheetDriverItem(
                    data, activeTransportId,
                    Modifier
                        .clickable(onClick = {
                            setActiveTransportId(data.id)
                        })
                )
            }
        }
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