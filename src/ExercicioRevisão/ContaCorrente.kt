package ExercicioRevisão

class ContaCorrente(override var numeroConta: Int, override var saldo: Double) : ContaBancaria(), Imprimivel {

    var taxaDeOperacao: Double = 0.0

    override fun sacar(valorSaque: Double): String {

        saldo -= valorSaque

        return "Saque realizado com sucesso. Saldo atual: {$saldo}"
    }

    override fun depositar(valorDeposito: Double): String {

        saldo += valorDeposito

        return "Valor depositado com sucesso. Saldo da conta: $saldo "
    }

    override fun mostrarDados() {
        println("Sua Taxa de Operação é $taxaDeOperacao")
    }


}