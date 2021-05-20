package Equals


open class Pessoa(var nome: String, var rg: Int) {

    override fun equals(other: Any?): Boolean {
        val outraPessoa = other as? Pessoa
        return when (other) {
            is Pessoa -> {
                this.rg == outraPessoa?.rg
            }
            else -> {
                super.equals(other)
            }
        }

    }

    fun main() {

        val pessoa1 = Pessoa("Lucas Esteves", 454545)
        val pessoa2 = Pessoa("Lucas Silva", 454545)

        println(pessoa1.equals(pessoa2))


    }
}

