package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
//Practica 2
//variables
val float = 11.5
val const = 3.14159265359
val result = float * const
fun main (){
    print("El perímetro del círculo es:  $float x $const = $result ")
}


