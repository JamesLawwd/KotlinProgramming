//fun main(){
//    var count = 0
//    count = count + 1
//
//    // Hey name the sum is sum
//    var name = "Giroud"
//
//    var number1 = 100
//    var number2 = 500
//
//    var sum = number1 + number2
////    println(" Hey" + " " + name +"" +"The sum is" +""+ sum )
//    println("Hey $name the sum is $sum") // templating/formatting
//}
//
// write a kotlin programme to calculate simple interest
// principal
// rate
// time
//
///interest = (principle*rateOfInterest*time)/100

import java.util.Scanner
fun main(){
//    // Enter the principal amount
//    println("Enter Principal Amount : ")
//    val principalAmount = 6000
//
//    // Enter the rate of interest
//    println("Enter Rate of Interest : ")
//    val rateOfInterest = 10
//
//    // Enter the time
//    println("Enter the time")
////    val time = 2
//
//    //Calculate Simple Interest
//    val simpleInterest = (principalAmount*rateOfInterest*time)/100
//
//    // Simple Interest
//    println("Simple Interest is :$simpleInterest")

     var input = Scanner(System.`in`)
     println("Enter Principle :")

     var principle = input.nextInt()

     println("Enter the Rate:")
     var rate = input.nextInt()

     println("Enter time:")
     var time = input.nextInt()

    var interest = (principle * rate* time)/100
    println(" Your interest is $interest")

}
