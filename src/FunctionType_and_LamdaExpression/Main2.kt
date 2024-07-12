package FunctionType_and_LamdaExpression

fun main() {
    val TrickFunction = TrickOrTreat(true)
    val TreatFunction = TrickOrTreat(false)

    TrickFunction()
    TreatFunction()
}

fun TrickOrTreat(isTrick: Boolean) : () -> Unit {
    if (isTrick) {
        return trick2
    } else {
        return treat2
    }
}

val trick2 = {
    println("No Treat")
}

val treat2 = {
    println("Treat")
}