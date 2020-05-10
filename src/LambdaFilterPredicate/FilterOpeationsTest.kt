package LambdaFilterPredicate

fun main(args:Array<String>)
{
   var person = listOf<Person>(Person(31,"Kathir"),(Person(33,"Gopal")),(Person(32,"Karthik")))

    var name = person.filter { it.name.startsWith("K") }.map { it.name }

    for(names in name)
    {
        println(names)
    }

}

class Person(var age:Int, var name : String)