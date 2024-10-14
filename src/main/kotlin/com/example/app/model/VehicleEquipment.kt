package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class VehicleEquipment(
    val equipment: List<Equipment> = listOf(),
    val carCapturedTimestamp: String = "2021-01-01T00:00:00Z",
)

@Serializable
data class Equipment(
    val name: String,
    val description: String,
    val videoUrl: String,
    val videoThumbnailUrl: String,
)