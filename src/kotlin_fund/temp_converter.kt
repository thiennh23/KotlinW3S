package kotlin_fund

fun main() {
    // Fill in the code.

    fun FtoK(first: Double): Double {
        return 5/9*(first - 32) + 273.15
    }

    fun KtoC(first: Double): Double {
        return first - 273.15
    }

    fun CtoF(first: Double): (Double) -> Double = {
        (9/5)*it + 32;
    }


    printFinalTemperature(27.0, "Celsius", "Fahrenheit", {(9/5)*it + 32;})

    /*27.0 degrees Celsius is 80.60 degrees Fahrenheit.
    350.0 degrees Kelvin is 76.85 degrees Celsius.
    10.0 degrees Fahrenheit is 260.93 degrees Kelvin.*/

}


fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}