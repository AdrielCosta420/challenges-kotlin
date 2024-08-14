package desafios_lp

fun main() {
    val isOpen = readln().toBoolean();
    val isClosed = readln().toBoolean();

    if (isOpen == true && isClosed == true) {
       println("Ambos valores sao verdadeiros")
    } else {
        println("Um dos valores são falsos")
    }
}