// para herdar de uma classe, a pai precisa estar aberta
// quando declarar construtor na pai, precisa colocar um valor default na variavel que está passando

fun main(){


}

open class Animal(val sexo: String = "0"){

    constructor(sexo: String, cor: String): this(sexo)
}

class Cachorro: Animal(sexo = "M"){

}

class Gato: Animal(sexo = "F", cor = "Branco"){


}








