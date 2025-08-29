/*
fun main(){
    val lista= listOf(7,3,15)
    println("lista $lista")

    for (i in lista){
        println("valor i: $i")
    }
}*/
/*
fun main(){
    val lista= mapOf("nombre" to "Juan", "edad" to 45, "direccion" to "calle 6th")
    println("lista: $lista")

    lista.forEach{
        (llave, valor)-> println("la llave es $llave su value es $valor")
    }
}*/
fun main(){
    val Charmander= pokemon("charmander", 150, 5, 60,40)
    Charmander.informacion()

    val Starmie=pokemon("starmie",230,20,40,80)
    Starmie.informacion()

    Charmander.preparar()
    Starmie.recibirDano(Charmander.atk)

    Starmie.preparar()
    Charmander.recibirDano(Starmie.atk)

    Charmander.preparar()
    Starmie.recibirDano(Charmander.atk)

    Starmie.preparar()
    Charmander.recibirDano(Starmie.atk)
}
class pokemon(
    val nombre: String,
    var hp: Int,
    val nivel: Int,
    val id: Int,
    var atk: Int
){
    fun saltar(){
        println("el pokemon $nombre está saltando")
    }
    fun volar(){
        println("el pokemon $nombre comenzó a volar")
    }
    fun informacion(){
        println("${nombre}:HP:$hp, Nivel :$nivel, ATQ:$atk, Id:$id"  )
    }
    fun recibirDano(dano:Int) {
        println("$nombre ha recibido daño")
        hp = hp - dano
        println("HP restante : $hp")
        if (hp <= 0) {
            println("$nombre SE HA DEBILITADO!! :( ")
        }
    }
    fun preparar(){
        println("$nombre se prepara para atacar")
    }
}