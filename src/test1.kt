//fun main() {
//
//}
//
//class smartTV(deviceName: String, deviceCategory: String, StatusCode: Int) :
//    smarttv(name = deviceName, category = deviceCategory) {
//
//    var speakerVolume = 2
//        set(value) {
//            if (value in 0..100) {
//                field = value
//            }
//        }
//
//    var channelNumber = 1
//        set(value) {
//            if (value in 0..200) {
//                field = value
//            }
//        }
//}
//
//open class smarttv(name: String, category: String) {
//    var deviceStatus = "online"
//
//    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
//        deviceStatus = when (statusCode) {
//            0 -> "offline"
//            1 -> "online"
//            else -> "unknown"
//        }
//    }
//}
