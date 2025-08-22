fun main(){
    for (i in 1..20) if (i!=5 &&(i<11||i>19)){
    // i!=5 i debe ser distinto de 5
    // && es para unir las condiciones
    // (i<11||i>19) verifica que el número i esté fuera del rango 11 al 19.
        println(i)
    }
}