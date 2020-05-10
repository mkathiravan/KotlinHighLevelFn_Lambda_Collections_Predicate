package HighLevelFunctions

fun main(args:Array<String>)
{

    var person = Person()

    with(person)
    {
        name = "Kathiravan"
        age = 31
    }

        //The apply function retruns the receiver here receivers is the person
    person.apply {
        name = "Dinesh"
        age = 31
    }.startRun()

    println(person.name)
    println(person.age)
}

class Person
{
    var name: String = ""
    var age : Int = -1

    fun startRun()
    {
        println("Function Started")
    }
}