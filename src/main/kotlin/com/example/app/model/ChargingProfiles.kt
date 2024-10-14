package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class ChargingProfiles(
    val chargingProfiles: List<ChargingProfile> = listOf(ChargingProfile()),
    val carCapturedTimestamp: String = "2021-01-01T00:00:00Z",
)

@Serializable
data class ChargingProfile(
    val id: Long = 42,
    val name: String = "Home",
    val settings: ChargingProfileSettings = ChargingProfileSettings(),
    val preferredChargingTimes: List<PreferredChargingTime> = listOf(PreferredChargingTime()),
    val timers: List<Timer> = listOf(Timer()),
)

@Serializable
data class ChargingProfileSettings(
    val maxChargingCurrent: String = "MAXIMUM",
    val minBatteryStateOfCharge: MinBatteryStateOfCharge = MinBatteryStateOfCharge(10),
    val targetStateOfChargeInPercent: Long = 70,
    val autoUnlockPlugWhenCharged: String = "OFF",
)

@Serializable
data class MinBatteryStateOfCharge(
    val minimumBatteryStateOfChargeInPercent: Long = 10,
)

@Serializable
data class PreferredChargingTime(
    val id: Long = 42,
    val enabled: Boolean = true,
    val startTime: String = "22:00",
    val endTime: String = "06:00",
)

@Serializable
data class Timer(
    val id: Long = 42,
    val enabled: Boolean = true,
    val time: String = "22:00",
    val type: String = "ONCE",
    val recurringOn: List<String> = listOf("MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY"),
)