package LambdaFilterPredicate

fun main(args:Array<String>)
{
    val myNumbers = listOf(2,3,5,6,20,90,60)

    val checkNumbers = myNumbers.all { it > 10 } // all functions is used for to satisfy the condition means all the element greater than 10

    println(checkNumbers)

    val checkAnyNumbers = myNumbers.any { it > 10 } // Any of these elements satisfy the condition

    println(checkAnyNumbers)

    val totalCount = myNumbers.count { it > 10 } //Number of element that satisfy the condition
    println(totalCount)

    val num = myNumbers.find { it > 10 } //Returns the first number that matches the condition
    println(num)
}