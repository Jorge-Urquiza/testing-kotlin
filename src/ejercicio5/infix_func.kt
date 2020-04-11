package ejercicio5

//infix function
import ejercicio2.PersonKotlin

fun PersonKotlin.say(message: String){
    println("$nombre dice: $message")
}
fun main(args: Array<String>) {
    val p1= PersonKotlin("Juan ", 24)
    p1.say("Hello World")
    p1 sayMessage("Hello world from infix function")
}
// convertir a infix function, solo debe de tener un parametro
infix fun PersonKotlin.sayMessage(message: String){
    println("$nombre dice: $message")
}
