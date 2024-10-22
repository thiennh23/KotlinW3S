/*
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

    var device1: SmartDevice = SmartTvDevice("Android TV", "Entertainment")
    device1.turnOn()
    device1.turnOff()

    var device2: SmartDevice = SmartLightDevice("UV Light", "Utilities")
    device2.turnOn()
    device2.turnOff()
}

// The SmartHome class HAS-A smart TV device.
class SmartHome(
    val smartTV: SmartTvDevice,
    val smartLight: SmartLightDevice
    ) {

    fun turnOn() {
        smartTV.turnOn()
    }

    fun turnOff() {
        smartTV.turnOff()
    }

    fun increaseVolume() {
        smartTV.increaseSpeakerVolume()
    }

    fun increaseSpeakerVolume() {
        smartLight.increaseBrightness()
    }
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

    open fun turnOn() {
        println("Device is On")
    }

    open fun turnOff() {
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

    //Overried
    override fun turnOn() {
        status = "On"
        println(
            "$name is turned on. Speaker volume is set to $volume and channel number is " +
                    "set to $channelNumber."
        )
    }

    override fun turnOff() {
        status = "Off"
        println("$name turned off")
    }
}

class SmartLightDevice(deviceName: String, deviceCategory: String): SmartDevice(name = deviceName, category = deviceCategory) {

    var brightnessLevel = 0
        set(value) {
            if (value in 0..100)
                field = value
        }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness level increased to $brightnessLevel")
    }

    override fun turnOn() {
        status = "On"
        brightnessLevel = 2
        println("$name is turn on. The brightness is: $brightnessLevel")
    }

    override fun turnOff() {
        status = "Off"
        brightnessLevel = 0
        println("$name is turn Off. The brightness is: $brightnessLevel")
    }
}*/
