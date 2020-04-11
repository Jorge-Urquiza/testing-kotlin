package ejercicio6

class Car {
    var Color: String = "unknown"
        get() {
            counterColor += 1
            //return Color // igual
            println("Se ha leido el atributo color")
            return field // representa el campo sobre el cual defiinimos el getter
        }
    set(value){
        // si no se encuentra en ese array, es decir estos colores no son permitidos
        if(value !in arrayOf("Rojo", "Amarillo", "Verde"))
        field= value
        else
        field= "Color invalido"

    }
    var counterColor: Int = 0

}