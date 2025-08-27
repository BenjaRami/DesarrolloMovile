//codigo funcion "ditto"
fun ditto(el1: Int, el2:Int,comportateAsí:(Int,Int) ->Int) :Int
{   print("Hola soy un ditto: ")
    if (el2!=0) {
        return comportateAsí(el1, el2)
    }
    else{
        print("A ditto no le gustan los elementos2 que sean 0")
        return 0
    }
}
//tipo 1: suma
//tipo 2: resta
//tipo 3: multiplicación
//tipo 4: división
fun main(){

    println( ditto(10,20){ x,y -> x+y })
    println( ditto(10,20){ x,y -> x+y })
    println( ditto(10,20){ x,y -> x*y+1000 })
    println(ditto(10,10){ x,y -> x/y })
}