package LamdaFunction

fun main() {
    //val lambdaName: (Input type) -> Return Type = { arguments: Input Type -> Body }

    //greeter("Thien")
    val greeter: (name: String,lastName: String) -> Unit = { name: String, lastName: String ->
        val a = lastName.lowercase()
        val b = name.uppercase()
        println("Hello $a $b")
    }
    greeter("Thien", "Nguyen")


}