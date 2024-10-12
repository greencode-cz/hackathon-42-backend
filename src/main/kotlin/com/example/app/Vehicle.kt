package com.example.app

object Vehicle {
    private var isLocked: Boolean = false
    private var isVentilationActive: Boolean = false
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
}