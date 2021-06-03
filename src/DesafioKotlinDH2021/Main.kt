//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

// Classe para execução do código e para criação dos objetos

class Main {

    val ProfLucas = ProfessorTitular("Lucas", "Esteves", 1515, "Programação")
    val ProfJaqueline = ProfessorTitular("Jaqueline", "Melo", 1616, "Programação")
    val ProfPaulo = ProfessorAdjunto("Paulo", "Coelho", 1717, 40)
    val ProfVera = ProfessorAdjunto("Vera", "Coelho", 1818, 60)

    val Curso1 = Curso("FullStack", 20001, 3, ProfLucas, ProfPaulo)
    val Curso2 = Curso("Android", 20002, 2, ProfJaqueline, ProfVera)

    val Aluno1 = Aluno("João", "Silva", 1010)
    val Aluno2 = Aluno("Pedro", "Sampaio", 1111)

    val Matricula1 = Matricula(Aluno1, Curso1)
    val Matricula2 = Matricula(Aluno2, Curso2)







}