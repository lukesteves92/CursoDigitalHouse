package ExercicioRevisão

class ContaPoupança(override var numeroConta: Int, override var saldo: Double) : ContaBancaria(), Imprimivel {

    var limite: Double = 800.00

    override fun sacar(valorSaque: Double) {

        val saldoTotal  = saldo + limite

        if (valorSaque > saldoTotal) {
                println("Saldo Insuficiente")
            } else {
                saldo -= valorSaque
            println("Saque efetuado com sucesso, saldo atual: $saldo")
            }
        }



    override fun depositar(valorDeposito: Double){

        saldo += valorDeposito

        println("Valor depositado com sucesso. Saldo da conta: $saldo ")

    }

    override fun mostrarDados() {
        println("Seu limite é $limite")
    }

}