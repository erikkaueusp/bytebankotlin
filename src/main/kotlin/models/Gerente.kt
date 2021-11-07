package models

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    private var senha: Int = 1234

) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            return true
        }
        return false
    }

    var comentario = "asdasd"
        get() = field
        private set

}