package ejercicio9
// otr aforma de usar WHEN
fun main(arg:Array<String>){
    val op = readLine() // String?
    val x = 20
    val y = 5
    // usando Funciones
    if(op!=null){
        println("Resultado desde la funcion: ${evaluarOperador(x,y,op)}" )
    }

}
fun evaluarOperador(n1: Int, n2: Int, op2: String): Int {
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
        "%", "mod"->{
            print("Mod")
            n1%n2
        }
        in "A" .. "Z" ->{
            print("ESTO ES UNA LETRA MAYUSCULA")
            1
        }
        17.toString()->{
            print("Es una constante N#17")
            17
        }
        else -> {
            print("Operador no encontrador")
            0
        }
    }
}