package desafios_lp

fun main() {
    val valueA = readln()
    val valueB = readln()
    var c = 0;
    if (valueA != null && valueB != null) {
        if (valueA.toInt() == valueB.toInt()) {
            c = valueA.toInt() + valueB.toInt()
            print("A soma dos valores é igual a $c")
        } else {
            c = valueA.toInt() * valueB.toInt()
            print("O produto dos valores é igual a $c")
        }
    } else {
        println("Não foi possível identificar o valor digitado")
    }
}