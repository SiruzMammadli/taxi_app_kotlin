package com.example.simpletaxiapp.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simpletaxiapp.components.main_activity.bottom_sheet.BottomSheetContent
import com.example.simpletaxiapp.components.main_activity.bottom_sheet.OverBottomSheet
import com.example.simpletaxiapp.components.main_activity.drawer.SideMenuDrawer
import com.example.simpletaxiapp.screens.ui.theme.SimpleTaxiAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreen() {
    SimpleTaxiAppTheme {
        SideMenuDrawer { drawerState ->
            BottomSheetScaffold(
                sheetPeekHeight = LocalConfiguration.current.screenHeightDp.dp / 2.2f,
                sheetContainerColor = Color.White,
                sheetShape = RectangleShape,
                sheetDragHandle = {
                    Box(
                        modifier = Modifier
                            .padding(top = 8.dp, bottom = 16.dp)
                            .size(width = 120.dp, height = 5.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(Color.LightGray),
                    )
                },
                sheetContent = { BottomSheetContent() },
            ) {
                OverBottomSheet(drawerState);
            }
        }
    }
}