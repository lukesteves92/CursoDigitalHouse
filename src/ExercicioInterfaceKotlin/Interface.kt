package ExercicioInterfaceKotlin

interface Imprimivel{
    fun imprimir(){
        println("Documento disponível para impressão: ")
    }
}
class Foto(): Imprimivel{
    override fun imprimir() {
        super.imprimir()
        println(" Eu sou uma selfie")
    }
}
class Documento(): Imprimivel{
    override fun imprimir() {
        super.imprimir()
        println(" Eu sou um documento word")
    }
}
class Contrato(): Imprimivel{
    override fun imprimir() {
        super.imprimir()
        println("Sou um contrato muito legal")
    }
}
class Impressora(){
    var listaimprimivel = mutableListOf<Imprimivel>()
    fun adicionar(documento: Imprimivel){
        listaimprimivel?.add(documento)
    }
    fun imprimir(){
        println(listaimprimivel)
        listaimprimivel?.forEach{
            it.imprimir()
        }
    }
}
fun main(){
    var documento = Documento()
    var foto = Foto()
    var contrato = Contrato()
    var impressora = Impressora()
    impressora.adicionar(documento)
    impressora.adicionar(foto)
    impressora.adicionar(contrato)
    impressora.imprimir()
}