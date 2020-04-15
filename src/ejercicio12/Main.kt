package ejercicio12

//FUNCTIONAL PROGRAMMING
fun main(args: Array<String>) {
    // la programacion funcional es un paradigma, se reemplaza secuencias
    // por llamadas a funciones

    // HIGHER ORDER FUNCTION
    //una funcion recibe como argumento otra funcion y puede tambien dar como resultado otra funcion

    val lenguages = arrayOf("PHP", "C#", "C++", "KOTLIN", "JAVA", "JAVASCRIPT")
    // vamos a excluir los que tengan longitud <=3 y mostrar la longitud
    // NORMALMENTE LO HARIAMOS ASI (PARADIGMA IMPERACTIVA)
    var filter = mutableListOf<String>()
    for (lang in lenguages) {
        if (lang.length > 3) {
            filter.add(lang)
        }

    }
    // ahora mostramos la longitud de los filtrados
    filter.forEach {
        println("$it => ${it.length} ")
    }
    // PARADIGMA DE PROGRAMACION semi-FUNCIONAL.
    var filtrado = filtersLangueages(lenguages)
    printLeng(filtrado)
    // USANDO PROGRAMACION FUNCIONAL CON EXPLICIT PARAMETER NAME
    lenguages.filter { lang -> lang.length > 3}
        .map {
                lang-> "$lang (${lang.length}) "
        }
        .forEach{
            lenguage-> println(lenguage)
        }
    // USANDO PROGRAMACION FUNCIONAL CON IMPLICIT PARAMETER NAME
    lenguages.filter { it.length > 3}
        .map { "$it (${it.length}) " }
        .forEach{println(it) }

}

fun printLeng(filtrado: MutableList<String>) {
    for (lang in filtrado)
        println("$lang => ${lang.length} ")
}

//pure function
fun filtersLangueages(lenguages: Array<String>): MutableList<String> {
    val listFilter = mutableListOf<String>()
    for (lang in lenguages) {
        if (lang.length > 3) {
            listFilter.add(lang)
        }
    }
    return listFilter
}
