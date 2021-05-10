// para herdar de uma classe, a pai precisa estar aberta
// quando declarar construtor na pai, precisa colocar um valor default na variavel que está passando
// com o open em frente a função, eu consigo subscrever a função
// se colocar open nas variveis, consigo subscrever tambem

fun main(){

    val bichano = Bichano()

    bichano.sexo = "M"
    bichano.cor = "Preto"
    bichano.come()

}

open class Animal(open var sexo: String = "0"){

    var cor = ""
    constructor(sexo: String, cor: String): this(sexo){
        this.cor = cor
    }

    open fun come(){
        println("Come do jeito default")
    }


}

class Cachorro: Animal(sexo = "M"){

}

open class Gato: Animal(sexo = "F", cor = "Branco"){


}

class Bichano: Gato(){


    override fun come() {
        //super.come()
        println("Como do jeito Bichano")
    }

    override var sexo: String = "M"



}






