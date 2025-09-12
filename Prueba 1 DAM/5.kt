// Aquí deben dejar el código de la pregunta 5
// Clases y Herencia (20 puntos)
open class Persona(
    val nombre:String,
    val edad:Int,
    val rut:String
){
    open fun mostrarInfo(){
        println("nombre: $nombre, edad: $edad, rut: $rut")
    }
}
class Estudiante(nombre:String,edad:Int,rut:String,val matricula:Int,val carrera:String):Persona(nombre,edad,rut){
    fun estudiar(){
        println("Se pone a estudiar")
    }
    override fun mostrarInfo(){
        println("nombre: $nombre, edad: $edad, rut: $rut, matricula: $matricula, carrera: $carrera")
    }
}
class Profesor(nombre:String,edad:Int,rut:String,val especialidad:String):Persona(nombre,edad,rut){
    fun explicar(){
        println("Explica lo aprendido")
    }
    override fun mostrarInfo(){
        println("nombre: $nombre, edad: $edad, rut: $rut, especialidad: $especialidad")
    }
}
fun main(){
    val Alex=Estudiante("Alex",22,"23345466",9484933,"Informatica")
    Alex.mostrarInfo()
    Alex.estudiar()

    val Esteban=Profesor("Esteban",40,"17849349","Matematicas")
    Esteban.mostrarInfo()
    Esteban.explicar()
}