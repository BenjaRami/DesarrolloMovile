// Aquí deben dejar el código de la pregunta 1
// Colecciones (10 puntos)
val numeros = listOf(1, 4, 12, 4, 5, 45, 8, 10)
//1
val impar= numeros.filter{it%2 !=0}
fun main(){
    println("Los impares de la lista son: $impar")
}
//2
val mayor11= numeros.find{it >11}

fun main(){
    println("El primer numero mayor que 11 es: $mayor11")
}
//3
val primer=numeros.first()
val ultimo=numeros.last()
val suma= primer+ultimo
fun main(){
    println("La suma del 1er y ultimo elemento es: "+suma)
}