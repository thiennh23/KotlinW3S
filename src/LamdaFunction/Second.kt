package LamdaFunction

fun main() {
    example1()
}

fun example1() {
    var list = (1..20).toList()
    print(list)
    println()

    list = list.filter { it % 2 == 0}
    print(list)
}