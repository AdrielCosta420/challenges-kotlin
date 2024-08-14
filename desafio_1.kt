package desafios_lp

fun main() {
    val a  = 10
    val b = 20
    val c = 11

    val soma = a + b

    println("A soma entre $a e $b é: $soma")


    if (c < soma) {
        println("$soma é menor que $c  ")
    } else if (c > soma){
        println("$soma é maior que $c")
    } else {
        println("O valor de $soma é igual a $c")
    }
}
