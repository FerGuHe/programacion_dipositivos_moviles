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
Verificacion de edad.
 */

/** Si la edad es menor a 18 es menor de edad , si es mayor a 18 */

val reader = Scanner(System.`in`)
val edad : Int = 0

fun veri(){
    if (edad >= 18)
        print(" Eres mayor de edad")
    else if ( edad <= 18){
        print("Eres menor de edad")

    }
}

fun main() {
        println("Ingresa tu edad :")
        var edad:Int = reader.nextInt()
        println("Tu edad es: $edad")
    if (edad >= 18)
        print(" Eres mayor de edad.")
    else if ( edad <= 18){
        print("Eres menor de edad.")

    }
}





