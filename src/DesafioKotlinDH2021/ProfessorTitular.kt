//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

import java.time.LocalDate

class ProfessorTitular (
    nome: String,
    sobrenome: String,
    codProfessor: Int,
    var especialidade: String
): Professor(nome, sobrenome, codProfessor){

    val tipo: String = "Titular"

    init{
        val tempoCasa: LocalDate = LocalDate.now()
    }

    override fun toString(): String {
        return "O nome do professor é: $nome $sobrenome / Código: $codProfessor / Tipo: $tipo  "
    }

}


