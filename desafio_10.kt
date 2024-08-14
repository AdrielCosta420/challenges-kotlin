package desafios_lp

import kotlin.math.roundToLong

fun main() {
    print("Nota 1: ")
    val nota1 = readln().toDouble()
    print("Nota 2: ")

    val nota2 = readln().toDouble()
    print("Nota 3: ")

    val nota3 = readln().toDouble()

    val media = ((nota1+nota2+nota3) / 3)

    println("A média do aluno é igual: $media")


}