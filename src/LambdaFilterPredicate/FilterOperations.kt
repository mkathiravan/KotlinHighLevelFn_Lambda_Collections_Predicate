package LambdaFilterPredicate

fun main(args:Array<String>)
{
    val myNumbers : List<Int> = listOf(2,4,5,6,19,20,15)

    val myFilterNumbers = myNumbers.filter { v -> v < 10 } //Or we can write like {it < 10}
    //val myFilterNumbers = myNumbers.filter { it < 10 }

    print(myFilterNumbers)


    val mySquareNumbers = myNumbers.map { it * it }
    print(mySquareNumbers)

    val myFilterSquareNumbers = myNumbers.filter { it < 10 }.map { it * it }
    println(myFilterSquareNumbers)
}