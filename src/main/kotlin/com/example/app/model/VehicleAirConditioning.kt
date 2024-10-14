package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class VehicleAirConditioning (
    val estimatedDateTimeToReachTargetTemperature: String,
    val state: String,
    val runningRequests: List<String?>,
    val targetTemperature: TargetTemperature,
    val airConditioningAtUnlock: Boolean,
    val windowHeatingEnabled: Boolean,
    val steeringWheelPosition: String,
    val seatHeatingActivated: SeatHeatingActivated,
    val chargerConnectionState: String,
    val chargerLockState: String,
    val windowHeatingState: WindowHeatingState,
    val timers: List<AirConditioningTimer>,
    val carCapturedTimestamp: String,
    val errors: List<String?>,
)

@Serializable
data class TargetTemperature(
    val temperatureValue: Double,
    val unitInCar: String,
)

@Serializable
data class SeatHeatingActivated(
    val frontLeft: Boolean,
    val frontRight: Boolean,
)

@Serializable
data class WindowHeatingState(
    val front: String,
    val rear: String,
    val unspecified: String,
)

@Serializable
data class AirConditioningTimer(
    val id: Long,
    val enabled: Boolean,
    val time: String,
    val type: String,
    val selectedDays: List<String>,
)

