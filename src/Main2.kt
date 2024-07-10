fun main() {
    var tv = SmartDevice("Android TV", "Entertainment", 1)
    tv.turnOn()
    println("The device's name is ${tv.status}")

    var light = SmartLightDevice("UV Light", "Utilities")
    var televison = SmartTvDevice("Apple TV Box", "Entertainment")

    println("The brightness is ${light.brightnessLevel}")
    light.increaseBrightness()

    println("The volume of tv is ${televison.volume}")
    televison.increaseSpeakerVolume()
    televison.increaseSpeakerVolume()
    televison.increaseSpeakerVolume()



}

open class SmartDevice(val name: String, val category: String) {


    constructor(name: String, category: String, statusCode: Int): this(name, category) {
        when (statusCode) {
            1 -> status = "Online"
            0 -> status = "Offline"
            else -> status = "Unknown"
        }
    }

    var status = "Unknown"

    fun turnOn() {
        println("Device is On")
    }

    fun turnOff() {
        println("Device is Off")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String) : SmartDevice(name = deviceName, category = deviceCategory) {
    var volume = 2
        set(value) {
            if (value in 1..100)
                field = value
        }

    var channelNumber = 1
        set(value) {
            if (value in 0..200)
                field = value
        }

    fun increaseSpeakerVolume() {
        volume++
        println("Speaker volume increased to $volume")
    }

    fun nextChannelNumber() {
        channelNumber++
        println("Channel number increased to $channelNumber")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String): SmartDevice(name = deviceName, category = deviceCategory) {

    var brightnessLevel = 0
        get() = field
        set(value) {
            if (value in 0..100)
                field = value
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness level increased to $brightnessLevel")
    }
}