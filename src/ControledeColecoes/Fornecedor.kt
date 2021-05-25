package ControledeColecoes
import java.util.*
import javax.swing.JOptionPane

class Fornecedor(var listaprodutos: MutableList<Produto>){

    fun entrar(Produto: Produto){

        listaprodutos?.add(Produto)

    }

    fun listarProdutos(){

        listaprodutos?.forEach{
           println(" ${it.descricao} , ${it.preco}")

        }
    }



}