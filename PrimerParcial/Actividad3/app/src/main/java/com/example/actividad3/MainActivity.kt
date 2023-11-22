package com.example.actividad3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.pow


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

const val a = -2f
const val b = 3f
const val c = -3f
const val d = 4f

fun main(){
    val re = (a-b) / (c-d)
    println("La pendiente es igual a: $re")

}