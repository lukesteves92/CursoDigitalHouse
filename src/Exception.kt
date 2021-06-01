import kotlin.jvm.Throws

fun main() {


    var calculoMatematico = CalculoMatematico()

    println(calculoMatematico.divisao(4, 1))

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

    fun divisao(numero1: Int, numero2: Int){

        var resultado: Int = 0

        try {
            resultado = numero1 / numero2
            println(resultado)

        } catch (xpto1: ArithmeticException) {
            println("Divisão por zero não é permitida")


        }


    }
}

