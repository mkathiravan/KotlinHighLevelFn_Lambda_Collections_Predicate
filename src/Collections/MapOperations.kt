package Collections

fun main(args:Array<String>)
{

    var myMap = mapOf<Int, String>(7 to "Ronaldo", 10 to "Messi", 8 to "Gerrard") //Immutable, Fixed Size, Read Only

    var mutableMap = HashMap<Int,String>()  //Mutable, Dynamic Size, Read-Write Operations
//    var mutableMap = mutableMapOf<Int,String>()
//    var mutableMap = hashMapOf<Int,String>()
    mutableMap.put(9,"Rooney")
    mutableMap.put(5,"Ballack")
    mutableMap.put(11,"Salas")

    for(key in myMap.keys)
    {
        println(myMap[key]) // We can also use myMap.get(key)
    }

    for(key in mutableMap.keys)
    {
        println(mutableMap[key])
    }
}