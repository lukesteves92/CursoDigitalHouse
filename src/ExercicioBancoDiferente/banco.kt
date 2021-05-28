import java.util.*
abstract class ContaBancaria : Imprimivel {
    abstract val numeroDaConta: Int
    abstract var saldo: Double
    abstract fun criarConta(numero: Int, primeiroDeposito: Double)
    abstract fun sacar(
        value: Double
    )
    abstract fun depositar(
        value: Double
    )
    fun transferir(value: Double, contaBancaria: ContaBancaria) {
        sacar(value)
        contaBancaria.depositar(value)
    }
}
class ContaCorrente(
    override var numeroDaConta: Int,
    override var saldo: Double,
    val taxaDeOperacao: Double = 50.00
) : ContaBancaria(), Imprimivel {
    override fun criarConta(numero: Int, primeiroDeposito: Double) {
        numeroDaConta = numero
        saldo = primeiroDeposito
    }
    override fun sacar(value: Double) {
        if (value > (saldo - taxaDeOperacao)) {
            println("Saldo insuficiente.")
        } else {
            saldo -= value + taxaDeOperacao
            println("Saque de R$$value realizado com sucesso e taxa de R$$taxaDeOperacao cobrada.")
        }
    }
    override fun depositar(value: Double) {
        this.saldo += value - taxaDeOperacao
        println("Deposito de R$$value realizado com sucesso e taxa de R$$taxaDeOperacao cobrada.")
    }
    override fun mostrarDados() {
        println(
            "Numero da conta: $numeroDaConta.\n" +
                    "Saldo atual: R$$saldo.\n" +
                    "Taxa de operacao: R$$taxaDeOperacao. \n"
        )
    }
}
class ContaPoupanca(
    override var numeroDaConta: Int,
    override var saldo: Double = 0.00,
    var limite: Double = 1000.00
) : ContaBancaria(), Imprimivel {
    override fun criarConta(numero: Int, primeiroDeposito: Double) {
        numeroDaConta = numero
        saldo = primeiroDeposito
    }
    override fun sacar(value: Double) {
        when {
            value <= saldo -> {
                saldo -= value
                println("Saque de R$$value realizado com sucesso.")
            }
            value > saldo -> {
                println(
                    "Saldo insuficiente! Você deseja utilizar o seu limite especial atual de R$$limite?\n" +
                            "Digite 1 para SIM ou 2 para NÃO\n"
                )
                var reader = Scanner(System.`in`)
                var answer: Int = reader.nextInt()
                if (answer == 1) {
                    var total = saldo + limite
                    limite = total - value
                    saldo = 0.00
                    println("Saque de R$$value realizado com sucesso do seu limite especial.")
                } else {
                    println("Operação encerrada.")
                }
            }
        }
    }
    override fun depositar(value: Double) {
        if (limite < 1000.00 && value > 1000.00 - limite) {
            var total = limite + value
            saldo = total - 1000.00
            limite = (total - saldo)
            println("Você depositou R$$value e seu saldo atual é de R$${this.saldo} e seu cheque especial foi restabelecido para R$${limite}.")
        } else {
            saldo = 0.00
            limite += value
            //this.saldo += value
            println("Você depositou R$$value e seu saldo atual é de R$${this.saldo} e seu cheque especial foi restabelecido para R$${limite}.")
        }
    }
    override fun mostrarDados() {
        println(
            "Numero da conta: $numeroDaConta.\n" +
                    "Saldo atual: R$$saldo.\n" +
                    "Limite disponivel: R$$limite.\n"
        )
    }
}
class Relatorio {
    fun gerarRelatorio(imprimivel: Imprimivel) {
        imprimivel.mostrarDados()
    }
}
interface Imprimivel {
    fun mostrarDados()
}
class Banco(
    var listaDeContas: MutableList<ContaBancaria>
) : Imprimivel {
    fun inserir() {
        val reader = Scanner(System.`in`)
        println(
            "Para criar uma conta digite :\n" +
                    "1- Conta Poupanca\n" +
                    "2- Conta Corrente\n" +
                    "3- Retornar"
        )
        val answer1: Int = reader.nextInt()
        when {
            (answer1 == 1) -> {
                println("Digite o numero da sua conta:\n")
                var numero: Int = reader.nextInt()
                println("Informe o seu primeiro deposito:\n")
                var deposito: Double = reader.nextDouble()
                var conta = ContaPoupanca(numero, deposito)
                conta.criarConta(numero, deposito)
                listaDeContas.add(conta)
                println("Conta Poupança numero: ${conta.numeroDaConta}, criada.")
            }
            (answer1 == 2) -> {
                println("Digite o numero da sua conta:\n")
                var numero: Int = reader.nextInt()
                println("Informe o seu primeiro deposito:\n")
                var deposito: Double = reader.nextDouble()
                var conta = ContaCorrente(numero, deposito)
                conta.criarConta(numero, deposito)
                listaDeContas.add(conta)
                println("Conta Corrente numero: ${conta.numeroDaConta}, criada.")
            }
            (answer1 == 3) -> {
                menu()
            }
        }
    }
    fun remover(numero: Int) {
        for (i in listaDeContas) {
            if (i.numeroDaConta == numero) {
                listaDeContas.remove(i)
                println("Conta ${numero}, removida.")
                return
                // break
            }
        }
        println("Conta nao existe")
    }
    fun procurarConta(conta: Int?) {
        for (i in listaDeContas) {
            if (i.numeroDaConta == conta ?: 0) {
                println("Conta encontrada")
                println(
                    "Selecione o servico: \n" +
                            "1- Sacar \n" +
                            "2- Depositar \n" +
                            "3- Transferir\n" +
                            "4- Relatorio\n" +
                            "5- Remover Conta\n" +
                            "6- Retornar ao Menu\n"
                )
                val reader = Scanner(System.`in`)
                val answer = reader.nextInt()
                when {
                    (answer == 1) -> {
                        println("Qual o valor deseja sacar: \n")
                        val answer2 = reader.nextDouble()
                        i.sacar(answer2)
                        menu()
                    }
                    (answer == 2) -> {
                        println("Qual o valor deseja depositar: \n")
                        val answer3 = reader.nextDouble()
                        i.depositar(answer3)
                        menu()
                    }
                    (answer == 3) -> {
                        println("Para qual conta deseja transferir?\n")
                        val answer4 = reader.nextInt()
                        for (t in listaDeContas) {
                            if (t.numeroDaConta == answer4) {
                                println("Qual o valor deseja transferir: \n")
                                val answer5 = reader.nextDouble()
                                i.transferir(answer5, t)
                                menu()
                            }
                        }
                        println("Conta $conta inexistente.")
                    }
                    (answer == 4) -> {
                        val relatorio = Relatorio()
                        relatorio.gerarRelatorio(i)
                        menu()
                    }
                    (answer == 5) -> {
                        remover(conta ?: 0)
                        menu()
                    }
                    (answer == 6) -> {
                        menu()
                        return
                    }
                    else -> {
                        println("Opcao invalida.")
                        menu()
                    }
                }
                return
            }
        }
        println("Conta inexistente.")
        menu()
    }
    override fun mostrarDados() {
        listaDeContas.forEach {
            println(
                "Numero da conta: ${it.numeroDaConta}.\n" +
                        "Saldo atual: R$${it.saldo}\n"
            )
        }
    }
    fun menu() {
        println(
            "----- BEM VINDO AO BANK -----\n" +
                    "Digite o numero correspondente ao servico desejado: \n" +
                    "1- Criar Conta\n" +
                    "2- Procurar uma conta\n" +
                    "3- Finalizar\n"
        )
        var reader = Scanner(System.`in`)
        var answer: Int? = reader.nextInt()
        when {
            (answer == 1) -> {
                inserir()
                menu()
            }
            (answer == 2) -> {
                println("Digite o numero da conta desejada: ")
                var reader = Scanner(System.`in`)
                var answer = reader.nextInt()
                procurarConta(answer)
            }
            (answer == 3) -> {
                println("Aplicativo finalizado")
            }
            else -> {
                println("Opcao invalida")
                menu()
            }
        }
    }
}
fun main() {
    var joaocorrente = ContaCorrente(
        111,
        1000.00
    )
    var mariapoupanca = ContaPoupanca(222, 900.00)
    var Bank = Banco(mutableListOf(joaocorrente, mariapoupanca))
    Bank.menu()
}