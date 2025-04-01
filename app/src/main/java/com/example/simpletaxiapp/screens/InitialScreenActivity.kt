package com.example.simpletaxiapp.screens

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpletaxiapp.R
import com.example.simpletaxiapp.screens.ui.theme.SimpleTaxiAppTheme

class InitialScreenActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            InitialScreen()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun InitialScreen() {
    val context = LocalContext.current;
    SimpleTaxiAppTheme {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(horizontal = 16.dp)
                .fillMaxHeight()
                .systemBarsPadding(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(6.dp),
                    modifier = Modifier
                        .padding(8.dp)
                        .clickable { println("meyveye deyme") },
                ) {
                    Text("Türkçe")
                    Image(
                        painter = painterResource(id = R.drawable.language_icon),
                        contentDescription = "change_language",
                        modifier = Modifier
                            .size(20.dp)
                    )
                }
            }
            Box {
                Image(
                    painter = painterResource(id = R.drawable.baskent_taksi_logo),
                    contentDescription = "brand logo",
                    modifier = Modifier
                        .size(80.dp)
                )
            }
            Box {
                Image(
                    painter = painterResource(id = R.drawable.initial_screen_image),
                    contentDescription = "bg_image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(.4f)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth(.7f)
            ) {
                Text(
                    text = "Güvenli ve Güvenilir Sürüşlerinizi Keşfedin",
                    style = TextStyle(
                        color = Color(0xFF13365C),
                        fontSize = 36.sp
                    ),
                    textAlign = TextAlign.Center
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(4.dp))
                    .background(Color(0xFF13365C))
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(56.dp)
                    .clickable {
                        context.startActivity(Intent(context, MainActivity::class.java))
                    },
            ) {
                Text(
                    text = "Başlayın",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier
                        .weight(1f)
                )
                Image(
                    painter = painterResource(id = R.drawable.chevron_right_icon),
                    contentDescription = "chevron_icon",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .size(14.dp)
                )
            }
        }
    }
}