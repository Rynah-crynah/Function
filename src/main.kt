fun main(){
takeName("PJ")
    sum(376,243,412,166)
    modulus(146,12)
    amuseMe("white meat" ,"sleep")






}
fun takeName(name:String){
    println("Hello $name" )
}

fun modulus(number1:Int, number2:Int): Int{
    var w = (number1 % number2)
    println(w)
    return w
}

fun sum(number1:Int, number2:Int, number3:Int, number4:Int): Int{
    var x = (number1+ number2+ number3 + number4)
    println(x)
    return x
}
fun amuseMe(food: String, activity: String){
    println("food ,$activity")


}




