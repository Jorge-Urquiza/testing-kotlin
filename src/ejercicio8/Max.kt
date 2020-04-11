package ejercicio8

import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    print("Porfavor ingresa un valor entero X: ")
    val x = scanner.nextInt()

    print("Porfavor ingresa un valor entero Y: ")
    val y = scanner.nextInt()

    val max = if (x > y) {
        println("X es mayor que Y")
        x
        // la ultima linea del bloque es el resultado de la expresion
    } else {
        println("Y es mayor que X")
        y
    }
    println("El valor de max es: $max")
}
