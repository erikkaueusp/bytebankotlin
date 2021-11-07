package models
class Diretor(
    nome:String,
    cpf:String,
    salario:Double,
    var senha: Int = 4000,
    val plr: Double
): Funcionario(nome, cpf, salario) {

    fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }


}