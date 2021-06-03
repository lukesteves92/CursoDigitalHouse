//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

import java.time.LocalDate

class Matricula (
    val aluno: Aluno,
    val curso: Curso
){
    var dataMatricula: LocalDate = LocalDate.now()
}

