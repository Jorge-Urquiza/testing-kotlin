package ejercicio2

fun main(args: Array<String>){


    //print("HOLA DESDE LA CLASE DE KOTLIN")
    val person1= PersonJava("Juan", 21)
    // val vs var , val es equivalente al final (solo recibe una asignacion)
    println(person1.name)
    val person2 = PersonKotlin("Juan",20);
     print("La edad de ${person2.nombre} es ${person2.age}")
}