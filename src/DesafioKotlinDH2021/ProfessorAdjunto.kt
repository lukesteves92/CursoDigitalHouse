//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

import java.time.LocalDate

class ProfessorAdjunto (
    nome: String,
    sobrenome: String,
    codProfessor: Int,
    var qtdHorasMonitoria: Int
): Professor(nome, sobrenome, codProfessor){

    val tipo: String = "Adjunto"

    init{
        val tempoCasa: LocalDate = LocalDate.now()
    }

    override fun toString(): String {
        return "O nome do professor é: $nome $sobrenome / Código: $codProfessor / Tipo: $tipo  "
    }

}