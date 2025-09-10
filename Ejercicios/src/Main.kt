/*
val edad = 20
val promedio = 65
val peso = 56

fun main() {
    if (edad >= 18) {
        println("Es mayor de edad")
    } else {
        println("Es menor de edad")
    }
    if (promedio >= 40) {
        println("aprovó la asignatura")
    } else {
        println("reprovó la asignatura")
    }
    if (peso > 50) {
        println("pesa mas de 50kg")
    }
    if (edad > 15 && peso > 50) {
        println("pesa mas de 50 kg y tiene mas de 15 años")
    }
    if (promedio in 60..70) {
        println("Tiene promedio entre 6 y 7")
    }
    if (edad % 3 == 0) {
        println("su edad es divisible entre 3")
    } else {
        println("su edad NO es divisible entre 3")
    }
}*/
val a = 10
val b = 5
val c = 2

fun main(){
    if(a>b){ //ej 7.1
        println("A es mayor que B")
    }else{
        println("B es mayor que A")
    }//ej 7.2
    println("la multiplicacion de A y B es: "+ a*b)//($a se llama a la varible o sea sadria 10*5 en cambio asi si se multiplican los valores)
    //ej 7.3
    (if (a <= b) a..b else a downTo b ).forEach { print("$it ") }
    /*var i = a //otra manera sin downTo
    while (i >= b) {
        println("$i ")
        i--
    }*/
        //(down to es secuencia en orden descencente)
    // forEach para recorrer cada numero del rango y el it es cada numero de la secuencia
    //ej 7.4
    if (a%2==0){
        println("\nA no es impar")
    }else{
        println("A es impar")
    }//ej 7.5
    if(a>100) {
        println("A es mayor a 100")
    }else{
        println("A es menor a 100")
    }//ej 7.6
    println("La multiplicacion de A, B y C es: "+ a*b*c)
    if(a%2==0 && b%2==0 && c%2==0){
        println("Son todos pares")
    }else{
        println("No son todos pares")
    }
}