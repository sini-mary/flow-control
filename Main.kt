
fun main() {
    checkOdd()
    robot(44)

    var n=names(arrayOf("Joana","Denise","Rico","Staicy","Anita"))
    println(n)
    eachNumber()


}


fun checkOdd(){
    var num =1..100
    for (n in num){
        if (n%2!=0){
            println(n)
        }
    }
}
fun names(name:Array<String>):Int{
    var x =0
    for(n in name){
        if (n.length>5){
            x++
        }

    }
    return x
}



fun robot(age:Int){
    when(age){
        in 0..5-> println("milk")
        in 6..14-> println("fanta orange")
        else-> println("coca cola")

    }

}
fun eachNumber() {
    for (number in 1..100)

        if (number%15==0) {
            println("fizzBuzz")
        }
        else if (number%3 == 0) {
            println("Fizz")
        }
        else if (number % 5 == 0) {
            println("Buzz")
        }
        else{
            println(number)
        }
}













