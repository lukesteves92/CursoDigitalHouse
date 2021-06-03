//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

class Curso (

    val nome: String,
    val codigoCurso: Int,
    val qtdMaxAlunos: Int,
    val professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto
    ) {

    val alunosMatriculados: MutableList<Aluno> = mutableListOf()

    override fun equals(other: Any?): Boolean {
        return (other as? Curso)?.let {
            codigoCurso == it.codigoCurso
        } ?: false
    }

    override fun hashCode(): Int {
        return codigoCurso.hashCode()
    }

    override fun toString(): String {
        return "O nome do curso é: $nome / Código: $codigoCurso)"
    }




}