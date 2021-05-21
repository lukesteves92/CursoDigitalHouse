package ExercicioRevisão

class ContaCorrente(override var numeroConta: Int, override var saldo: Double) : ContaBancaria(), Imprimivel {

    var taxaDeOperacao: Double = 0.0

    override fun sacar(valorSaque: Double){

        if (valorSaque > (saldo + taxaDeOperacao)) {
            println("Saldo Insuficiente")
        } else {

            saldo -= valorSaque + taxaDeOperacao
            println("Saque executado com sucesso. Saldo $saldo")
        }
    }

    override fun depositar(valorDeposito: Double){

        saldo += valorDeposito - taxaDeOperacao

        println("Valor depositado com sucesso. Saldo da conta: $saldo ")
    }

    override fun mostrarDados() {
        println("Sua Taxa de Operação é $taxaDeOperacao")
    }


}