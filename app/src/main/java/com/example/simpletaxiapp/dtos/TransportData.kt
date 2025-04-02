package com.example.simpletaxiapp.dtos

data class TransportData(
    val id: Int,
    val car: Car,
    val transport: Transport
)

data class Car(
    val driver: Driver,
    val model: String,
    val passengers: Int
)

data class Driver(
    val name: String
)

data class Transport(
    val price: Int,
    val currency: String
)