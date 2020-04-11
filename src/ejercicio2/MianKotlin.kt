package ejercicio2

fun main(args: Array<String>){
    // extrapolar java en kotiin, se puede n usar instancair objetos java en kotlin
    val person3 = PersonJava("Pepe",20);
    println(person3.name)
    //print("HOLA DESDE LA CLASE DE KOTLIN")
    val person1= PersonKotlin("Juan", 21)
    // val vs var , val es equivalente al final (solo recibe una asignacion)
    println(person1.nombre)
    val person2 = PersonKotlin("Juan",21);
     println("La edad de ${person2.nombre} es ${person2.age}")


    if(person1.equals(person2)){
        println("Personas iguales")
    }else{
        println("Personas no iguales")
    }
}