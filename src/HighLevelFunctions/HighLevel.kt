package HighLevelFunctions

fun main(args: Array<String>)
{
   val program = Program();
    program.addTwoNumbers(5,6)

    program.addTwoNumbers(2,7, object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }

    })

    val myLambda : (Int) -> Unit = {s: Int -> println(s)}
    program.addTwoNumbers(5,7,myLambda)

}

class Program
{

    fun addTwoNumbers(a:Int,b:Int,action: (Int) -> Unit) // Using high-level function with lambda as a parameter
    {
        val sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a:Int, b:Int, action: MyInterface)  //Using Interface to access the method
    {
        val sum = a+b;
        action.execute(sum)
    }



    fun addTwoNumbers(a:Int, b:Int)     //Simple way to access the method
    {
        val sum = a+b;
        println(sum)
    }
}

interface MyInterface
{
    fun execute(sum:Int)
}