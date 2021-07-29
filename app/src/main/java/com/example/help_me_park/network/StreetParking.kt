package com.example.help_me_park.network

data class StreetParking(
    val location: ParkingLocation,
    val vacancy: Boolean,
    val rules: List<String>,
    val fee: Double,
    val image: String) {}

data class ParkingLocation(
    val latitude: Double,
    val longitude: Double) {}