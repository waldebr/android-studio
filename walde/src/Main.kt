fun main() {

    val num1 = 10
    val num2 = 20
    if (num1 > num2) {
        println("O número 1 é maior que o número 2")
    } else {
        println("O número 2 é maior ou igual ao número 1")
    }

    // Caso 2: WHEN
    val dia = 3
    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Dia inválido")
    }


    println("mostra os números de 1 a 5 com FOR:")
    for (i in 1..5) {
        println(i)
    }


    val numeros = arrayOf(1, 2, 3, 4, 5, 6)
    println("Exibindo todos os itens da array:")
    for (num in numeros) {
        println(num)
    }


    println("mostra o 6º elemento da array:")
    println(numeros[5])


    println("usa o While para imprimir de 1 a 5:")
    var i = 1
    while (i <= 5) {
        println(i)
        i++
    }

    val soma = Soma()
    println("Resultado da soma: ${soma.calcular(10, 5)}")

    // Caso 8: Função de subtração
    val subtracao = Subtracao()
    println("Resultado da subtração: ${subtracao.calcular(10, 5)}")


    val multiplicacao = Multiplicacao()
    println("Resultado da multiplicação: ${multiplicacao.calcular(10, 5)}")


    val divisao = Divisao()
    println("Resultado da divisão: ${divisao.calcular(10, 5)}")
}


class Soma {
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }
}

class Subtracao {
    fun calcular(a: Int, b: Int): Int {
        return a - b
    }
}

class Multiplicacao {
    fun calcular(a: Int, b: Int): Int {
        return a * b
    }
}

class Divisao {
    fun calcular(a: Int, b: Int): Double {
        return if (b != 0) a.toDouble() / b else 0.0
    }
}
