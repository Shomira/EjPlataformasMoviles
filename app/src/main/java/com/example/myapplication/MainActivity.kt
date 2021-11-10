package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TALLER
        //1. Validar si una persona es mayor o menor de edad
       // validarEdad()
        // 2. Tabla de multiplicar de forma ascendente y descendente
       // tablaMultiplicar()
        // 3. Mostrar listado de paralelo de la materia de Plataformas Moviles
        // y los subgrupos por proyectos(mostrar resultados ordenados)

       // listPlataformasMoviles()
        // 4. Propiedades Automoviles
        //propiedadesAutomoviles()
        // TALLER EN CLASE
        //ordenarArray()
        validarCedula()
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
    private fun ordenarArray(){
        val arrEdades= arrayListOf<Int>()
        arrEdades.addAll(listOf(24, 34, 32, 28, 29, 22, 21, 20))
        var aux =0
        println(arrEdades.size)
        // Ordenar de mayor a menor
        for (i in 0 until arrEdades.size) {
            for (j in 0 until arrEdades.size) {
                if (arrEdades[i] > arrEdades[j]) {
                    aux = arrEdades[i]
                    arrEdades[i] = arrEdades[j]
                    arrEdades[j] = aux
                    println("${arrEdades[i]}")
                }
            }
        }
        println("$arrEdades")

    }
    private fun validarCedula(){
        //val cedula = "0704757319"
        val cedula = "1087978008"
        // Extraemos los dos primeros digitos que son de la region
        var digitoRegion = Integer.parseInt(cedula.substring(0,2))
        // Extraemos el ultimo digito que es el validador
        var ultimoDigito   = Integer.parseInt(cedula.substring(9,10))
        val arrMult= arrayListOf<Int>()
        arrMult.addAll(listOf(2, 1, 2, 1, 2, 1, 2, 1, 2 ))

        var digito = 0
        var suma =0
        var i =0
        var sms = "La valor no corresponde a un número de cédula"
        if ( cedula.length == 10){
            // Validamos si la region existe, tomando en cuenta que el maximo debe ser 24
            if ( (digitoRegion >= 1) && (digitoRegion <=24)){
                while( i < cedula.length -1){
                    digito = Integer.parseInt(cedula.substring(i, i +1)) * arrMult[i]
                    // Si el resultado  de la variable digito es mayor a nueve se resta nueve.
                    if ( digito > 9 ){
                        digito -= 9
                        suma += digito
                    }else{
                        suma += digito
                    }
                    i+= 1
                }
                // Validar Cedula - Dividimos el resultado de la suma para 10 y si el residuo es
                // igual al último digito de la cedula, entonces la cédula es vélida
                // Si el residuo es 0 la cédula es correcta, caso contrario de que no conicida con
                // el último digito, entonces el número no es correcto
                if(( suma % 10 == 0) && ( suma%10 == ultimoDigito)){
                    println("El número de cédula es válido")
                    println(suma % 10)
                }else if((10 - (suma % 10)) ==  ultimoDigito){
                    println("El número de cédula es válido")
                }else{
                    println(sms)
                }

            }else{
                println(sms)
            }
        }else{
            println(sms)
        }

    }

}