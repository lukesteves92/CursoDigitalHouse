package ExercicioRevisão

abstract class ContaBancaria() {

    abstract val numeroConta: Int

    abstract val saldo: Double

    abstract fun sacar(value: Double) : String

    abstract fun depositar(value: Double) : String

    fun transferir(valorTransferencia: Double, conta: ContaBancaria){

    }

}




