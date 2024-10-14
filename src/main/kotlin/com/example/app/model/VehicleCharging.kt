package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class VehicleCharging (
    val isVehicleInSavedLocation: Boolean = false,
    val status: Status = Status(battery = Battery()),
    val settings: Settings = Settings(),
    val carCapturedTimestamp: String = "2021-01-01T00:00:00Z",
)

@Serializable
data class Status(
    val chargingRateInKilometersPerHour: Double = 0.0,
    val chargePowerInKw: Double = 0.0,
    val remainingTimeToFullyChargedInMinutes: Long = 42,
    val state: String = "CHARGING",
    val battery: Battery,
)

@Serializable
data class Battery(
    val remainingCruisingRangeInMeters: Long = 320,
    val stateOfChargeInPercent: Long = 100,
)

@Serializable
data class Settings(
    val targetStateOfChargeInPercent: Long = 70,
    val preferredChargeMode: String = "MANUAL",
    val availableChargeModes: List<String> = listOf("MANUAL"),
    val chargingCareMode: String = "DEACTIVATED",
    val autoUnlockPlugWhenCharged: String = "OFF",
    val maxChargeCurrentAc: String = "MAXIMUM",
    val batterySupport: String = "ENABLED",
)
