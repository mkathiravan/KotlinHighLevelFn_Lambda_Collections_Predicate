package Collections

fun main(args:Array<String>)
{
    var list = listOf<String>("Beckham","Rooney","Torres")  //Immutable, Fixed Size, Read only

    var mutablelist = mutableListOf<String>("Kaka","Ronaldo","Messi") //Mutable, Dynamic size, Read-Write Operations
    //var mutablelist = arrayListOf<String>("Kaka","Ronaldo","Messi")
   // var mutablelist =  ArrayList<String>()
    //mutablelist.add("Kaka")
    mutablelist.add("Gerrard")




    for(element in list)
    {
        println(element)
    }

    for(element in mutablelist)
    {
        println(element)
    }

}