//Dev: Lucas Esteves Albuquerque Coelho - Year: 2021

package DesafioKotlinDH2021

class Curso (

    val nome: String,
    val codigoCurso: Int
) {

    override fun equals(other: Any?): Boolean {
        return (other as? Curso)?.let {
            codigoCurso == it.codigoCurso
        } ?: false
    }






}