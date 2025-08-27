/*
fun main(){
    //listOf es inmutable
    var lista= listOf(1,2,3,4,5)
    println("LISTA 1: ")
    println(lista)
    //mutableListOf para definir listas mutables

    var lista2= mutableListOf(1,2,3,4,5)
    lista2.add(6) //se puede añadir , en cambio a la 1ra no
    println("LISTA 2: ")
    println(lista2)

    //setOf inmutable
    var lista3 = setOf(1,2,3,4,5)
    println("LISTA 3: ")
    println(lista3)

    //mutableSetOf mutable
    var lista4= mutableSetOf(1,2,3,4,5)
    lista4.add(5)
    println("LISTA 4: ")
    println(lista4)

    //mapOf inmutable
    var lista5= mapOf("key1" to 1, "key2" to 30)
    println("LISTA 5: ")
    println(lista5)
}*/
/*
fun main(){
    var lista= mutableListOf(1,2,3,4,5)
    //val filtro=lista.filter { it %2 ==0 } //filter muestra todos los elementos que cumplan la condición
    println(lista.sum())
    val doble =lista.map { it * 2 }
    val triple=lista.map { it * 3 }

    println(doble.sum())
    println(triple.sum())

}*/

fun main(){
    var lista = mutableListOf(3,6,2,9,45)
    println(lista.find { it % 2 !=0 }) //find muestra el 1er elemento que cumpla la condición
    println(lista.find { it % 2 ==0 })
    println(lista.first())//1er elemento
    println(lista.last())//ultimo elemento
}

