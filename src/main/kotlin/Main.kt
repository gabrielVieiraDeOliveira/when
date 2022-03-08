fun main() {


}

fun atividadeWhen(): Unit{
    println("Digite um valor:")
    val preco = readLine()!!.toInt()
    when(preco){
        1 -> preco - 0.1
        2 -> preco + 0.03
        3 -> preco + 0.15
    }
}