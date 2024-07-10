//fun main() {
//    var tv = smartDevice("AppleTV", "Entertainment", 0, 19)
//    tv.turnOn()
//    println("Device name is: ${tv.name}")
//    println("Device category is: ${tv.category}")
//    println("Device status is: ${tv.deviceStatus}")
//    println("Device volume is: ${tv.speakerVolume}")
//    tv.turnOff()
//}
//
//class smartDevice {
//
//    constructor(Name: String, Category: String, StatusCode: Int, volume: Int) {
//        name = Name
//        category = Category
//        deviceStatus = when(StatusCode) {
//            1 -> "Online"
//            0 -> "Offline"
//            else -> {"Unkown"}
//        }
//        speakerVolume = volume
//    }
//
//    var name = "Android TV"
//    var category = "Entertainment"
//    var deviceStatus = "Online"
//
//    var speakerVolume = 2
//        get() = field
//        set(value) {
//            if (value in 0..100) {
//                field = value
//            }
//        }
//
//    fun turnOff() { println("The device is off")}
//    fun turnOn() { println("The device is on")}
//}
//
