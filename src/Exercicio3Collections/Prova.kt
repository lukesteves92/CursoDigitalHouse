package Exercicio3Collections

class Prova {

    fun somaTotal(ConjuntoInteiro: Set<Int>){

        var somatotal = 0

        for(i in ConjuntoInteiro){
            somatotal += i
        }
        println("O valor da soma total dos inteiros é $somatotal")

    }
}

class Exercicio3{

    fun mostrarItens(ConjuntoInteiro: Set<Int>){

        ConjuntoInteiro.forEach{ entrada ->
            println("Os números são: $entrada")

        }

    }
}

fun main(){

    val listaInteiros = setOf(1, 2, 3, 50, 60)


    val prova = Prova()
    val exercicio3 = Exercicio3()

    prova.somaTotal(listaInteiros)
    exercicio3.mostrarItens(listaInteiros)

}

