class Students{
    //memberdata
    val number:Int=9
    val number1:Int=34
    fun calculateSquare():Int{
        return number*number

    }
    fun calculatedifference():Int{
        return number1-number
    }
}

fun main(args: Array<String>) {
    //creating object
    val myobj=Students()
    println(myobj.calculateSquare())
    val mythb=Students()
    println(mythb.calculatedifference())
}