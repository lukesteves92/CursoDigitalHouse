import java.lang.IndexOutOfBoundsException

import kotlin.jvm.Throws

fun main() {

    var listaString: MutableList<String>? = mutableListOf()

    listaString?.add("Cachorro")
    listaString?.add("Pato")
    listaString?.add("Gato")

    try {
        println(listaString?.get(5))
    } catch (index: IndexOutOfBoundsException){
        println(index.localizedMessage)
    }

    val calculoMatematico = CalculoMatematico()
    try {
        calculoMatematico.divisao(4, 0)
    } catch (ex: ArithmeticException) {
        println(ex.message)
    }





    try {
        testeThrown()
    } catch (ex: java.lang.ArithmeticException) {

    }
    try {

        val teste = 2 / 1

        val teste1: String? = null
        teste1?.length ?: run {

        }

        val teste2 = listOf<Int>()
        val item3 = teste2.getOrNull(3)
        println(item3)
    } catch (xpto1: ArithmeticException) {
        println("Not a number")
    } catch (exception: Exception) {
        println(exception.localizedMessage)
    }
}

@Throws(java.lang.ArithmeticException::class)
fun testeThrown() {
    2/0
}


class CalculoMatematico {

    @Throws(java.lang.ArithmeticException::class)
    fun divisao(numero1: Int, numero2: Int): Int{

      return if (numero2 == 0){
          throw ArithmeticException("Divisão por zero")

      } else{
          numero1 / numero2
      }


    }
}

