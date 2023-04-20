class Msom8(val name:String,val age:Int,val gender:String){

}

fun main(args: Array<String>) {
    val stu=Msom8("Mike",50,"Male")
    println("my name is ${stu.name}and I am ${stu.age}years old and a ${stu.gender}")
}