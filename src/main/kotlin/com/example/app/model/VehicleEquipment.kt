package com.example.app.model

import kotlinx.serialization.Serializable

// {"equipment":[{"name":"Side Assist","description":"Your car is equipped with a side assist.","videoUrl":"https://player.vimeo.com/video/878184722?h=cb488571c6","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_15_SideAssist_thb"},{"name":"Lane Assist ","description":"Your car is equipped with an adaptive lane assist.","videoUrl":"https://player.vimeo.com/video/888627228?h=22ed8c5108","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_02_AdaptiveLaneAssist_thb"},{"name":"Infotainment display with navigation","description":"Your car is equipped with an Infotainment display with new navigation.","videoUrl":"https://player.vimeo.com/video/877936165?h=ba1dec507f","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_05_InfotainmentDisplay_thb"},{"name":"Front Assist and Turn Assist","description":"Your car is equipped with a front assist and turn assist.","videoUrl":"https://player.vimeo.com/video/877923096?h=d92e6159f9","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_14_FrontAssistTurningAssist_thb"},{"name":"Multifunctional steering wheel and Digital Cockpit","description":"Your car is equipped with a multifunctional steering wheel and digital cockpit.","videoUrl":"https://player.vimeo.com/video/878185910?h=d9f46e4c61","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_01_SteeringWheelCockpit_thb"},{"name":"ICE SCRAPER","description":"Your car is equipped with an ice scraper.","videoUrl":"https://player.vimeo.com/video/880819319?h=1c056825ef","videoThumbnailUrl":"https://go.skoda.eu/SC_IceScraper_thb"}]}

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