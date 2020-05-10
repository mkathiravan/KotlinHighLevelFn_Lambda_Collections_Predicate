package Collections

fun main(args:Array<String>)
{
    var mySet = setOf<Int>(2,46,7,4,2,8,43,46,79,4) //Immutable, Read Only

    var mutableSet = mutableSetOf<Int>(2,46,7,4,2,8,43,46,79,4)

    mutableSet.remove(46)
    mutableSet.add(1)

    for(element in mySet)
    {
        println(element)
    }

    for(element in mutableSet)
    {
        println(element)
    }
}