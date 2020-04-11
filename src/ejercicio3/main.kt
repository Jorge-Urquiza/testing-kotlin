package ejercicio3

import ejercicio2.PersonKotlin

// OPERATORS
fun main(args: Array<String>) {
    val a = 20
    val b = 30;
    println("El resultado es ${a + b}")
    println("El resultado es ${a - b}")
    println("El resultado es ${a * b}")
    println("El resultado es ${a / b}")
    var person1 = PersonKotlin("Juan", 21)
    var person2 = person1.copy(age = 31) // similar to clone using name parameters
    println(person1) // imprime todos los field del objeto porque la Clas PersonKotlin es un data class.
    println(person2)

    // compare with age
   // println("p1 es mayor que p2: ${person1.age > person2.age}") sin operator overloading
    // using compare object (field age)
    println("p1 es mayor que p2: ${person1 > person2}")
    println("p1 es mayor igual que p2: ${person1 >= person2}")
    println("p1 es menor que p2: ${person1 < person2}")
    println ("p1 es menor igual que p2: ${person1 <= person2}")
    println("p1 es == que p2: ${person1 == person2}")
    println("p1 es distinto que p2: ${person1 != person2}")

    person1++
    println(person1)
}

// https://kotlinlang.org/docs/reference/operator-overloading.html
// OPERATOR OVERLOADING
operator fun PersonKotlin.compareTo(person: PersonKotlin): Int {
    return this.age.compareTo(person.age)
}

operator fun PersonKotlin.inc() = PersonKotlin(nombre,age+1)
operator fun PersonKotlin.dec(): PersonKotlin {
    return PersonKotlin(nombre,age-1)
}
