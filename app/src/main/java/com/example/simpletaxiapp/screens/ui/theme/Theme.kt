package com.example.simpletaxiapp.screens.ui.theme

import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.simpletaxiapp.R

val Poppins = FontFamily(
    Font(R.font.poppins_light, FontWeight.Light),
    Font(R.font.poppins_regular, FontWeight.Normal),
    Font(R.font.poppins_medium, FontWeight.Medium),
    Font(R.font.poppins_semibold, FontWeight.SemiBold),
    Font(R.font.poppins_bold, FontWeight.Bold),
)

@Composable
fun SimpleTaxiAppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        typography = Typography(
            bodyLarge = TextStyle(
                fontFamily = Poppins,
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal
            ),
            headlineLarge = TextStyle(
                fontFamily = Poppins,
                fontSize = 32.sp,
                fontWeight = FontWeight.SemiBold
            )
        )
    ) {
        Surface(
            modifier = Modifier
                .background(Color.White)
        ) {
            content()
        }
    }
}