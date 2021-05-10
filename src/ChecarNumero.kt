fun main(){

    checarNumero(4)

    checarNumeroImpar()
}

fun checarNumero(numero: Int):Int{

    when {
        numero%2 == 0 -> println("Esse número é par")
        else -> println("Esse número é Impar")
    }
    return numero
}

fun checarNumeroImpar(){
    var numero = 1
    var cont = 0

    while (cont < 100){
        if (numero % 2 != 0){
            println(numero)
            cont++
        }
        numero++

    }

}

