/* //codigo para in ciclo de numeros aleatorios
fun main (){
    var i=1
    var ciclo =1
    while (i<=100){
        val numRandom=(0..10).random()
        i=i+numRandom
        println("ciclo $ciclo = $i")
        ciclo++
    }
}*/ //codigo para numeros pares e impares
fun main() {
    var i = 1
    while (i<=100){
        if (i%2 !=0){ //esto para los impares, para los pares sería (i%2==0)
            println("i: $i")
        }
        i++
    }
}
