/*
fun main() {
// as instancias sempre vão ser diferentes, pois os endereços de memoria diferentes
    // Se usar o .equals ou ==, é a mesma coisa


    val ferrariF50 = Ferrari() // 1234
    val ferrariF40 = Ferrari() // 4321
    ferrariF40.nome = "Ferrari Tesla"
    val ferrariF60 = ferrariF40 // 4321

    val nome1 = "Cesar Rodrigues"
    val nome2 = "cesar rodrigues"

    val listaTeste = listOf("cesar", "Cesar", "Pedro", "Edu")
    println(listaTeste.asReversed())

    if (nome1 == nome2) {
        println("Sao iguais")
    } else {
        println("Sao diferentes")
    }

//    println(ferrariF40.nome)
//    println(ferrariF60.nome)

    ferrariF60.nome = "Ferrari Fiat"

//    println(ferrariF40.nome)
//    println(ferrariF60.nome)

    if (ferrariF40 == ferrariF50) {
        println("Sao iguais")
    } else {
        println("Sao diferentes")
    }

//    if (ferrariF40 == ferrariF60) {
//        println("Sao iguais")
//    } else {
//        println("Sao diferentes")
//    }
}

// Editando o equals, para comparar o parametro nome do objeto ferrari

 //override fun equals(other: Any?): Boolean {
        //val outraFerrari = other as? Ferrari
        //return  when(other) {
            //is Ferrari -> {
                //this.nome == outraFerrari?.nome
           // }
            //else -> {
            //    super.equals(other)
           // }
       // }

*/




