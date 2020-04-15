package ejercicio11
//For range y foreach
fun main(args: Array<String>){
    for (i in 1..5)
        print(i)
    println()
    //step es una infix function
    //ASC
    for (i in 2..10 step 2)
        print(i)
    println()
    // desde 5 a 1 ,DESC
    for (i in 5 downTo 1)
        print(i)
    println()

    for (i in 10 downTo 1 step 2)
        print(i)
    println()

    // iterar sobre un array
    val lenguages= arrayOf("PHP", "JAVA", "PERL", "JS", "KOTLIN")
    for (lenguage in lenguages)
        print("$lenguage ")
    println()
    // para ver los indices del array
    for (i in lenguages.indices)
        print("$i ")
    println()

    for (i in lenguages.indices)
        print("$i => ${lenguages[i]} ; ")
    println()

    for ((index, element) in lenguages.withIndex())
        println("El elemento que esta en el indice es: $index => ${element} ; ")
    println()

    for (c in lenguages.last()){
       print("$c ")
    }
    println()
    // foreach, programacion funcional
    lenguages.forEach {
        print("$it ")
    }
}