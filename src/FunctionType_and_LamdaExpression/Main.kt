package FunctionType_and_LamdaExpression

fun main() {
    val trickFunction = trick
    trick()
    trickFunction()

    treat()

    treat1
}

val trick = {
    println("No treat")
}

val treat = {
    println("Treat")
}

val treat1: () -> Unit = {
    println("Treat")
}
