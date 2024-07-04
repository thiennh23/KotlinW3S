fun main() {
    //intro()
    //string()
    condition()
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