package com.example.simulaestacionamiento

data class Parking(val vehicles : MutableSet<Vehicle>) {
    fun validaPlate(Patente : String){
        for (Auto in vehicles){
            if(Auto.equals(Patente)){
                println("la patente ya esta registrada")
                break
            }

        }
    }
}