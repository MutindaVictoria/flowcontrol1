fun main(){
    println(sumOfDigits(23))
    println(sumOfAll(0))
    strReverse("Nadhariamovement")
    newline()
   println(Numbers(17))
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun newline(){
    for (number in 1..100)
        when {
            number% 3==0 &&number%5==0->println("FizzBuzz")
            number %3==0->println("Fizz")
            number%5==0->println("Buzz")
            else ->println(number)

        }
}


//Write a program in Kotlin to find the sum of the digits of a number using a while loop.
fun sumOfDigits(number: Int): Int {
    var sum = 0
    var num = number
    while (num > 0) {
        sum += num % 10
        num /= 10
    }
    return sum}

//Write a program in Kotlin to find the sum of all numbers from 1 to n using a while loop.
fun sumOfAll(numbers: Int):Int{
    val num = 50
    var i = 1
    var sums = 0

    while (i <= num) {
        sums += i
        i++
    }

    return sums
}

//Write a program in Kotlin to reverse a given string using a for loop.
fun strReverse(str:String){
    var result: String = ""
    var lastIndex = str!!.lastIndex

    while (lastIndex >= 0) {
        result += str[lastIndex]
        lastIndex--
    }

    println("Reversed: $result")
}
//Write a Kotlin function that takes an integer as input and
// returns true if the integer is a prime number, and false otherwise.
fun Numbers(num1:Int):Boolean{
    if(num1 <=1){
        return false
    }
    for (num in 2..Math.sqrt(num1.toDouble()).toInt()){
        if (num1 % num == 0) {
            return false
        }
    }
    return true


}


