package ejercicio8

import java.util.*

//ifs
fun main(args: Array<String>) {
    val scanner= Scanner(System.`in`)
    print("Porfavor ingresa un valor entero: ")
    val n = scanner.nextInt()
    //if en forma de sentencias (stament)
    if (n > 0) {
        println("n es positivo")
    } else {
        println("n es negativo")
    }
    //if como expresion
    val message = if (n > 0) {
        "n es positivo"
    } else {
        "n es negativo"
    }
    println(" $message")
    println("El valor de n es ${if (n>0) "Positivo" else "es negativo"}")
}