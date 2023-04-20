open class Myparents{
    val dad="He likes playing football"
    val mum="she like cookingg"
}
class myboy:Myparents() {
    fun Myboyzs() {
        println(dad)
    }

}
class Mygirl:Myparents(){
    fun Mygirlz(){
        println(mum)
    }
}

fun main(args: Array<String>) {
    val kijana=myboy()
    kijana.Myboyzs()
}