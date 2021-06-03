//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

class Professor(

    val nome: String,
    val sobrenome: String,
    val codProfessor: Int,
    val tempoCasa: Int

) {
    override fun equals(other: Any?): Boolean {
        return (other as? Professor)?.let {
            codProfessor == it.codProfessor
        } ?: false
    }

    override fun hashCode(): Int {
        return codProfessor.hashCode()
    }

    override fun toString(): String {
        return "O nome do professor é: $nome $sobrenome / Código: $codProfessor)"
    }

}