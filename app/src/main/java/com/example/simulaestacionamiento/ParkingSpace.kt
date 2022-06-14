package com.example.simulaestacionamiento

import java.util.*

data class ParkingSpace (var vehicle : Vehicle) {

    fun checkOut(plateVehi : String){
        val parkedTime : Long
        parkedTime = (Calendar.getInstance().timeInMillis - vehicle.checkInTime) / 60000
    }


var ListaAceptada = listOf("auto","moto","minibus","bus")

    fun tipoVehiculo (tipAuto : String) : Boolean{
        return ListaAceptada.contains(tipAuto)
    }

}