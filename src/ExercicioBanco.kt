/*
package Exercicio1Banco
class ExercicioBanco {
    fun main() {
        val ze = Cliente("Zé", "Ruela")
        val joao = Cliente("João", "Rosca")
        val conta_ze = Conta(1u, 0.0, titular = ze)
        val conta_joao = Conta(2u, 0.0, titular = joao)
        conta_ze.deposito(50.0)
        conta_ze.saque(30.0)
        conta_joao.deposito(100.0)
        conta_joao.saque(50.0)
    }
}
class Cliente(val nome: String, val sobrenome: String) {}
class Conta(val numero: UInt, var saldo: Double, val titular: Cliente) {
    fun deposito(quantidade: Double) {
        saldo += quantidade
        imprimeTransacao("Depósito ${titular.nome} ${titular.sobrenome}", saldo)
    }
    fun saque(quantidade: Double) {
        saldo -= quantidade
        imprimeTransacao("Saque ${titular.nome} ${titular.sobrenome}", saldo)
    }
    fun imprimeTransacao(transacao: String, saldo: Double) {
        println("Transação: $transacao, Novo saldo: $saldo")
    }
}
*/
