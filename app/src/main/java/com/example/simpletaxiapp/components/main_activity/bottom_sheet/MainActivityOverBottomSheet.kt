package com.example.simpletaxiapp.components.main_activity.bottom_sheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpletaxiapp.R
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.rememberCameraPositionState
import com.google.maps.android.compose.rememberMarkerState
import kotlinx.coroutines.launch

@Composable
fun MainActivityOverBottomSheet(drawerState: DrawerState) {
    val coroutineScope = rememberCoroutineScope();

    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .clickable {
                        coroutineScope.launch { drawerState.open() }
                    },
            ) {
                Image(
                    painter = painterResource(id = R.drawable.bars_icon),
                    contentDescription = "map_example",
                    contentScale = ContentScale.Crop,
                    colorFilter = ColorFilter.tint(Color(0xFF8C8C8C)),
                    modifier = Modifier
                        .size(20.dp)
                )
            }
            Text(
                "Yolculuk rezervasyonu yapın", style = TextStyle(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center,
                ), modifier = Modifier
                    .fillMaxWidth(0.85f)
            )
        }
        Box {
//            Image(
//                painter = painterResource(id = R.drawable.map_example),
//                contentDescription = "map_example",
//                contentScale = ContentScale.Crop,
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .fillMaxHeight()
//            )
                    val cameraPositionState = rememberCameraPositionState() {
                        position = CameraPosition.fromLatLngZoom(LatLng(40.4093, 49.8671), 12f)
                    }
                    GoogleMap(
                        modifier = Modifier
                            .fillMaxSize(),
                        cameraPositionState = cameraPositionState
                    ) {
                        Marker(
                            state = rememberMarkerState(position = LatLng(40.4093, 49.8671)),
                            title = "Bakü",
                            snippet = "Azerbaycan'ın Başkenti"
                        )
                    }
        }
    }
}