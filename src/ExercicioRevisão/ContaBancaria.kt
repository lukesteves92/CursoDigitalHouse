package ExercicioRevisão

abstract class ContaBancaria() {

    abstract val numeroConta: Int

    abstract val saldo: Double

    abstract fun sacar(value: Double)

    abstract fun depositar(value: Double)

    fun transferir(valorTransferencia: Double, contaBancaria: ContaBancaria){

        sacar(valorTransferencia) // Conta que está chamando
        contaBancaria.depositar(valorTransferencia) // Conta alvo, por isso está contaBancaria.depositar


    }

}




