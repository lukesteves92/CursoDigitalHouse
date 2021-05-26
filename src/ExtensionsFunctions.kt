fun main(){

    val nome: String = "Lucas Esteves"
    nome.colocarSobrenome(lastName = "Coelho")
}


fun String.colocarSobrenome(lastName: String): String{

    return "$this $lastName"

}