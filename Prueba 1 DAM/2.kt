// Aquí deben dejar el código de la pregunta 2
// Ciclos  (10 puntos)
data class Alumno( val nombre: String, val nota1: Int, val nota2: Int, val nota3: Int )
val listaAlumnos = listOf( Alumno("Alex", 55, 60, 40), Alumno("Iris", 30, 45, 62), Alumno("Juan", 50, 57, 63), Alumno("Nina", 68, 65, 60) )

fun main(){
    for (Alumno in listaAlumnos){
        val prom=(Alumno.nota1+Alumno.nota2+Alumno.nota3)/3
        val nombre=(Alumno.nombre)
        println("Nombre: $nombre  promedio: $prom")
    }
}