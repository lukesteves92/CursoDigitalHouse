class GuardaVolumes(val dicionario: MutableMap<Int, MutableList<Peca>>) {

    var i: Int = 0

    fun guardaPecas(listaPecas: MutableList<Peca>): Int {

        dicionario.put(i, listaPecas)
        return i
    }

    fun mostrapecas() {

        var mostrarPecas = StringBuilder()
        dicionario.forEach { entry ->
            mostrarPecas.append("${entry.key} - ")
            entry.value.forEach{
                mostrarPecas.append("${it}, ")
            }

            mostrarPecas.appendLine()
        }

        println(mostrarPecas.toString())
    }

    fun mostrapecas(chave: Int) = println(dicionario[chave])

    fun devolverPeca(chave: Int) {
        dicionario.remove(chave)
        println("Peça devolvida com sucesso!")
    }
}

class Peca(var marca: String, var modelo: String) {

    override fun toString(): String {
        return "Pecas(marca='$marca', modelo='$modelo')"
    }

    open fun retirada (){

    }



}

fun main () {
    val peca1 = Peca("Adidas","Camiseta")
    val peca2 = Peca("Nike","Blusa")
    val peca3 = Peca("Balenciaga","Calça")

    peca1.toString()

    val guarda = GuardaVolumes(mutableMapOf())

    guarda.guardaPecas(mutableListOf(peca1,peca2,peca3))

    guarda.mostrapecas()






}