fun main() {
    val numeros = mutableListOf(30, 4, 11, 21, 7, 35)

    // 1. Lista con todos los elementos pares
    val pares = numeros.filter { it % 2 == 0 }
    println("Los elementos pares de la lista son: $pares")

    // 2. Primer elemento menor a 10
    val menorDiez = numeros.find { it < 10 }
    println("\nEl primer elemento menor a 10 es: $menorDiez")

    // 3. Multiplicar cada elemento por 2
    val multiplicados = numeros.map { it * 2 }
    println("\nTodos los elementos multiplicados por 2: $multiplicados")

    // 4. Sumar el primer y el último elemento
    val sumaExtremos = numeros.first() + numeros.last()
    println("\nLa suma del primer y último elemento es: $sumaExtremos")

    // 5. Agregar [4, 4, 4] a la lista
    numeros.addAll(listOf(4, 4, 4))
    println("\nAsi queda la lista después de agregar [4, 4, 4]: $numeros")

    // 6. Primer elemento divisible por 7
    val divisiblePorSiete = numeros.firstOrNull { it % 7 == 0 }
    println("\nEl primer elemento divisible por 7 es: $divisiblePorSiete")

    // 7. Sumar todos los elementos pares
    val sumaPares = numeros.filter { it % 2 == 0 }.sum()
    println("\nLa suma de todos los elementos pares es: $sumaPares")

    // 8. Primer elemento impar y mayor a 10
    val imparMayorDiez = numeros.firstOrNull { it % 2 != 0 && it > 10 }
    println("\nEl primer elemento impar y mayor a 10 es: $imparMayorDiez")
}
