fun main()
{
    println("Hola Mundo")
    val a: Int = 65 //inmutable
    var b: Int = 43 //mutable
    var año: String= "años"

    var nombre: String="Juan"
    var apellido: String="Rodriguez"
    b=34//al ser mutable puedo cambiarlo en cambio val no se puede (arroja error)
    println("tu edad es: "+a+ año+ nombre+ apellido )
    println(b)
}

