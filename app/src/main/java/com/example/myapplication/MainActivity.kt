package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TALLER
        //1. Validar si una persona es mayor o menor de edad
        validarEdad()
        // 2. Tabla de multiplicar de forma ascendente y descendente
        tablaMultiplicar()
        // 3. Mostrar listado de paralelo de la materia de Plataformas Moviles
        // y los subgrupos por proyectos(mostrar resultados ordenados)

        listPlataformasMoviles()
        // 4. Propiedades Automoviles
        propiedadesAutomoviles()
    }
    //PUNTO 1
    private fun validarEdad(){
        val edad = 20

        if ( edad >= 18 ) {
            println("La persona es mayor de edad ")
        }else if(edad < 18){
            println("La persona es menor de edad ")
        }
    }
    //PUNTO 2
    // Presentar la tabla de multiplicar de n numero de forma ascendente y descendente.
    private fun tablaMultiplicar(){
        println("TABLAS DE MULTIPLICAR DEL NUMERO 9")
        var mult = 0
        var x1 = 9
        println("FORMA ASCENDENTE")
        for (x in 0..10){
            mult = x1 * x
            println( "$x1 x $x = $mult" )
        }
        println("FORMA DESCENDENTE")
        for(x in 10 downTo 0 ){
            mult = x1 * x
            println( "$x1 x $x = $mult" )
        }
    }
    // PUNTO 3
    private fun listPlataformasMoviles(){
        var a = 4
        var b = 5
        val estudiantes= arrayListOf<String>()
        val grupoTurismo= arrayListOf<String>()
        val grupoEconomia= arrayListOf<String>()
        estudiantes.addAll(listOf("Joan Briceño", "Andres Vallejo", "Israel Tapia", "David Salazar",
            "Jeferson Cueva", "Jordy Esparza", "Ricardo Freire", "Santiago Garcia", "Brandon Vega",
            " Frank Saca", "Shomira Rosales"))
        println("Proyecto Turismo")

        while (a >= 0){
            grupoTurismo.add(estudiantes[a])
            a-=1
        }
        println(" GRUPO PROYECTO TURISMO: ${grupoTurismo.sorted()}")

        while (b <= 10){
            grupoEconomia.add(estudiantes[b])
            b+=1
        }
        println(" GRUPO PROYECTO ECONOMIA: ${grupoEconomia.sorted()}")

    }


    //PUNTO 4
    private fun propiedadesAutomoviles(){
        val automovil1 = PropVehiculos(motor = "Diésel", tonelaje = 2.2, capacidad = 4, arrayOf(PropVehiculos.Vehiculo.Industrial,
            PropVehiculos.Vehiculo.Camion))
        println(automovil1.motor)
        automovil1.code()

        //val sara= Programmer(name = "Sara", age = 29, arrayOf("Flutter", "Java", "C++"))
        val automovil2= PropVehiculos(motor = "Gasolina", tonelaje = 2.1, capacidad = 3,  arrayOf(PropVehiculos.Vehiculo.Autobus))
        automovil2.code()
    }




}