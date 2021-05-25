package ExercicioRevisão

class Banco(var listaContas: ArrayList<ContaBancaria>): Imprimivel {

    fun inserir(ContaBancaria: ContaBancaria) {

        listaContas?.add(ContaBancaria)

    }

    fun remover(ContaBancaria: ContaBancaria) {

        listaContas?.remove(ContaBancaria)


    }

    fun procurarConta(numeroConta: Int) {
        for (i in listaContas) {
            if (i.numeroConta == numeroConta) {
                println("Conta Existente")
                break
            } else {
                println("Conta Não encontrada")
                break
            }


        }

    }

    override fun mostrarDados() {

        listaContas.forEach{

            println("Lista de contas: ${it.numeroConta}")

        }
    }


    }







