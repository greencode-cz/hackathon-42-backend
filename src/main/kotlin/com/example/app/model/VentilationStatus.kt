package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class VentilationStatus(
    val isRunning: Boolean = false
)
