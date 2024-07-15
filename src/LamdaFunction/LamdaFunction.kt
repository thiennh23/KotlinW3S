package LamdaFunction

data class cats(val name: String, val age: Int)

fun main() {

    val catList = listOf(
        cats("Orange", 12),
        cats("TOm", 2),
        cats("Patrick", 14),
        cats("Mario", 5)
    )

    val oldestCat = catList.maxBy { it.age /*cats -> cats.age*/ }
    println(oldestCat.name)


    //Lambda function is also known as Anonymous function
    //Which means, you can assign a function to a variable
    //And call it, without create a real/full function

    //Example 1
    val greeting = { println("Hello world!")}
    greeting()

    //Example 2
    val sum = {a: Int, b: Int -> a+b}
    println(sum(5,6) )

}