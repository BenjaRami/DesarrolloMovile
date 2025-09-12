// Aquí deben dejar el código de la pregunta 3
// Funciones de orden superior (10 puntos)
fun operacion(x: Int,y: Int, f:(Int,Int)->Int):Int{
    return f(x,y)
}
fun suma(x: Int, y: Int): Int{
    return x+y
}
fun mult(x: Int,y: Int): Int{
    return x*y
}

val resSum=operacion(2,2,::suma)
val resMul=operacion(2,2,::mult)

fun main(){
    println("La suma es: "+resSum)
    println("La multiplicacion es: "+resMul)
}