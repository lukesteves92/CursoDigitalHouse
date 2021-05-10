// para herdar de uma classe, a pai precisa estar aberta
// quando declarar construtor na pai, precisa colocar um valor default na variavel que está passando

fun main(){

    val bichano = Bichano()

    bichano.sexo = "M"
    bichano.cor = "Preto"


}

open class Animal(var sexo: String = "0"){

    var cor = ""
    constructor(sexo: String, cor: String): this(sexo){
        this.cor = cor
    }

}

class Cachorro: Animal(sexo = "M"){

}

open class Gato: Animal(sexo = "F", cor = "Branco"){


}

class Bichano: Gato(){



}






