package ejercicio2

data class PersonKotlin(var nombre: String, var age: Int)
// con esto tenemos la posibilidad de comparar objetos pero no la referencia
// si no que los valores de los atributos de esos objetos persona1.equals(persona2)