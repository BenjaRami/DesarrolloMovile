open class pokemon(
    val nombre: String,
    var hp: Int,
    var atk: Int,
    var estado: String="normal"
){
    fun info(){
        println("$nombre:HP:$hp, ATQ:$atk, Estado: $estado ")
    }
    fun recibirDano(dano:Int) {
        println("$nombre ha recibido daño")
        hp -= dano
        println("HP restante : $hp")
        if (hp < 0) {
            hp=0
            println("$nombre SE HA DEBILITADO!! :( ")
        }
    }
    fun cambiarEstado(nuevoEstado: String){
        estado=nuevoEstado
        println("$nombre ahora está $estado")
    }
    fun estaVivo(): Boolean {
        return hp > 0
    }

}
class TipoFuego(nombre: String, hp: Int, atk: Int): pokemon(nombre, hp, atk){
    fun aumentarAtaque(){
        atk += 20
        println("⚔️ $nombre aumenta su ataque en 20! Ataque actual: $atk")
    }
    
    fun lanzallamas(pokemonAlQueAtaca: pokemon){
        println("🔥 $nombre usa Lanzallamas contra ${pokemonAlQueAtaca.nombre}!")
        pokemonAlQueAtaca.recibirDano(atk)
    }
    
    fun quemar(pokemonAlQueAtaca: pokemon){
        println("🔥 $nombre intenta quemar a ${pokemonAlQueAtaca.nombre}")
        pokemonAlQueAtaca.cambiarEstado("quemado")
    }
}
class TipoAgua(nombre: String, hp: Int, atk: Int): pokemon(nombre, hp, atk){
    fun lanzaAgua(pokemonAlQueAtaca: pokemon){
        println("💧 $nombre usa Lanza Agua contra ${pokemonAlQueAtaca.nombre}!")
        pokemonAlQueAtaca.recibirDano(atk)
    }
    
    fun curar(){
        val curacion = 50
        hp += curacion
        println("❤️ $nombre se cura y recupera $curacion HP! HP actual: $hp")
    }
}
fun main() {
    println("**************************")
    println("****** POKEMON GAME ******")
    println("**************************")
    
    val charmander= TipoFuego("Charmander",100,40)
    val Starmie= TipoAgua("Starmie",180,50)
    
    println("\n--- ESTADO INICIAL ---")
    charmander.info()
    Starmie.info()
    
    println("\n--- COMIENZA LA BATALLA ---")

    // Turno 1: Charmander ataca con lanzallamas a Lapras
    println("\nTurno 1:")
    charmander.lanzallamas(Starmie)
    
    // Turno 2: Lapras se cura
    println("\nTurno 2:")
    Starmie.curar()

    // Turno 3: Charmander aumenta su ataque y luego quema a Lapras
    println("\nTurno 3:")
    charmander.aumentarAtaque()
    charmander.quemar(Starmie)

    // Turno 4: Lapras ataca con agua a Charmander
    println("\nTurno 4:")
    Starmie.lanzaAgua(charmander)

    println("\n--- ESTADO FINAL ---")
    charmander.info()
    Starmie.info()

    // Verificamos quién ganó, esto finalmente depende de los atk y hp instanciados
    println("\n--- RESULTADO ---")
    if (charmander.estaVivo() && Starmie.estaVivo()) {
        println("¡Ambos pokemones siguen en pie!")
    } else if (charmander.estaVivo()) {
        println("¡${charmander.nombre} es el ganador!")
    } else if (Starmie.estaVivo()) {
        println("¡${Starmie.nombre} es el ganador!")
    } else {
        println("¡Es un empate! Ambos pokemones están derrotados.")
    }
}
