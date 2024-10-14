package com.example.plugins

import com.example.app.Vehicle
import com.example.app.model.ChargingProfiles
import com.example.app.model.VehicleCharging
import com.example.app.model.VehicleEquipment
import com.example.app.model.VehicleStatus
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.json.Json

fun Application.configureRouting() {
    val json = Json { encodeDefaults = true }
    routing {
        get("/") {
            call.respond(HttpStatusCode.OK, "Hello, Peter!")
        }
        get("/vehicle/lock") {
            Vehicle.lock()
            call.respond(HttpStatusCode.OK, "Vehicle is locked: ${Vehicle.lockStatus()}")
        }
        get("/vehicle/unlock") {
            Vehicle.unlock()
            call.respond(HttpStatusCode.OK, "Vehicle is locked: ${Vehicle.lockStatus()}")
        }
        get("/vehicle/ventilation/start") {
            Vehicle.startVentilation()
            call.respond(HttpStatusCode.OK, "Vehicle ventilation is active: ${Vehicle.ventilationStatus()}")
        }
        get("/vehicle/ventilation/stop") {
            Vehicle.stopVentilation()
            call.respond(HttpStatusCode.OK, "Vehicle ventilation is active: ${Vehicle.ventilationStatus()}")
        }
        get("/vehicle/ventilation/status") {
            call.respond(HttpStatusCode.OK, "Vehicle ventilation is active: ${Vehicle.ventilationStatus()}")
        }
        get("/vehicle/") {
            val vehicleStatus = VehicleStatus()
            val vehicleStatusJson = json.encodeToString(serializer = VehicleStatus.serializer(), value = vehicleStatus)
            call.respondText(
                text = vehicleStatusJson,
                contentType = ContentType.Application.Json
            )
        }
        get("/vehicle/charging/") {
            val vehicleCharging = VehicleCharging()
            val vehicleChargingJson =
                json.encodeToString(serializer = VehicleCharging.serializer(), value = vehicleCharging)
            call.respondText(
                text = vehicleChargingJson,
                contentType = ContentType.Application.Json
            )
        }
        get("/vehicle/charging/profiles") {
            val vehicleChargingProfiles = ChargingProfiles()
            val vehicleChargingJson =
                json.encodeToString(serializer = ChargingProfiles.serializer(), value = vehicleChargingProfiles)
            call.respondText(
                text = vehicleChargingJson,
                contentType = ContentType.Application.Json
            )
        }

        get("/vehicle/equipment") {
            val jsonString =
                """{"equipment":[{"name":"Side Assist","description":"Your car is equipped with a side assist.","videoUrl":"https://player.vimeo.com/video/878184722?h=cb488571c6","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_15_SideAssist_thb"},{"name":"Lane Assist ","description":"Your car is equipped with an adaptive lane assist.","videoUrl":"https://player.vimeo.com/video/888627228?h=22ed8c5108","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_02_AdaptiveLaneAssist_thb"},{"name":"Infotainment display with navigation","description":"Your car is equipped with an Infotainment display with new navigation.","videoUrl":"https://player.vimeo.com/video/877936165?h=ba1dec507f","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_05_InfotainmentDisplay_thb"},{"name":"Front Assist and Turn Assist","description":"Your car is equipped with a front assist and turn assist.","videoUrl":"https://player.vimeo.com/video/877923096?h=d92e6159f9","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_14_FrontAssistTurningAssist_thb"},{"name":"Multifunctional steering wheel and Digital Cockpit","description":"Your car is equipped with a multifunctional steering wheel and digital cockpit.","videoUrl":"https://player.vimeo.com/video/878185910?h=d9f46e4c61","videoThumbnailUrl":"https://go.skoda.eu/ENYAQ_2021_01_SteeringWheelCockpit_thb"},{"name":"ICE SCRAPER","description":"Your car is equipped with an ice scraper.","videoUrl":"https://player.vimeo.com/video/880819319?h=1c056825ef","videoThumbnailUrl":"https://go.skoda.eu/SC_IceScraper_thb"}]}"""
            val vehicleEquipment = Json.decodeFromString(VehicleEquipment.serializer(), jsonString)
            val vehicleEquipmentJson =
                json.encodeToString(serializer = VehicleEquipment.serializer(), value = vehicleEquipment)
            call.respondText(
                text = vehicleEquipmentJson,
                contentType = ContentType.Application.Json
            )
        }
    }
}
