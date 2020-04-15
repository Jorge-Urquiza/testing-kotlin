package ejercicio9

// how to use WHEN
fun main(args: Array<String>) {
    // el when es equivalente a usar switch
    print("Ingresa un OPERADOR: ")
    val op = readLine() // String?
    //String? vs String =>Null safety

    // when en formato de statament
    when (op) {
        "+" -> println("Suma")
        "-" -> println("Resta")
        "*" -> println("Multiplicacion")
        "/" -> println("Division")
        else -> print("Operador no encontrador")
    }

    // en formato de expresion
    val x = 20
    val y = 5
    val op2 = op
    val resultado = when (op2) {
        "+" -> {
            println("Suma")
            x + y
        }
        "-" -> {
            println("Resta")
            x - y
        }
        "*" -> {
            println("Multiplicacion")
            x * y
        }
        "/" -> {
            println("Division")
            x / y
        }
        else -> {
            print("Operador no encontrador")
            0
        }
    }
    println("El resultado es: ${resultado}")

    // usando Funciones
 println("Resultado desde la funcion: ${evaluarOperador(x,y,op)}" )
}

// otra forma de realizarlo
fun evaluarOperador(n1: Int, n2: Int, op2: String?): Int {
    return when (op2) {
        "+" -> {
            println("Suma")
            n1 + n2
        }
        "-" -> {
            println("Resta")
            n1 - n2
        }
        "*" -> {
            println("Multiplicacion")
            n1 * n2
        }
        "/" -> {
            println("Division")
            n1 / n2
        }
        else -> {
            print("Operador no encontrador")
            0
        }
    }
}