
/*
fun main(){
    var tripe1 = Tripe(30,50, 80)
    Tripe(tripe1.alturaMinima, tripe1.alturaMaxima, tripe1.alturaAtual).guardar(tripe1.prontoParaGuardar(tripe1.dobrar(tripe1.definirAltura(60))))
    println("")
    Tripe(tripe1.alturaMinima, tripe1.alturaMaxima, tripe1.alturaAtual).usar(tripe1.prontoParaUsar(tripe1.desdobrar(tripe1.definirAltura(30))))
}
class Tripe(
    var alturaMinima: Int,
    var alturaMaxima: Int,
    var alturaAtual: Int
){
    fun definirAltura(novaAltura: Int): Int {
        var novaAltura: Int = novaAltura
        println("Definir Altura: A altura atual do tripé foi definida de ${alturaAtual} cm para $novaAltura cm.")
        return novaAltura
    }
    fun dobrar(tripe: Int): Int {
        var dobrado: Int = tripe / 2
        println("Dobrar: Após dobrar o tripé, a sua altura passou de ${tripe}cm para ${dobrado}cm.")
        return dobrado
    }
    fun desdobrar(tripe: Int): Int{
        var desdobrado: Int = tripe * 2
        println("Desdobrar: Após desdobrar o tripé, a sua altura passou de ${tripe}cm para ${desdobrado}cm.")
        return desdobrado
    }
    fun guardar(tripe: Int){
        println("Guardar: Guardando tripé dobrado com $tripe cm.")
    }
    fun prontoParaGuardar(tripe: Int): Int{
        if(tripe <= alturaMinima){
            println("Pronto para Guardar: A altura minima permitida é de $alturaMinima cm e o seu tripé possui $tripe cm, portanto está pronto para ser guardado.")
        }else{
            println("Pronto para Guardar: A altura minima de $alturaMinima cm foi excedida, pois seu tripé possui $tripe cm.")
        }
        return tripe
    }
    fun usar(tripe: Int){
        println("Usar: Usando tripé desdobrado com $tripe cm.")
    }
    fun prontoParaUsar(tripe: Int): Int{
        if(tripe >= alturaMaxima / 2){
            println("Pronto para Usar: O tripé está pronto para ser usado, visto que seu tamanho é superior a metade da altura máxima de $alturaMaxima cm.")
        }else{
            println("Pronto para Usar: O tripé não está pronto para ser usado, visto que seu tamanho não é superior a metade da altura máxima de $alturaMaxima cm.")
        }
        return tripe
    }
}
*/
