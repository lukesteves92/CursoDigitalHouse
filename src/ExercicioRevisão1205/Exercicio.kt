package ExercicioRevisão1205

import java.util.*
import javax.swing.JOptionPane


fun main() {

    val professor = Professor("Joaquim", "Neves", "505050")
    val professor2 = Professor("Leandro", "Silva", "505050")
    val materiaKotlin = Materia("Android")
    val aulaKotlin = Aula(
        materiaKotlin, "19:30", "21:45"
    )
    val Lucas = Aluno("123456", "Lucas", "Esteves")
    val Pedro = Aluno("12345", "Pedro", "Melo")
    val curso = Curso("Curso Android", listOf(aulaKotlin), listOf(Lucas, Pedro), listOf(professor, professor2))
    val turmaTop = Turma("Turma 1 - Android", curso)

var nomeUsuario = "0"

var opcao = 0
    while (opcao < 1 || opcao > 6) {
         opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu Digital House:+" +
                        "1 - Consultar Alunos+" +

                        "2 - Consultar Professores+" +

                        "3 - Consultar Cursos disponiveis" +

                        "4 - Consultar RegistroAcademico" +

                        "5 - Sair"
            )
        )
    }

    when (opcao) {
        1 -> curso.listaAlunos.forEach { JOptionPane.showMessageDialog(null, it.nome) }
        2 -> curso.listaProfessor.forEach { JOptionPane.showMessageDialog(null, it.nome) }
        3 -> JOptionPane.showMessageDialog(null, curso.nome)
        4 -> curso.listaAlunos.forEach{JOptionPane.showMessageDialog(null, it.registroAcademico)}
        5 -> JOptionPane.showMessageDialog(null, "Volte Sempre!")

    }

}

class Aluno(var registroAcademico: String, nome: String, sobrenome: String) : Pessoa(nome, sobrenome) {

    fun assistirAula() {

    }
    fun fazerLicao() {
    }
}

class Aula (var materia: Materia, var horaInicio: String, var horaTermino: String){}

class Curso(
    var nome: String,
    var listaAulas: List<Aula>,
    var listaAlunos: List<Aluno>,
    var listaProfessor: List<Professor>
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