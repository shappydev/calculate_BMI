fun main() {
    // Take weight in kilograms and height in meters as input
    print("Enter your weight in kilograms: ")
    val weight = readLine()?.toDoubleOrNull()
    print("Enter your height in meters: ")
    val height = readLine()?.toDoubleOrNull()

    if(weight != null && height != null && weight > 0 && height > 0) {
         // Calculate BMI
        val bmi = weight/(height * height)
        // Display the result
        println("Your BMI is: $bmi")
    } else {
        println("Invalid input. Please enter valid positive numbers for weight and height.")
    }
}