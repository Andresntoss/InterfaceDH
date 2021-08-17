package Classes

import Imprimivel

class Contrato(override var nome: String, override var tipoDeDocumento: String) : Imprimivel {
    override fun imprimir() {
        TODO("Not yet implemented")
    }
}