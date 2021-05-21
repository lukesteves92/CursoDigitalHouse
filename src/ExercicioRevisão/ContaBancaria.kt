package ExercicioRevisão

abstract class ContaBancaria() {


    abstract var numeroConta: Int

    abstract var saldo: Double

    abstract fun sacar(valorSaque: Double) : String

    abstract fun depositar() : String

    fun transferir(valorTransferencia: Double, conta: ContaBancaria){



    }

}




