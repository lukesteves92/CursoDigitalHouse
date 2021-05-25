package ExercicioRevisão
import java.util.*
import javax.swing.JOptionPane


fun main(){

         val LucasCorrente = ContaCorrente(505050, 500.00)
         val LucasPoupanca = ContaPoupança(606060, 500.00)
         LucasCorrente.sacar(400.00)
         LucasPoupanca.sacar(1000.00)
          val itau = Banco(arrayListOf(LucasCorrente, LucasPoupanca))

        val relatorio = Relatorio()

         relatorio.gerarRelatorio(LucasCorrente)
         relatorio.gerarRelatorio(LucasPoupanca)

           itau.procurarConta(505050)
           itau.mostrarDados()

          val opcao = Integer.parseInt(JOptionPane.showInputDialog("Para criar sua conta, favor, informar se é: +" +
                  "1 - Conta Corrente +" +
                  "2 - Conta Poupança"))

          if (opcao == 1){

              val numberconta = Integer.parseInt(JOptionPane.showInputDialog("Digitar o numero da nova conta corrente: (6 dígitos inteiros) "))
              val novaconta = ContaCorrente(numberconta, 0.0)

              println("Conta criada com sucesso")

          } else if(opcao == 2){

              val numberconta = Integer.parseInt(JOptionPane.showInputDialog("Digitar o numero da nova conta poupança: (6 dígitos inteiros) "))
              val novaconta = ContaPoupança(numberconta, 0.0)

              println("Conta criada com sucesso")

          }



     }



