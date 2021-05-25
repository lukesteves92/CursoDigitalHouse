package ControledeColecoes

fun main(){

    var cocacola = Produto("Refrigerante de Cola", 2.50)
    var coxinha = Produto("Coxinha de Frango", 1.50)
    var Skol = Produto("Cerveja Skol", 2.80)

    var Distribuidor1 = Fornecedor(mutableListOf(cocacola, coxinha, Skol))

    Distribuidor1.listarProdutos()

    

}


