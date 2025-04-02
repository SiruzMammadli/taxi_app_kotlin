package com.example.simpletaxiapp.utils

import android.content.Context
import com.example.simpletaxiapp.dtos.TransportData
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

fun fetchJsonData(context: Context, fileName: String): List<TransportData> {
    return Gson().fromJson(
        context.assets.open(fileName).bufferedReader().use { it.readText() },
        object : TypeToken<List<TransportData>>() {}.type
    )
}