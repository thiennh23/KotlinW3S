package kotlin_fund

fun main() {
    val newFoldablePhone = FoldablePhone()

    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
    newFoldablePhone.unFold()
    newFoldablePhone.switchOn()
    newFoldablePhone.checkPhoneScreenLight()
}


open class Phone(var isScreenLightOn: Boolean = false){
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(var isFold: Boolean = true): Phone(isFold) {
    override fun switchOn() {
        if (isFold)
            isScreenLightOn = false
        else isScreenLightOn = true
    }

    fun Fold() {
        isFold = true
    }

    fun unFold() {
        isFold = false
    }
}