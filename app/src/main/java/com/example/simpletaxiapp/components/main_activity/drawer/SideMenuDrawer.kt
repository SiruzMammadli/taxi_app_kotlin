package com.example.simpletaxiapp.components.main_activity.drawer

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp

@Composable
fun SideMenuDrawer(content: @Composable (drawerState: DrawerState) -> Unit) {
    val drawerState = rememberDrawerState(DrawerValue.Closed)

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                drawerShape = RectangleShape,
                drawerContainerColor = Color.White,
                content = {
                    SideMenuDrawerContent()
                },
                windowInsets = WindowInsets(0.dp),
                modifier = Modifier
                    .fillMaxHeight()
            )
        },
        gesturesEnabled = drawerState.isOpen
    ) {
        content(drawerState)
    }
}