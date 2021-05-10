fun main(){
    var atleta1 = Atleta("Sion", 8, 8)
    var atleta2 = Atleta("Lee", 4, 10)
    var corrida = Prova(5, 5)
    var salto = Prova(10, 3)
    var natacao = Prova(3, 10)
    println(Prova(corrida.dificuldade, corrida.energiaNecessaria).podeRealizar(atleta1))
    println(Prova(salto.dificuldade, salto.energiaNecessaria).podeRealizar(atleta1))
    println(Prova(natacao.dificuldade, natacao.energiaNecessaria).podeRealizar(atleta1))
    println("")
    println(Prova(corrida.dificuldade, corrida.energiaNecessaria).podeRealizar(atleta2))
    println(Prova(salto.dificuldade, salto.energiaNecessaria).podeRealizar(atleta2))
    println(Prova(natacao.dificuldade, natacao.energiaNecessaria).podeRealizar(atleta2))
}
class Atleta(
    var nome: String,
    var nivel: Int,
    var energia: Int
){
}
class Prova(
    var dificuldade: Int,
    var energiaNecessaria: Int
){
    fun podeRealizar(atleta: Atleta): Boolean {
        return atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria
    }
}