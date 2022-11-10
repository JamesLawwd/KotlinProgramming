import java.util.Scanner
fun main(){
    // Create a BMI

    // Enter your bmi
    var input = Scanner(System.`in`)
    println("Enter your weight :")
    var weight = input.nextInt()


    println("Enter your height:")
    var height = input.nextDouble()




    var bmi =weight/ (height*height)
    println(" Your bmi is $bmi")











}