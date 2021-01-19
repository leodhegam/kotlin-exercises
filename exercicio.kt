
//1 classe pessoa
class Pessoa (nome:String,nascimento:Int,idade:Int,altura:Int) {
    //1.1 contrutor principal com atributos nome e altura
    val nome:String
    val altura:Int
    
    init {
        this.nome = nome
        this.altura = altura
    }
    override fun toString() = "$nome ($nascimento , $idade)"
}

fun main() {
    println("Hello, world!!!")
   	var p1:Pessoa
    p1 = Pessoa("Leonardo",21,22,180)
    println(p1)
    println(p1.nome)
}