package desafios_lp

fun main() {
    val v1 = readln().toInt()
    val v2 = readln().toInt()
    val v3 = readln().toInt()

    val values = listOf(v1, v2, v3)

    val listOrdener = values.sortedDescending()
    println("Ordem descrente: $listOrdener")


    /// OU

    var maiorQue = 0
    var segundoMaiorQue = 0
    var terceiroMaiorQue = 0


    if (v1 > v2 && v1 > v3) {
        maiorQue = v1
        if (v2 > v3) {
            segundoMaiorQue = v2
            terceiroMaiorQue = v3
        } else {
            segundoMaiorQue = v3
            terceiroMaiorQue = v2
        }
    }

    if (v2 > v1 && v2 > v3){
        maiorQue = v2
        if (v1 > v3) {
            segundoMaiorQue = v1
            terceiroMaiorQue =  v3
        } else {
            segundoMaiorQue = v3
            terceiroMaiorQue =  v1
        }
    }

    if (v3 > v2 && v3 > v1) {
        maiorQue = v3
        if (v2 > v1) {
            segundoMaiorQue = v2
            terceiroMaiorQue =  v1
        } else {
            segundoMaiorQue = v1
            terceiroMaiorQue =  v2
        }
    }


        println("Ordem descrente: $maiorQue , $segundoMaiorQue , $terceiroMaiorQue ,     ")
    }


