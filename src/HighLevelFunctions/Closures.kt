package HighLevelFunctions

fun main(args:Array<String>)
{
 val program = ClosureProgram()
    var result = 0

    program.addTwoNumbers(2,7) { x , y -> result = x+y}
    println(result)

}

class ClosureProgram
{

    fun addTwoNumbers(a:Int, b:Int, action: (Int,Int)-> Unit)
    {
        action(a,b)
    }
}