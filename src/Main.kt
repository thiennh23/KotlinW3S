fun main() {

    //Use "open" keyword to mark this class can be inherited
    //Parent/SuperClass
    open class MyParentClass() {
        val x = 5
    }

    //Use a "colon" sign to mark this class is subclass, inherited from another class
    //Child/SubClass
    class MyChildClass : MyParentClass() {
        fun ChildFunc() {
            println(x)
        }
    }

    val myObj = MyChildClass()
    myObj.ChildFunc()

    println('a')



   /* var a = cars() //create "a" object of "cars" class
    //Access "cars" properties and add values to it
    a.brand = "BMW"
    a.model = "X6 (E71)"
    a.year = 2008

    var c1 = cars()
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    println(a.brand)
    println(a.model)
    println(a.year)
    println(c1.brand)
    println(c1.model)
    println(c1.year)*/

    //Constructor
//    class car(var brand:String, var model:String, var year:Int)
    /*class car(var brand:String, var model:String, var year:Int){

        fun drive() {
            println("Wroooom!")
        }

        fun speed(sp: Int) {
            println("Speed: $sp km/h")
        }

        fun printOut() {
            println(brand)
            println(model)
            println(year)
        }
    }


    val c1 = car("Ford", "Mustang", 1969)
    val c2 = car("BMW", "X5", 1999)
    val c3 = car("Tesla", "Model S", 2020)

    c1.printOut()
    c1.speed(200)
    c1.drive()

    c2.printOut()
    c2.drive()

    c3.printOut()
    c3.drive()*/

    /*println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c2.brand)
    println(c2.model)
    println(c2.year)*/



    //intro()
    //string()
    //condition()
    //condition2()
    //whenCondition()
    //whenCondition2()
    //loops()
    //loop2()
    //breakStatement()
    //continueStatement()
    //arrayKotlin()
}

fun arrayKotlin() {
    //To create a Array, we use keyword: arrayOf()
    var cars = arrayOf("Volvo", "BMW", "Ford", "Toyota", "Mazda")
    println(cars.size)
    println(cars[0])
    cars[0] = "Honda"
    println(cars[0])
    println(cars[0].length)

    //Check if an element inside array
    if ("BMW" in cars)
        println("BMW inside cars array")
    else println("BMW is not inside cars array")

    //Loop through array
    for (i in cars)
        println(i)
    //i: the value of cars[0], cars[1], ....
    //i: not the count value like: 0, 1, 2, 3
}

//The continue statement breaks one iteration (in the loop)
// If a specified condition occurs, and continues with the next iteration in the loop.
fun continueStatement() {
    var i = 0
    while (i < 10) {

        //Skip if i is odd
        if (i % 2 != 0) {
            i++
           continue
       }

        //The main process of while loop
        println(i)
        i++

    }
}

fun breakStatement() {

    var i: Int = 1
    while (i <= 100) {
        println(i)
        i++
        if (i % 3 == 0) break
    }

}

fun loop2() {
    var i = 0
    do {
        println(i)
        i++
    }
        while (i < 5)
}

fun loops(){
    var i: Int = 0
    while (i < 5){
        println(i)
        i++
    }
}

fun whenCondition2() {
    val x = 4
    var y: String = when(x){
        1 -> "1"
        2 -> "2"
        3 -> "3"
        else -> "not 1 2 3"
    }
    println(y)
}

fun whenCondition(){
    val x = 4
    //When condition similar to Switch-Case

    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        3 -> println("x == 3")
        else ->{
            println("x is neither 1 nor 2")
            println("x is neither 1 nor 3")
            println("x is neither 2 nor 3")
        }
    }
}

fun condition2(){
    var a = 18;
    val b = if (a < 20){
        "Good Morning"
    } else {
        "Good Afternoon"
    }
    println(b)
}

fun condition() {
    //Example 1
    var a = 18
    var b = 30
    if (a > b)
        println("$a greater than $b")
    else if (a < b)
        println("$a is less than $b")
    else println("$a and $b, They are equal")

    //Example 2
    val time = 22
    if (time < 10) {
        println("Good morning.")
    } else if (time < 20) {
        println("Good day.")
    } else {
        println("Good evening.")
    }
// Outputs "Good evening."
}

fun intro() {
    println("Hello World!") //cmt

    //This is a 1-line comment
    println(3+5)

    /*This
    is
    a
    multiple
    line
    of
    comment*/

    var name = "John" //Use var if the value of it can change
    val birthYear = 2003 //Use val if the val is constant
    println("This is $name and I was born in  $birthYear")

    val a: Int = 5
    val b: Double = 6.5
    var c = a + b
    println("$a + $b = $c")
    println("Data type of a is: " + a::class.java)
    println("Data type of b is: " + b::class.java)
    println("Data type of c is: ${c::class.java}")

    val myNum: Float = 5.75F
    println(myNum)

    val myNum1: Float = 12E4F
    val myNum2: Double = 12E4
    println(myNum1)
    println(myNum2)

    val myGrade: Char = 'A'
    println(myGrade)

    var first = 10
    var second = 3
    println("$first % $second = ${first % second}")
    println()
}

fun string() {

    //String
    var txt = "Hello world!"
    var txt2 = "Hello"
    var txt3 = txt
    println(txt)
    println(txt[0])
    println(txt.length)

    println(txt.uppercase())
    println(txt.lowercase())

    //COMPARE STRINGS
    println(txt.compareTo(txt2)) //count how many letters that different, >0 means that they are not the same
    println(txt.compareTo(txt3)) //equal 0 means that they are the same string
    if (txt == txt2)
        println("The same")
    else println("Different")

    if (txt == txt3)
        println("The same")
    else println("Different")

    //FIND A STRING IN A STRING
    println(txt.indexOf("world"))

    //Quote inside a string
    var txt11 = "It's alright"
    var txt22 = "Thats \"great\""
    var txt33 = "Oke 'Fine'"
    println(txt11)
    println(txt22)
    println(txt33)
}