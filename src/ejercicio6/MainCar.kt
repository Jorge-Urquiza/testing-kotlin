package ejercicio6

//Getters and setters
fun main(args: Array<String>) {
    val car = Car()
    car.Color = "Negro" //eso no es un asignacion comun y corriente, esto esta llamando a un setter
    println("El color del auto es: ${car.Color}")
    println("El color del auto es: ${car.Color}")
    println ("El color del auto es: ${car.Color}")
    println("El color del auto es: ${car.Color}")
    println("El color se ha leido : ${car.counterColor} veces")
}