package ExercicioRevisão

class ContaPoupança(override var numeroConta: Int, override var saldo: Double) : ContaBancaria(), Imprimivel {

    var limite: Double = 800.00

    override fun sacar(valorSaque: Double): String {

        if (valorSaque > saldo){

            saldo += valorSaque
            limite -= saldo

            return "Voce está utilizando seu limite da conta. $limite"
        } else if (valorSaque < saldo){

            saldo -= valorSaque
        }
        return "Saque realizado com sucesso. Saldo: $saldo"
    }

    override fun depositar(): String{
        TODO("Not yet implemented")
    }

    override fun mostrarDados() {
        println("Seu limite é $limite")
    }

}