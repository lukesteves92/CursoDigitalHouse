import java.lang.StringBuilder

fun main(){

    val Loteria = mutableMapOf(
        0 to "Ovos",
        1 to "Água",
        2 to "Escopeta",
        3 to "Cavalo",
        4 to "Dentista",
        5 to "Fogo",

    )

    val ListaA = mutableListOf("Lucas", "Felipe")
    val ListaB = mutableListOf("João", "César")

    val Apelidos = mutableMapOf(
        "GrupoA" to ListaA,
        "GrupoB" to ListaB

    )

    var nomeApelidos = StringBuilder()
    Apelidos.forEach{ entry ->
        nomeApelidos.append("${entry.key} - ")
        entry.value.forEach{ apelido ->
            nomeApelidos.append("${apelido},  ")
        }
git 


    }
    println(nomeApelidos.toString())









}