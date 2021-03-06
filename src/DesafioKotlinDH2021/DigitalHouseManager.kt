//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

class DigitalHouseManager {

    private val cursos: MutableList<Curso> = mutableListOf()
    private val professores: MutableList<Professor> = mutableListOf()
    private val alunos: MutableList<Aluno> = mutableListOf()
    private val matriculas: MutableList<Matricula> = mutableListOf()

    init {
        println("Digital House Manager iniciado")
    }

    fun listarProfessores(){
        professores.forEach{
            println(it)
        }

    }
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

    fun registrarProfessorAdjunto(nome: String, sobrenome: String, codigo: Int, qtdHorasMonitoria: Int) {
        for (i in professores){
            if (i.codProfessor != codigo) {
                val profAdjunto = ProfessorAdjunto(nome, sobrenome, codigo, qtdHorasMonitoria)
                professores.add(profAdjunto)
                println("Professor registrado com sucesso.")
            }else{
                println("ERRO! Já existe um professor registrado com o código '$codigo'.")

            }
        }
    }

    fun registrarProfessorTitular(nome: String, sobrenome: String, codigo: Int, especialidade: String) {
        for (i in professores){
            if (i.codProfessor != codigo) {
                val profTitular = ProfessorTitular(nome, sobrenome, codigo, especialidade)
                professores.add(profTitular)
                println("Professor registrado com sucesso.")
            }else{
                println("ERRO! Já existe um professor registrado com o código '$codigo'.")

            }
        }
    }

    fun excluirProfessor(codigo: Int) {
        for (i in professores){
            if (i.codProfessor == codigo) {
                professores.remove(i)
                println("Professor removido com sucesso")

            }else{
                println("ERRO! Não existe um professor com este código '$codigo'.")

            }
        }
    }

    fun registrarAluno(nome: String, sobrenome: String,  codigo: Int) {
        for (i in alunos){
            if (i.codigo != codigo) {
                val curso = Aluno(nome, sobrenome, codigo)
                println("Aluno registrado com sucesso.")

            }else{
                println("ERRO! Já existe um aluno registrado com o código '$codigo'.")

            }
        }
    }

    fun registrarMatricula(aluno: Aluno, curso: Curso) {

        for (i in cursos){
            if (i.alunosMatriculados.size < i.qtdMaxAlunos) {
                val matricula = Matricula (aluno, curso)
                println("Matrícula registrada com sucesso.")
            }else{
                println("ERRO! Matrícula já efetuada")

            }
        }
    }




}


