package com.example.koffingames.games

/*
 El programa solicitara al jugador que ingrese un numero a su eleccion
 1. Para piedra
 2. Para papel
 3. Para tijera

 El programa mostrara la eleccion de la computadora
 reglas
 Piedra vence a tijera
 papel vence a piedra
 tijera vence a papel

 se debe determinar el ganador del juego
 El programa debe manejar entradas invalidas o numros fuera del rango especificado
*/

fun main() {
    println("Por favor, ingresa un numero del 1 al 3 (1.Piedra, 2.Tijera, 3.Papel):")
    var choiceInput = readlnOrNull()?.toIntOrNull()
    var isValidInput = choiceInput != null && choiceInput in 1 .. 3

//    if(choiceInput != null && choiceInput in 1 .. 3) {
//        isValidInput = true
//    }

    while(!isValidInput) {
        println("Entrada no valida. Por favor, ingresa los numeros del 1 al 3")
        choiceInput = readlnOrNull()?.toIntOrNull()
        isValidInput = choiceInput != null && choiceInput in 1 .. 3
    }
    //println("Juego se ejecuto")
    val computerChoice = (1 .. 3).random()

    val computerChoiceString = when {
        computerChoice == 1 -> "Piedra"
        computerChoice == 2 -> "Tijera"
        computerChoice == 3 -> "Papel"
        else -> "Sin eleccion"
    }

    println("La computarora eligio: $computerChoiceString")

    val winner = when {
        choiceInput == computerChoice -> "Empate"
        choiceInput == 1 && computerChoice == 2 -> "El jugador, Ganaste brou"
        choiceInput == 2 && computerChoice == 3 -> "El jugador, Ganaste brou"
        choiceInput == 3 && computerChoice == 1 -> "El jugador, Ganaste brou"
        else -> "Perdiste brou"
    }
    println("El ganador es: $winner")
}