package desafios_lp

fun main() {

    val inputNumber = readln()
    println("Digite um número: $inputNumber")

    if(inputNumber != null) {
        if(inputNumber.toInt() %2 == 0) {
            println("O valor $inputNumber é par!")
        }
        else if (inputNumber.toInt() % 2 == 1) {
            println("O valor $inputNumber é ímpar!")
        }
        if (inputNumber.toInt() >= 0) {
            println("O valor $inputNumber é positivo!")
        } else if (inputNumber.toInt() < 0) {
            println("O valor $inputNumber é negativo!")
        }

    }

}