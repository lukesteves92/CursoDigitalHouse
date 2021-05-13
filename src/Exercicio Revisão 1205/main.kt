package `Exercicio Revisão 1205`


fun main(){

    val professor = Professor("Lucas Esteves", "12345")
    val materiaKotlin = Materia("Android")
    val aulaKotlin = Aula(materiaKotlin, "19:30", "21:45"
    )
    val Lucas = Aluno ("123456", "Lucas", "Esteves")
    val curso = Curso ("Curso Android", listOf(aulaKotlin), listOf(Lucas), professor)
    val turmaTop = Turma("Turma 1 - Android", curso)


}