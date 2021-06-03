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

    fun adicionarAluno(aluno: Aluno): Boolean {
        return (aluno as? Aluno)?.let {
            if(alunosMatriculados.size == qtdMaxAlunos){
                alunosMatriculados.add(aluno)
                true
            } else {
                println("Desculpe, não há vagas disponíveis!")
                false
            }
        } ?: run {
            println("Não foi possível adicionar o aluno.")
            false
        }
    }

    fun excluirAluno(aluno: Aluno): Boolean {
        return (aluno as? Aluno)?.let {
            if(alunosMatriculados.contains(aluno)){
                alunosMatriculados.remove(aluno)
                true
            } else {
                println("Desculpe, este aluno não pertence a esta turma. Impossível remover")
                false
            }
        } ?: run {
            println("Não foi possível remover o aluno.")
            false
        }
    }


}