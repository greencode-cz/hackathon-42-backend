package com.example.app

object Vehicle {
    private var isLocked: Boolean = false
    private var isVentilationActive: Boolean = false
    private var temperature: Double = 0.0

    fun lock() {
        isLocked = true
    }

    fun unlock() {
        isLocked = false
    }

    fun lockStatus(): Boolean = isLocked

    fun startVentilation() {
        isVentilationActive = true
    }

    fun stopVentilation() {
        isVentilationActive = false
    }

    fun ventilationStatus(): Boolean = isVentilationActive

    fun increaseTemperature() {
        temperature += 5.0
    }

    fun decreaseTemperature() {
        temperature -= 5.0
        if (temperature < 0.0) {
            temperature = 0.0
        }
    }

    fun getTemp(): Double = temperature
}