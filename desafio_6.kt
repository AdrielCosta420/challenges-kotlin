package desafios_lp

import kotlin.random.Random

fun main() {
    val inputNumber = readln()

    println("Insira um valor: $inputNumber")

    val percentInputNumber = (( inputNumber.toInt() * 5) / 100 )
    println("O valor $inputNumber sofreu um reajuste de 5% . Seu novo valor é: $percentInputNumber")
}