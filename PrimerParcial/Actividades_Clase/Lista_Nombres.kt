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
Lista de nombres, contador de repetidos.
 */

val nombres = listOf("Pedro", "Juan", "Maria", "Romero", "Ernesto", "Juan", "Ariadna", "Mireya", "Ana", "Jose Delgado Riivera alias tu abueito")
val nombreBuscar= "Juan"

fun main(){
    fun contarRepeticiones(nombre:String, listaNombres: List<String>): Int{
        var contador=0
        for (nombreActual in listaNombres){
            if (nombreActual==nombre){
                contador++
            }
        }
        return contador
    }
    val repeticiones=contarRepeticiones(nombreBuscar,nombres)
    println("El nombre '$nombreBuscar' se repite $repeticiones veces en la lista.")
}
