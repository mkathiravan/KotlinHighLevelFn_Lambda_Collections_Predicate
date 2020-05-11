package Inheritance

fun main(args: Array<String>)
{
    val p1 = Person("Steve",2000,2)
    p1.tostring()

    println()

    val s1 = Student("Rogers",2005,10,8190,19)
    s1.tostring()
}

open class Person(name: String,year: Int)
{
    var name: String = ""
    var year: Int = 1995
    var month: Int = 1
    init {
        this.name=name
        this.year=year
        println("Person Init")
    }

    constructor(name: String, year: Int, month: Int) : this(name, year)
    {
        println("Secondary Constructor Person")
        this.month=month
    }

    open fun tostring()
    {
        println("The name is ${this.name} and year is ${this.year}")
    }

}

class Student(name: String, year: Int, month: Int, var id: Int) : Person(name, year, month)
{
    init {
        println("Student Init")
    }

    constructor(name: String, year: Int, month: Int, id: Int, age: Int) : this(name, year, month, id)
    {
        println("Secondary Constructor Student")
    }

    override fun tostring() {
        super.tostring()
        println("The Id is ${id}")
    }
}