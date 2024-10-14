package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class ChargingSessions(
    val sessions: List<Session>,
)

@Serializable
data class Session(
    val startAt: String,
    val chargedInKw: Double,
    val durationInSec: Long,
)