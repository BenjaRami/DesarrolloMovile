open class Mascota(
	val nombre:String,
    val edad: Int
){
    fun mostrarInfo(){
        println("La mascota se llama $nombre y tiene $edad años")
    }
}
class Gato(nombre:String,edad:Int, val colorPelaje: String): Mascota(nombre,edad){
    fun correr(){
        println("$nombre se puso a correr")
    }
    fun maullar(){
        println("$nombre se puso a maullar Miau :)")
    }
}
class Pez(nombre:String,edad:Int,val sangrefria: Boolean):Mascota(nombre,edad){
    fun nadar(){
        println("$nombre se puso a nadar")
    }
    fun salpicar(){
        println("$nombre se puso a salpicar aguita Glu Glu Glu")
    }
}
fun main(){
    //instancias a la mascota
    val miGato = Gato("Moka",1, "gris")
    miGato.mostrarInfo()
    miGato.correr()
    miGato.maullar()
    
    val miPez= Pez("Pepito",3,true)
    miPez.mostrarInfo()
    miPez.nadar()
    miPez.salpicar()
}
