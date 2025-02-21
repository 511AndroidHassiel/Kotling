package com.example.koffingames.games

fun main() {
    println("Por favor, ingresa un número entero para verificar si es primo.")
    var numInput = readlnOrNull()?.toIntOrNull()
    var esPrimo: Boolean

    while (numInput == null || numInput <= 1) {
        println("El número ingresado no es primo. Por favor, ingresa otro número.")
        numInput = readlnOrNull()?.toIntOrNull()
    }

    do {
        esPrimo = true

        for (i in 2 until numInput!!) {
            if (numInput % i == 0) {
                esPrimo = false
                break
            }
        }

        if (esPrimo) {
            println("El número ingresado es primo.")
            break
        } else {
            println("El número ingresado no es primo. Por favor, ingresa otro número.")
            numInput = readlnOrNull()?.toIntOrNull()
        }
    } while (numInput == null || numInput <= 1 || !esPrimo)
}