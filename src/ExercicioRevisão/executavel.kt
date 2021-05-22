package ExercicioRevisão



fun main(){
         val LucasCorrente = ContaCorrente(505050, 500.00)
         val LucasPoupanca = ContaPoupança(606060, 500.00)
         LucasCorrente.sacar(400.00)
         LucasPoupanca.sacar(1000.00)

        val relatorio = Relatorio()

    relatorio.gerarRelatorio(LucasCorrente)
    relatorio.gerarRelatorio(LucasPoupanca)

     }



