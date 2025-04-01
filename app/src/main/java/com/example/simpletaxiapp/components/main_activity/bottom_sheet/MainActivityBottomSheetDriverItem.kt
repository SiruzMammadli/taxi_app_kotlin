package com.example.simpletaxiapp.components.main_activity.bottom_sheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpletaxiapp.R

@Composable
fun MainActivityBottomSheetDriverItem() {
    Column(
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(6.dp))
                .border(width = 1.dp, color = Color(0xFF13365C), shape = RoundedCornerShape(6.dp))
                .background(Color(0xFFE1E6EA))
                .padding(4.dp),
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.car_vector),
                    contentDescription = "car_image",
                    modifier = Modifier
                        .size(100.dp)
                )
            }
            Column(
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "TAKSİ", style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium
                            )
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.user_icon),
                                contentDescription = "user_icon",
                                colorFilter = ColorFilter.tint(Color(0xFF8C8C8C)),
                                modifier = Modifier
                                    .size(24.dp)
                            )
                            Text(
                                "3", style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            )
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "115₺", style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium
                            )
                        )
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.status_info_icon),
                                contentDescription = "status_info",
                                colorFilter = ColorFilter.tint(Color(0xFF8C8C8C)),
                                modifier = Modifier
                                    .size(20.dp)
                            )
                        }
                    }
                }
                Row {
                    Text("Bırak 17:13, 5 dakika uzak")
                }
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(6.dp))
                .border(width = 1.dp, color = Color(0xFF8C8C8C), shape = RoundedCornerShape(6.dp))
                .padding(4.dp),
        ) {
            Box {
                Image(
                    painter = painterResource(id = R.drawable.car_vector),
                    contentDescription = "car_image",
                    modifier = Modifier
                        .size(100.dp)
                )
            }
            Column(
                modifier = Modifier
                    .padding(vertical = 16.dp, horizontal = 16.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(1f),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "TAKSİ", style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium
                            )
                        )
                        Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.user_icon),
                                contentDescription = "user_icon",
                                colorFilter = ColorFilter.tint(Color(0xFF8C8C8C)),
                                modifier = Modifier
                                    .size(24.dp)
                            )
                            Text(
                                "3", style = TextStyle(
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            )
                        }
                    }
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "115₺", style = TextStyle(
                                fontSize = 18.sp,
                                fontWeight = FontWeight.Medium
                            )
                        )
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.status_info_icon),
                                contentDescription = "status_info",
                                colorFilter = ColorFilter.tint(Color(0xFF8C8C8C)),
                                modifier = Modifier
                                    .size(20.dp)
                            )
                        }
                    }
                }
                Row {
                    Text("Bırak 17:13, 5 dakika uzak")
                }
            }
        }
    }
}