package HighLevelFunctions

fun main(args: Array<String>)
{

    val program = LambdaProgram()

    val myLambda: (Int,Int) -> Int = { x:Int , y:Int -> x+y}
    program.addTwoNumbers(2,6,myLambda)
    program.add2Numbers(3,11,{ x, y -> x + y}) //Simplified the lambda function
    program.add2diffLambdaNumbers(4,6) { x, y -> x + y}
}

class LambdaProgram {
    fun addTwoNumbers(a: Int, b: Int, action: (Int, Int) -> Int) {
        val result = action(a, b)
        println(result)
    }

    fun add2Numbers(a: Int, b: Int, action: (Int, Int) -> Int)
    {
        val result = action(a,b)
        println(result)
    }
    fun add2diffLambdaNumbers(a:Int, b:Int, action: (Int, Int) -> Int)
    {
        val result = action(a,b)
        println(result)
    }

}