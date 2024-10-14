package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class VehicleLocation(
    val latitude: Double,
    val longitude: Double,
    val carCapturedTimestamp: String,
)