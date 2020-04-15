package ejercicio10

//null safety, para evitar el null pointer exception
fun main(args: Array<String>) {
    // kotlin es un lenguaje seguro por usar null safety (Seguridad ante nulos)
    //Java nos da un null pointer exception. es cuando accedemos a un valor null
    // kotlin para evitar esto hace que todas las clases sean NO NULL
    var name = "Jorge Luis"
    println(name::class.simpleName) // para obtener el tipo de dato
    //diferencia entre "String?" vs "String"
    /*
        La principal dif. esque la clase string no permite asignar un valor null sobre el objeto

    var variable = "Juan"
    variable= null  //  Da error (Error)
    ------
    var variable:String? = "Juan"
    variable= null // No da error, es decir permite asignar un null (Successfull)
    */
    val nombre= readLine() // retorna un String?
    if(nombre!=null){
        showName(nombre)
    }
// otra solucion podria ser darle un valor por defecto por si llega un null, parecido al operador ternario
    showName(nombre?: "El valor es null")
    // otra opc, es para ignorar los null
    showName(nombre!!)
}
fun showName(names:String){
    print("El resultado es: $names")
}