package models

open class Funcionario(
    val nome: String,
    val cpf: String,
    private var salario: Double
    ) {
    fun bonificacao(): Double {
        return this.salario*0.1
    }

}