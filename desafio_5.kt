package desafios_lp

import kotlin.math.roundToInt

fun main() {
    val salMin = 1.29320
    val salUser = 6.00000

    val divisao = salUser / salMin

    println("O salário do usuário equivale, aproximadamente, R$ ${divisao.roundToInt()} sálarios mínimos")
}