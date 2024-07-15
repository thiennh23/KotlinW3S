package LamdaFunction

fun main() {

    val coins: (Int) -> String = { quantity ->
        "$quantity quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    val treatFunction = trickOrTreat(false, coins)
    val trickFunction = trickOrTreat(true, cupcake)
    treatFunction()
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick)
        return trick
    else {
        if (extraTreat != null) {
            println(extraTreat(5))
        } else println(null)
        return treat
    }
}

val trick = { println("No treat!")}
val treat = { println("Treat") }