package ExercicioRevisão

class ContaPoupança(override var numeroConta: Int, override var saldo: Double) : ContaBancaria(), Imprimivel {

    var limite: Double = 800.00
    val saldoTotal  = saldo + limite

    override fun sacar(valorSaque: Double) {

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
        println("Seu limite é $limite, seu saldo é $saldoTotal e sua conta é $numeroConta")
    }

}