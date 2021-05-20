package ExercicioRevisão1205


fun main() {

    val professor = Professor("Lucas", "Coelho", "12345")
    val materiaKotlin = Materia("Android")
    val aulaKotlin = Aula(
        materiaKotlin, "19:30", "21:45"
    )
    val Lucas = Aluno("123456", "Lucas", "Esteves")
    val Jaqueline = Aluno("12345", "Jaqueline", "Melo")
    val curso = Curso("Curso Android", listOf(aulaKotlin), listOf(Lucas, Jaqueline), professor)
    val turmaTop = Turma("Turma 1 - Android", curso)


    turmaTop.curso.listaAlunos.forEach {
        println(
            "O nome do aluno é ${it.nome} ${it.sobrenome} e o registro " +
                    "acadêmico é ${it.registroAcademico} e +" +
                    "${it.assistirAula()}"
        )
    }
}

class Aluno(var registroAcademico: String, nome: String, sobrenome: String) : Pessoa(nome, sobrenome) {

    fun assistirAula() {

        println("está assitindo aula")
    }
    fun fazerLicao() {
    }
}

class Aula (var materia: Materia, var horaInicio: String, var horaTermino: String){}

class Curso(
    var nome: String,
    var listaAulas: List<Aula>,
    var listaAlunos: List<Aluno>,
    var professor: Professor
    ) {
}

class Materia(var nome: String){}

open class Pessoa (var nome: String, var sobrenome: String) {}

class Professor(nome: String, sobrenome: String , var registroDocente: String): Pessoa(nome, sobrenome) {}

class Turma(
    var nome: String,
    var curso: Curso
    ) {
}