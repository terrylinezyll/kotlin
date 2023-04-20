fun main(args: Array<String>) {
    // for loops
    for(i in 5..9){
        println(i)
    }
    var myarray= arrayOf("sawe",8,false,'H')
    for (name in myarray){
        println(name)
    }
    var num2=10
    while (num2>=5){
        println("Loop: $num2")
        num2--
    }
    var num3=4
    while (num3<=34){
        println("Loop: $num3")
        num3--
    }
}