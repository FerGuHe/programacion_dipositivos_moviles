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
Verificacion de tipo de dato.
 */

val reader = Scanner(System.`in`)
val tipo : Any = 0

fun senteciawhen(){
    val tipo = ""

}
fun main() {
        var tipo:Any = 5.0
        println("Datos introducido $tipo")
        println("Tu dato es: ${tipo.javaClass}")

}





