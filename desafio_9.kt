package desafios_lp

import kotlin.math.pow

fun main() {
    val peso = readln().toDouble()
    println("Informe seu peso: $peso KG")

    val altura = readln().toDouble()
    println("Informe sua altura: $altura cm")

    val imc = peso / (altura).pow(2)

   if (imc == 18.5) {
       println("$imc: Abaixo do peso")
   } else if (imc >= 18.5 && (imc <= 24.9)) {
       println("$imc: Peso ideal (parabéns)")
   } else if (imc >= 25.0 && imc <= 29.9) {
       println("$imc: Levemente acima do peso")
    } else if(imc >= 30.0 && imc < 34.9) {
       println("$imc: Obesidade grau I")
   } else if(imc >= 35.0 && imc < 39.9) {
       println("$imc: Obesidade grau II(severa)")
   } else if(imc >= 40) {
       println("$imc: Obesidade grau III(mórbida)")
   }
}