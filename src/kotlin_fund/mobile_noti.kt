package kotlin_fund

fun main() {
    val morningNoti = 51
    val eveningNoti = 135

    printNotificationSumary(morningNoti)
    printNotificationSumary(eveningNoti)
}

fun printNotificationSumary(numberOfMessage: Int) {
    if (numberOfMessage >= 100)
        println("Your phone is blowing up! You have 99+ notifications.")
    else println("You have $numberOfMessage notifications.")
}