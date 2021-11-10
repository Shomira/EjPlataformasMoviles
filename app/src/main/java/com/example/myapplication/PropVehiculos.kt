package com.example.myapplication

class PropVehiculos(val motor: String, val tonelaje: Double, val capacidad: Int, val tipoVehiculos: Array<Vehiculo> ) {
    enum class Vehiculo{
        Agrícola,
        Industrial,
        Camion,
        Autobus
    }

    fun code(){
        for (vehiculo in tipoVehiculos){
            println("Tipo de vehiculo: "+vehiculo)
        }
    }
}
