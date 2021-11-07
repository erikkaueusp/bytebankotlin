import models.ContaCorrente
import models.ContaPoupanca
import models.Funcionario
import models.Gerente
// Unit is like void
// A regra do Kotlin é que a variavel deve ser inicializada
fun main() {
    println("Bem vindo ao bytebank")
    testaComportamentosConta()
    val Erik = Funcionario(nome = "Erik", cpf = "21231231231", salario = 100.0)
    var a = Gerente(nome = "" ,cpf = "",salario = 54.63)
    println(a.comentario)

/////////////////////////////////////////////////////////////////////////////////
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

    var  joao:Funcionario = Funcionario(nome = "Joao",salario = 4000.0,cpf = "122454")

//    é um objeto, só que é um objeto anônimo, nós não temos uma classe aqui. Criamos a instância diretamente
//    Também chamado de object expression
//    temos também object declarations a grande diferença que temos entre o “Object Expressions” e também o “declarations”. A diferença que temos é a seguinte, pessoal: se viermos aqui no código, o “declarations” vai ter um nome, que é diferente aqui do “Expressions”.
//    Há também um tal de “Companion Objects”, que seriam os objetos companheiros. Qual é a ideia do “Companion Objects”? É justamente fazer com que o “Object declaration” consiga compartilhar os seus membros quando ele está dentro aqui de uma classe
//    Outra ideia é que esse companion faz com que o objeto declarations vire um companheiro de outra classe na qual este foi implementado
    val fran = object:Autenticavel {
        val nome: String = "Fran"
        val cpf: String = "111.111.111-11"
        val senha: Int = 1000

        override fun autentica(senha: Int) = this.senha == senha
    }
    val funcionario:Funcionario = Gerente("fre","213231",21.254)
    println(funcionario.bonificacao())
}



