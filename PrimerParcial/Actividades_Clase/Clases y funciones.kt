package com.example.actividadesenclase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.net.PasswordAuthentication
import kotlin.math.roundToInt
import java.util.Scanner


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

/**
Clases  y funciones.
 */

class `9noPrograma_Vehiculo` {
    var color=""
    var marca=""
    var modelo=""
    var placas=""
    var gasolina=0f
    var encendido=false

    fun encender(){
        encendido=true
    }

    fun apagar(){
        encendido=false
    }

    fun recargar(litros:Float){
        gasolina+=litros
    }
}

fun main(){
    val miVehiculo = `9noPrograma_Vehiculo`()
    miVehiculo.color="verde"
    miVehiculo.marca="Vs Marca"
    miVehiculo.modelo="Focus"
    miVehiculo.placas="REM-4123"

    println("El coche esta prendido? ${miVehiculo.encendido}")
    miVehiculo.encender()
    println("El coche esta prendido? ${miVehiculo.encendido}")

    println("El tanque tiene ${miVehiculo.gasolina}")
    miVehiculo.recargar(20.07f)
    println("El tanque tiene: ${miVehiculo.gasolina}")
}
