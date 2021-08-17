package Classes

import Imprimivel

class Foto(override var nome: String, override var tipoDeDocumento: String) : Imprimivel {

    override fun imprimir() {
        TODO("Not yet implemented")
    }
}