package Collections

fun main(args:Array<String>)
{
    var myArray = Array<Int> (5) {0}
    myArray[0] = 54
    myArray[3] = 21
    myArray[4] = 38

    for(element in myArray)
    {
        println(element)
    }
}