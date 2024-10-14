package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class VehicleLockStatus(
    val isOpen: Boolean = false,
)