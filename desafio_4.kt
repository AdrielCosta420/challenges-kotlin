package desafios_lp

fun main() {
    val inputNumber = readln()

    if (inputNumber.isNotEmpty()) {

        val antecessor = inputNumber.toInt() - 1
        val sucessor = inputNumber.toInt() + 1

        if (antecessor < inputNumber.toInt()) {
            println("O antecessor é: $antecessor")
        }
        println("O valor atual é: ${inputNumber.toInt()}")
        if(sucessor > inputNumber.toInt()) {
            println("O sucessor é: $sucessor")
        }
    }

    //    for (i in inputNumber.toInt() downTo 1) {
//
//        print("O antecessor do valor $inputNumber é igual: ${inputNumber.toInt() - 1}")
//    }
}