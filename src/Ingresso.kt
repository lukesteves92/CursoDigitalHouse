import java.util.*

abstract class Ingresso {

    abstract val valor: Double

    abstract fun imprimeValor(): Double

}

open class vip : Ingresso() {

    override var valor: Double = 20.00


    override fun imprimeValor(): Double {
        return valor
    }
}

class normal: Ingresso(){

    override var valor: Double = 10.00


    override fun imprimeValor(): Double {
        return valor
    }

    fun imprimeTipoNormal(){
        println("Ingresso Normal")

    }
}


class CamaroteInferior: vip(){

    val location: String = "Inferior"

    fun imprimeLocation(): String{

        return location
    }

}

class CamaroteSuperior: vip(){

    val location: String = "Superior"

    fun imprimeLocation(): String{

        return location
    }

    fun imprimeValorSuperior(): Double{

        return valor + 10
    }

}

fun main(){
    var ingressoVip = vip()
    var ingressoNormal = normal()
    var camaroteSuperior = CamaroteSuperior()
    var camaroteInferior = CamaroteInferior()
    val reader = Scanner(System.`in`)
    println("Digite 1 para selecionar o ingresso NORMAL ou 2 para o ingresso VIP:")
    var r1: Int = reader.nextInt()
    if( r1 == 1){
        println(ingressoVip.imprimeValor())
        println("--------------------------------------------------------------------")
        println("Digite 1 para acessar o Camatore Superior ou digite 2 para acessar o Camarote Inferior: ")
        var r2: Int = reader.nextInt()
        if (r2 == 1){
            println(camaroteSuperior.imprimeLocation())
        }else{
            println(camaroteInferior.imprimeLocation())
        }
    }else{
        println(ingressoNormal.imprimeValor())
    }
}