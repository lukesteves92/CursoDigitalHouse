package ExercicioRevisão

class Banco(var listaContas: MutableList<ContaBancaria>): Imprimivel {

    fun inserir(ContaBancaria: ContaBancaria) {

        listaContas?.add(ContaBancaria)

    }

    fun remover(ContaBancaria: ContaBancaria) {

        listaContas?.remove(ContaBancaria)


    }

    fun procurarConta(ContaBancaria: ContaBancaria) {

        if (listaContas?.contains(ContaBancaria)){

            println("Conta Bancária existente")
        }else{

            println("Conta não existente")
        }



    }

    override fun mostrarDados() {



    }
}


