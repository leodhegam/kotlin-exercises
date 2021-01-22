import java.time.LocalDate

open class Pessoa  (val nome:String, val altura:Float) {

    var nascimento:LocalDate?=null
    var idade = Int
    constructor(nome:String,altura:Float,nascimento:LocalDate): this(nome,altura) {
        this.nascimento = nascimento
    }

    fun calcularIdade(){
//TODO
    }
    override fun toString() = "$nome ($nascimento , $altura)"

}
class Funcionario(nome:String, altura: Float, salario: Float) : Pessoa(nome, altura) {

    private var salario: Float

    init {
        this.salario = salario
    }

    override fun toString() = "$nome ($salario)"
}
class Agenda() {
    var listPessoas = ArrayList<Pessoa>(10)


    fun armazenaPessoa(pessoa: Pessoa){
      if(listPessoas.size != null && listPessoas.size <=10) listPessoas.add(pessoa) else println("Não foi possivel adicionar")

    }
    fun removePessoa(nome: String){
        var aux: Int? = buscaPessoa(nome);
        if(aux != null){
            listPessoas.removeAt(aux);
        }
    }

    fun buscaPessoa(nome: String): Int?{
        var aux: Int? = null;
        for(i in listPessoas){
            if(i.nome == nome)
                aux = listPessoas.indexOf(i);
        }
        return aux;
    }
    fun printPessoa(indice: Int){
        return (if(indice != null)println(listPessoas[indice].toString()) else println("Pessoa não encontrada"))
//
    }

    fun printAgenda() {
        var tamanho:Int = listPessoas.count()
        for(i in 0..tamanho-1){ //de 0 ate o indice
            printPessoa(i)
        }
    }

}

fun main () {
//    PESSOA

    var p1 = Pessoa("Leonardo", 1.70f , LocalDate.of(1998, 8, 21))
    var p2 = Pessoa("Alyson", 1.90f , LocalDate.of(1989, 3, 1))
    var p3 = Pessoa("Taniro", 1.70f , LocalDate.of(1995, 4, 17))
    var p4 = Pessoa("Jojo", 1.75f , LocalDate.of(1993, 7, 15))
    var p5 = Pessoa("Antoin", 1.70f , LocalDate.of(1987, 9, 13))
    var p6 = Pessoa("Marquinho", 1.40f , LocalDate.of(1999, 1, 3))
    var p7 = Pessoa("Gustavin", 1.50f , LocalDate.of(1989, 1, 4))
    var p8 = Pessoa("Gilmar", 1.90f , LocalDate.of(1979, 2, 6))
    var p9 = Pessoa("Cris", 1.90f , LocalDate.of(1985, 2, 6))
    var p10 = Pessoa("Messi", 1.20f , LocalDate.of(1998, 6, 9))
    print(p9.toString())


//    AGENDA
    var agenda = Agenda()
    agenda.armazenaPessoa(p1)
    agenda.armazenaPessoa(p2)
    agenda.armazenaPessoa(p3)
    agenda.armazenaPessoa(p4)
    agenda.armazenaPessoa(p5)
    agenda.armazenaPessoa(p6)
    agenda.armazenaPessoa(p7)
    agenda.armazenaPessoa(p8)
    agenda.armazenaPessoa(p9)
    agenda.armazenaPessoa(p10)
    agenda.printAgenda()
    agenda.removePessoa("Messi")
    println("-----------removendo Messi------")
    agenda.printAgenda()

//    FUNCIONÁRIO
    var func = Funcionario("Funcionario 1",1.78f,1200f)
    println(func.toString())

}