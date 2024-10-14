package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class VentilationStatus(
    val temp: Double = 0.0,
    val isRunning: Boolean = false
)
