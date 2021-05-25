
fun main(){

    nomeEIdadeDefault()

    testeLambda {
        return@testeLambda "Teste"

    }

    val animais = listOf("Peixe", "Cachorro")

    animais.forEach{
        println(it)
    }

    val b: String? = null
    println(b?.length ?: 0) // Elvis operator

    b?.length ?: run{
        val soma = 2 + 2
        println(soma)
    }

}


fun nomeEIdade(nome: String, Idade: String){


}

fun nomeEIdadeComRetorno(nome: String, idade: String): String{

return  "O nome é $nome e a idade é $idade"


}

fun nomeEIdadeDefault(nome: String = "Fulano", sobrenome: String = "De Tal"){ //Default Arguments



}

// Função Lambdas -> Função Anonima

fun testeLambda(xpto: () -> String){ // Passando função como parametro
    println("A String da minha função anonima é : ${xpto()}")

}

class NullSafety(val nome: String? = "Cesar", val sobrenome: String){


}