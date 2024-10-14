package com.example.app.model

import kotlinx.serialization.Serializable

@Serializable
data class VehicleStatus (
    val name: String = "Eniaq",
    val workshopModeEnabled: Boolean = false,
    val state: String = "ACTIVATED",
    val devicePlatform: String = "WCAR",
    val softwareVersion: String = "3.7",
    val specification: Specification = Specification()
) {
    @Serializable
    data class Specification(
        val title: String = "ENYAQ iV 80",
        val manufacturingDate: String = "2021-01-01",
        val model: String = "ENYAQ iV",
        val modelYear: String = "2021",
        val body: String = "SUV",
        val trimLevel: String = "80",
        val systemCode: String = "NE",
        val systemModelId: String = "NE",
        val maxChargingPowerInKw: Long = 50,
        val battery: Battery = Battery(
            capacityInKwh = 82,
        ),
        val engine: Engine = Engine(
            type = "electric",
            powerInKw = 150,
        ),
        val gearbox: Gearbox = Gearbox(
            type = "single-speed",
        ),
    )

    @Serializable
    data class Engine(
        val type: String,
        val powerInKw: Long,
    )

    @Serializable
    data class Gearbox(
        val type: String,
    )

    @Serializable
    data class Battery(
        val capacityInKwh: Long,
    )
}