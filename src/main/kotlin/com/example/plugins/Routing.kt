package com.example.plugins

import com.example.app.Vehicle
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
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
    }
}
