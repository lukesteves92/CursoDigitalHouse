//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

class DigitalHouseManager {

    private val cursos: MutableList<Curso> = mutableListOf()
    private val professores: MutableList<Professor> = mutableListOf()
    private val alunos: MutableList<Aluno> = mutableListOf()
    private val matriculas: MutableList<Matricula> = mutableListOf()


    fun registrarCurso(nome: String, codigo: Int, qtdMaxAlunos: Int, professorT: ProfessorTitular, professorA: ProfessorAdjunto) {
         for (i in cursos){
            if (i.codigoCurso != codigo) {
                val curso = Curso(nome, codigo, qtdMaxAlunos, professorT, professorA)
                println("Curso registrado com sucesso.")

            }else{
                println("ERRO! Já existe um curso registrado com o código '$codigo'.")

            }
        }
    }

    fun excluirCurso(codigo: Int) {
        for (i in cursos){
            if (i.codigoCurso == codigo) {
                cursos.remove(i)
                println("Curso removido com sucesso")

            }else{
                println("ERRO! Não existe um curso com este código '$codigo'.")

            }
        }
    }


}


