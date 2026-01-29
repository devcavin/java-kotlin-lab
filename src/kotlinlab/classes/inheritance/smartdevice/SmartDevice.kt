package kotlinlab.classes.inheritance.smartdevice

open class SmartDevice(
    val deviceName: String,
    val deviceType: String
) {
    private var isOn: Boolean = false

    open fun turnOn() {
        isOn = true
        println("$deviceName turn on")
    }

    open fun turnOff() {
        isOn = false
        println("$deviceName turn off")
    }

    open fun getStatus(isOn: Boolean): String {
        return if (isOn) "$deviceName is off" else "$deviceName is on"
    }
}