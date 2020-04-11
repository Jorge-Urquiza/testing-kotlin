package ejercicio4
// EXTENSION PROPERTIES - EXTENSION FUNCTION
fun main(args: Array<String>) {
    // obtener el nombre de la persona
    val fullname= "Juan Ramos"
    val index= fullname.indexOf(" ")
    // subtring
    val name= fullname.substring(0,4)
    println("full name: ${fullname}")
    println("name: ${name}")
    println(getFirstWord("Mario Perez"))
    // llamando a extend function
    println("Extend Function:${fullname.getFirstName()}")
    // llamando al extend properties
    println("Extend propierties: ${fullname.firstNameOnFullName}")
}
val String.firstNameOnFullName:String get(){
    return this.substring(0,indexOf(" "))
}
fun getFirstWord(word: String):String{
    var index=word.indexOf(" ")
    return word.substring(0,index)
}
// convertir esta funcion en extension function
fun String.getFirstName() = substring(0,this.indexOf(" "))