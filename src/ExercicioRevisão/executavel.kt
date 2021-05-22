package ExercicioRevisão

class executavel {

    val LucasCorrente = ContaCorrente(505050, 500.00)
    val LucasPoupanca = ContaPoupança(606060, 500.00)

     fun main(){

         LucasCorrente.sacar(400.00)
         LucasPoupanca.sacar(1800.00)

     }

}

