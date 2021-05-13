package `Exercicio Revisão 1205`


fun main(){

    val professor = Professor("Lucas", "Coelho", "12345")
    val materiaKotlin = Materia("Android")
    val aulaKotlin = Aula(materiaKotlin, "19:30", "21:45"
    )
    val Lucas = Aluno ("123456", "Lucas", "Esteves")
    val curso = Curso ("Curso Android", listOf(aulaKotlin), listOf(Lucas), professor)
    val turmaTop = Turma("Turma 1 - Android", curso)

    println(turmaTop.curso.listaAulas)

    turmaTop.curso.listaAlunos.forEach {
        println("O nome do aluno é ${it.nome} ${it.sobrenome} e o registro " +
                "acadêmico é ${it.registroAcademico}")
    }
}
