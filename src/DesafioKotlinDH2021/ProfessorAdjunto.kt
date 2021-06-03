//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

import java.time.LocalDate

class ProfessorAdjunto (
    nome: String,
    sobrenome: String,
    codProfessor: Int,
    var qtdHorasMonitoria: Int
): Professor(nome, sobrenome, codProfessor){

    init{
        val tempoCasa: LocalDate = LocalDate.now()

    }

}