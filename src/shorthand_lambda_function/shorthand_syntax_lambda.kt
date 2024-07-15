package shorthand_lambda_function


fun main() {

    val coin: (Int) -> String = {
        "$it quarters"
    }

    val cupcake: (Int) -> String = {
        "Have a cupcake!"
    }

    var treatFunction = trickOrTreat(false, coin)
    var trickFunction = trickOrTreat(true, cupcake)
    treatFunction()
    trickFunction()

    treatFunction = trickOrTreat(false, { "$it quarters" })
    trickFunction = trickOrTreat(true, null)
    treatFunction()
    trickFunction()

    //Trailing lambda syntax
    treatFunction = trickOrTreat(false) { "$it quarters" }
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick)
        return trick
    else {
        if (extraTreat != null) {
            println(extraTreat(20))
        } else println(null)
        return treat
    }
}

val trick = { repeat(5) {println("No treat!")} }
val treat = { println("Treat") }