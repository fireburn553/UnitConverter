data class ConversionHistory( // This data class ConversionHistory help us to store the history of
        // the conversion
        val fromUnit: String,
        val toUnit: String,
        val inputValue: Double,
        val outputValue: Double
)

data class UnitInfo( // This data class UnitInfo help us to store the unit information
val unitName: String, val shortName: String, val conversionFactorToBase: Double)

val conversionHistory =
        mutableListOf<
                ConversionHistory>() // This mutable list conversionHistory help us to store the
// history of the conversion

val conversionTableLength = // This map conversionTableLength help us to store the conversion table
// for the length
mapOf(
                1 to UnitInfo("centimeter", "cm", 0.01),
                2 to UnitInfo("meter", "m", 1.0),
                3 to UnitInfo("kilometer", "km", 1000.0),
                4 to UnitInfo("inch", "in", 0.0254),
                5 to UnitInfo("foot", "ft", 0.3048),
                6 to UnitInfo("yard", "yd", 0.9144),
                7 to UnitInfo("mile", "mi", 1609.34),
                8 to UnitInfo("millimeter", "mm", 0.001),
                9 to UnitInfo("micrometer", "µm", 1e-6),
                10 to UnitInfo("nanometer", "nm", 1e-9),
                11 to UnitInfo("light year", "ly", 9.461e15)
        )

val conversionTableTemperature = // This map conversionTableTemperature help us to store the
// conversion table for the temperature
mapOf(
                1 to UnitInfo("Celsius", "C", 1.0),
                2 to UnitInfo("Fahrenheit", "F", 1.0),
                3 to UnitInfo("Kelvin", "K", 1.0)
        )

val conversionTableArea = // This map conversionTableArea help us to store the conversion table for
// the area
mapOf(
                1 to UnitInfo("square meter", "m²", 1.0),
                2 to UnitInfo("square kilometer", "km²", 1_000_000.0),
                3 to UnitInfo("square centimeter", "cm²", 0.0001),
                4 to UnitInfo("square millimeter", "mm²", 0.000001),
                5 to UnitInfo("hectare", "ha", 10_000.0),
                6 to UnitInfo("acre", "ac", 4046.86),
                7 to UnitInfo("square foot", "ft²", 0.092903),
                8 to UnitInfo("square inch", "in²", 0.00064516),
                9 to UnitInfo("square yard", "yd²", 0.836127)
        )

val conversionTableVolume = // This map conversionTableVolume help us to store the conversion table
// for the volume
mapOf(
                1 to UnitInfo("liter", "L", 1.0),
                2 to UnitInfo("milliliter", "mL", 0.001),
                3 to UnitInfo("cubic meter", "m³", 1000.0),
                4 to UnitInfo("cubic centimeter", "cm³", 0.001),
                5 to UnitInfo("cubic inch", "in³", 0.0163871),
                6 to UnitInfo("cubic foot", "ft³", 28.3168),
                7 to UnitInfo("gallon", "gal", 3.78541),
                8 to UnitInfo("pint", "pt", 0.473176)
        )

val conversionTableWeight = // This map conversionTableWeight help us to store the conversion table
// for the weight
mapOf(
                1 to UnitInfo("gram", "g", 1.0),
                2 to UnitInfo("kilogram", "kg", 1000.0),
                3 to UnitInfo("metric ton", "t", 1000000.0),
                4 to UnitInfo("milligram", "mg", 0.001),
                5 to UnitInfo("microgram", "µg", 1e-6),
                6 to UnitInfo("pound", "lb", 453.592),
                7 to UnitInfo("ounce", "oz", 28.3495),
                8 to UnitInfo("stone", "st", 6350.29)
        )

class Menu { // This class Menu help us to show the different menu options
    fun showLengthMenu() { // This function showLenghtMenu help us to show the different length
        // conversion

        val convertMenu =
                """
        [1] centimeter
        [2] meter
        [3] kilometers
        [4] inches
        [5] feet
        [6] yards
        [7] miles
        [8] millimeters
        [9] micrometers
        [10] nanometers
        [11] light years
        [12] Back to the main menu
        """.trimIndent() // the trimIndent removes the common minimal indent of all the input lines from first and last lines
        println(convertMenu) // it's printing the menu
    }

    fun showWeightMenu() { // This function showWeightMenu help us to show the different weight
        // conversion

        println(
                """
        [1] Gram (g)
        [2] Kilogram (kg)
        [3] Metric Ton (t)
        [4] Milligram (mg)
        [5] Microgram (µg)
        [6] Pound (lb)
        [7] Ounce (oz)
        [8] Stone (st)
        [9] Back to the main menu
        """.trimIndent()
        )
    }

    fun showAreaMenu() { // This function showAreaMenu help us to show the different area
        // conversion
        println(
                """
        [1] Square Meter (m²)
        [2] Square Kilometer (km²)
        [3] Square Centimeter (cm²)
        [4] Square Millimeter (mm²)
        [5] Hectare (ha)
        [6] Acre (ac)
        [7] Square Foot (ft²)
        [8] Square Inch (in²)
        [9] Square Yard (yd²)
        [10] Back to the main menu
        """.trimIndent()
        )
    }

    fun showVolumeMenu() { // This function showVolumeMenu help us to show the different volume
        // conversion
        println(
                """
        [1] Liter (L)
        [2] Milliliter (mL)
        [3] Cubic Meter (m³)
        [4] Cubic Centimeter (cm³)
        [5] Cubic Inch (in³)
        [6] Cubic Foot (ft³)
        [7] Gallon (gal)
        [8] Pint (pt)
        [9] Back to the main menu
        """.trimIndent()
        )
    }

    fun showConvertMenu() { // This function showConvertMenu help us to show the different
        // conversion
        // menu
        println(
                """
        [1] Length
        [2] Temperature
        [3] Area
        [4] Volume
        [5] Weight
        [6] Back to the main menu
        """.trimIndent()
        ) // the trimIndent removes the common minimal indent of all the input lines from first and
        // last lines"""
    }
}

class ConversionHistoryManager { // This class Conversion History Manager help us to show the
    // history of the conversion and clear the history

    fun clearHistory() { // This function clearHistory help us to clear the history of the
        // conversion
        if (conversionHistory.isEmpty()) { // checking if the mutable list is empty
            println("No conversion history to clear.")
        } else {
            conversionHistory.clear() // Clear all stored conversions
            println("Conversion history has been cleared.")
        }
    }

    fun storeChoice(
            fromChoice: Int,
            toChoice: Int,
            inputValue: Double,
            outputValue: Double,
            conversionTable: Map<Int, UnitInfo>
    ) { // This function storeChoice help us to store the conversion history
        val fromUnit =
                conversionTable[fromChoice]?.unitName
                        ?: "Unknown" // Get the unit name from the conversion table
        val toUnit =
                conversionTable[toChoice]?.unitName
                        ?: "Unknown" // Get the unit name from the conversion table

        val history =
                ConversionHistory(
                        fromUnit,
                        toUnit,
                        inputValue,
                        outputValue
                ) // Create a new history object
        conversionHistory.add(history) // Save to the list

        println(
                "Conversion Stored: From: ${history.inputValue} $fromUnit To: ${history.outputValue} $toUnit"
        ) // Print the stored conversion
    }

    fun viewHistory() { // This function viewHistory help us to view the history of the conversion
        if (conversionHistory.isEmpty()) { // Check if the history is empty
            println("No conversion history available.")
            return
        }

        println("Conversion History:") // Print the history
        conversionHistory.forEachIndexed { index, record -> // use iteration over the history list
            println(
                    "${index + 1}. From: ${record.inputValue} ${record.fromUnit} To: ${record.outputValue} ${record.toUnit}"
            ) // Print each record
        }

        // Ask the user if they want to clear the history
        println("\nDo you want to clear the history? (yes/no)")
        val input =
                readLine()?.trim()?.lowercase() // Read user input, trim and convert to lowercase
        if (input == "yes") { // Check if the user wants to clear the history
            clearHistory() // Call the clearHistory function
        }
    }
}

fun convertOptionLength() { // This function convertOptionLength help us to convert the length
    clearScreen()
    separator()
    var isInConvertMenu = true
    val menu = Menu() // Create an instance of the Menu class
    val chm = ConversionHistoryManager() // Create an instance of the ConversionHistoryManager class

    while (isInConvertMenu) { // Use While loop so that when the user is picking the choice will not
        // going back to the menu unless the user choose to go back
        menu.showLengthMenu() // Call the showLengthMenu function
        println("Choose the number for the unit to convert from:") // Print the message

        val choiceFrom = readValidChoice(1..12) // used helper function to validate user input
        if (choiceFrom == 12) { // If the user choose 12, it will go back to the main menu
            println("Back to the main menu") // Print the message
            isInConvertMenu =
                    false // Set the isInConvertMenu to false so that it will go back to the main
            // menu
            continue // Continue to the next iteration
        }

        menu.showLengthMenu() // Call the showLengthMenu function
        println("Choose the number for the unit to convert to:") // Print the message
        val choiceTo = readValidChoice(1..11) // used helper function to validate user input

        println("Enter the value to convert:") // Print the message
        val inputValue = readValidDouble() // used helper function to validate user input

        val fromFactor =
                conversionTableLength[choiceFrom]
                        ?.conversionFactorToBase // Get the conversion factor from the table
        val toFactor =
                conversionTableLength[choiceTo]
                        ?.conversionFactorToBase // Get the conversion factor from the table

        if (fromFactor != null && toFactor != null
        ) { // Check if the conversion factors are not null
            val outputValue = (inputValue * fromFactor) / toFactor // Convert to target unit
            println(
                    "Converted Value: $outputValue ${conversionTableLength[choiceTo]?.unitName}"
            ) // Print the converted value

            chm.storeChoice(
                    choiceFrom,
                    choiceTo,
                    inputValue,
                    outputValue,
                    conversionTableLength
            ) // Store the conversion
            isInConvertMenu =
                    false // Set the isInConvertMenu to false so that it will go back to the main
            // menu
        } else {
            println("Invalid conversion choices.") // Print the message
        }
    }
}

fun convertOptionVolume() { // This function convertOptionVolume help us to convert the volume
    clearScreen()
    separator()
    var isInConvertMenu = true // declare isInConvertMenu for the loop
    val chm = ConversionHistoryManager() // Create an instance of the ConversionHistoryManager class
    val menu = Menu() // Create an instance of the Menu class
    while (isInConvertMenu) { // Use While loop so that when the user is picking the choice will not
        // going back to the menu unless the user choose to go back
        menu.showVolumeMenu() // Call the showVolumeMenu function
        println("Choose the number for the unit to convert from:") // Print the message
        val choiceFrom = readValidChoice(1..9) // used helper function to validate user input
        if (choiceFrom == 9) { // If the user choose 9, it will go back to the main menu
            println("Back to the main menu") // Print the message
            isInConvertMenu =
                    false // Set the isInConvertMenu to false so that it will go back to the main
            // menu
            continue
        }

        menu.showVolumeMenu() // Call the showVolumeMenu function
        println("Choose the number for the unit to convert to:") // Print the message
        val choiceTo = readValidChoice(1..8) // used helper function to validate user input

        println("Enter the value to convert:") // Print the message
        val inputValue = readValidDouble() // used helper function to validate user input

        val fromFactor =
                conversionTableVolume[choiceFrom]
                        ?.conversionFactorToBase // Get the conversion factor from the table
        val toFactor =
                conversionTableVolume[choiceTo]
                        ?.conversionFactorToBase // Get the conversion factor from the table

        if (fromFactor != null && toFactor != null
        ) { // Check if the conversion factors are not null
            val outputValue = (inputValue * fromFactor) / toFactor // Convert to target unit
            println(
                    "Converted Value: $outputValue ${conversionTableVolume[choiceTo]?.unitName}"
            ) // Print the converted value

            chm.storeChoice(
                    choiceFrom,
                    choiceTo,
                    inputValue,
                    outputValue,
                    conversionTableVolume
            ) // Store the conversion
            isInConvertMenu = false
        } else {
            println("Invalid conversion choices.")
        }
    }
}

fun convertOptionArea() { // This function convertOptionArea help us to convert the area
    clearScreen()
    separator()
    var isInConvertMenu = true
    val chm = ConversionHistoryManager() // Create an instance of the ConversionHistoryManager class
    val menu = Menu() // Create an instance of the Menu class
    while (isInConvertMenu) { // Use While loop so that when the user is picking the choice will not
        // going back to the menu unless the user choose to go back
        menu.showAreaMenu()
        println("Choose the number for the unit to convert from:")

        val choiceFrom = readValidChoice(1..10) // used helper function to validate user input
        if (choiceFrom == 10) {
            println("Back to the main menu")
            isInConvertMenu = false
            continue
        }

        menu.showAreaMenu()
        println("Choose the number for the unit to convert to:")
        val choiceTo = readValidChoice(1..9)

        println("Enter the value to convert:")
        val inputValue = readValidDouble()

        val fromFactor = conversionTableArea[choiceFrom]?.conversionFactorToBase
        val toFactor = conversionTableArea[choiceTo]?.conversionFactorToBase

        if (fromFactor != null && toFactor != null) {
            val outputValue = (inputValue * fromFactor) / toFactor // Convert to target unit
            println(
                    "Converted Value: $outputValue ${conversionTableArea[choiceTo]?.unitName}"
            ) // Print the converted value

            chm.storeChoice(choiceFrom, choiceTo, inputValue, outputValue, conversionTableArea)
            isInConvertMenu = false
        } else {
            println("Invalid conversion choices.")
        }
    }
}

fun convertOptionTemperature() { // This function convertOptionTemperature help us to convert the
    // temperature
    clearScreen()
    separator()
    val chm = ConversionHistoryManager() // Create an instance of the ConversionHistoryManager class
    println("Choose the number for the unit to convert from:") // Print the message
    println("[1] Celsius\n[2] Fahrenheit\n[3] Kelvin") // Print the option
    val choiceFrom = readValidChoice(1..3) // used helper function to validate user input

    println("Choose the number for the unit to convert to:") // Print the message
    val choiceTo = readValidChoice(1..3) // used helper function to validate user input

    println("Enter the value to convert:")
    val inputValue = readValidDouble() // used helper function to validate user input

    val outputValue =
            when (choiceFrom to choiceTo) { // Use when to check the choice
                1 to 2 -> (inputValue * 9 / 5) + 32 // Celsius to Fahrenheit
                1 to 3 -> inputValue + 273.15 // Celsius to Kelvin
                2 to 1 -> (inputValue - 32) * 5 / 9 // Fahrenheit to Celsius
                2 to 3 -> (inputValue - 32) * 5 / 9 + 273.15 // Fahrenheit to Kelvin
                3 to 1 -> inputValue - 273.15 // Kelvin to Celsius
                3 to 2 -> (inputValue - 273.15) * 9 / 5 + 32 // Kelvin to Fahrenheit
                else -> inputValue // Same unit conversion
            }

    println(
            "Converted Value: $outputValue ${conversionTableTemperature[choiceTo]?.unitName}"
    ) // Print the converted value
    chm.storeChoice(
            choiceFrom,
            choiceTo,
            inputValue,
            outputValue,
            conversionTableTemperature
    ) // Store the conversion
}

fun convertOptionWeight() { // This function convertOptionWeight help us to convert the weight
    // Same conversion process just like the other convertOption functions
    clearScreen()
    separator()
    var isInConvertMenu = true
    val chm = ConversionHistoryManager() // Create an instance of the ConversionHistoryManager class
    val menu = Menu() // Create an instance of the Menu class
    while (isInConvertMenu) {
        menu.showWeightMenu()
        println("Choose the number for the unit to convert from:")
        val choiceFrom = readValidChoice(1..9)
        if (choiceFrom == 9) {
            println("Back to the main menu")
            isInConvertMenu = false
            continue
        }

        menu.showWeightMenu()
        println("Choose the number for the unit to convert to:")
        val choiceTo = readValidChoice(1..8)

        println("Enter the value to convert:")
        val inputValue = readValidDouble()

        val fromFactor = conversionTableWeight[choiceFrom]?.conversionFactorToBase
        val toFactor = conversionTableWeight[choiceTo]?.conversionFactorToBase

        if (fromFactor != null && toFactor != null) {
            val outputValue = (inputValue * fromFactor) / toFactor
            println("Converted Value: $outputValue ${conversionTableWeight[choiceTo]?.unitName}")

            chm.storeChoice(choiceFrom, choiceTo, inputValue, outputValue, conversionTableWeight)
            isInConvertMenu = false
        } else {
            println("Invalid conversion choices.")
        }
    }
}

// Helper function to read and validate an integer choice within a range
fun readValidChoice(
        validRange: IntRange
): Int { // This function readValidChoice help us to read and validate an integer choice within a
    // range
    while (true) {
        val choice = readChoice() // call the readChoice function
        if (choice in validRange)
                return choice!! // If the choice is in the valid range, return the choice
        println(
                "Invalid input. Please select a number between ${validRange.first} and ${validRange.last}."
        )
    }
}

// Helper function to read and validate a numeric input
fun readValidDouble():
        Double { // This function readValidDouble help us to read and validate a numeric input
    while (true) { // Use while loop to keep asking the user to enter a valid numeric value
        val input = readLine()?.toDoubleOrNull() // Read the input and convert it to Double
        if (input != null) return input // If the input is not null, return the input
        println("Invalid number. Please enter a valid numeric value.")
    }
}

fun convertOption() { // This function handles the functions ShowConvertMenu, handleConvertChoice,
    // and the readChoice function
    clearScreen()
    separator()
    var isInConvertMenu = true // declare isInConvertMenu for the loop
    val menu = Menu() // Create an instance of the Menu class
    while (isInConvertMenu) { // While the user is picking the choice and not going back to the menu
        menu.showConvertMenu() // call the showConvertMenu function
        print("Choose a category: ")
        val choice = readChoice() // call the readChoice and store the value to the choice

        when (choice) { // I use when for the control flow of the program
            1 -> {
                println("Length Conversion")
                convertOptionLength() // To convert the length
            } // To convert the length
            2 -> {
                println("Temperature Conversion")
                convertOptionTemperature()
            } // To convert the temperature
            3 -> {
                println("Area Conversion")
                convertOptionArea()
            } // To convert the Area
            4 -> {
                println("Volume Conversion")
                convertOptionVolume()
            } // To convert the volume
            5 -> {
                println("Weight Conversion")
                convertOptionWeight()
            } // To convert the weight
            6 -> return // Back to the main menu
            else ->
                    println(
                            "Invalid choice, please select a valid option."
                    ) // If the choice is invalid, this is the default response.
        }
    }
}

fun readChoice(): Int? { // function to accept the user input and return in Integer
    val input = readLine()
    return input?.toIntOrNull() // I use toIntOrNull function to parses a string as an integer and
    // returns the result or null if the string is not a valid number.
}

fun separator() {
    println(
            """
                                                                                                      
  _____ _____ _____ _____ _____ _____ _____ _____ _____ _____ _____ _____ _____ _____ _____ _____ 
 |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|
 |_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|_____|
                                                                                                  
                                                                                                  
    """
    )
}

fun clearScreen() {
    print("\u001b[H\u001b[2J")
    System.out.flush()
}

fun main() {
    val chm = ConversionHistoryManager() // Create an instance of the ConversionHistoryManager class
    clearScreen()
    val menu =
            """
    [1] Convert
    [2] View History (Clear option included)
    [3] Quit
    """.trimIndent()

    var isRunning = true

    println(
            """
 __        _______ _     ____ ___  __  __ _____ 
 \ \      / / ____| |   / ___/ _ \|  \/  | ____|
  \ \ /\ / /|  _| | |  | |  | | | | |\/| |  _|  
   \ V  V / | |___| |__| |__| |_| | |  | | |___ 
    \_/\_/  |_____|_____\____\___/|_|  |_|_____|
                                                """
    )
    println(
            """
     _   _ _   _ ___ _____    ____ ___  _   ___     _______ ____ _____ _____ ____  
    | | | | \ | |_ _|_   _|  / ___/ _ \| \ | \ \   / / ____|  _ \_   _| ____|  _ \ 
    | | | |  \| || |  | |   | |  | | | |  \| |\ \ / /|  _| | |_) || | |  _| | |_) |
    | |_| | |\  || |  | |   | |__| |_| | |\  | \ V / | |___|  _ < | | | |___|  _ < 
     \___/|_| \_|___| |_|    \____\___/|_| \_|  \_/  |_____|_| \_\|_| |_____|_| \_\
    """
    )

    while (isRunning) { // Use while loop to keep the program running until the user choose to quit
        println(menu)
        println("Enter the number of your choice for the menu")

        when (readChoice()) {
            1 -> convertOption() // Call the convertOption function
            2 -> chm.viewHistory() // Includes the option to clear history
            3 -> {
                println("Thank you for using the Unit Converter! Goodbye!")
                println(
                        """
  _____ _   _    _    _   _ _  __ __   _____  _   _ _ 
 |_   _| | | |  / \  | \ | | |/ / \ \ / / _ \| | | | |
   | | | |_| | / _ \ |  \| | ' /   \ V / | | | | | | |
   | | |  _  |/ ___ \| |\  | . \    | || |_| | |_| |_|
   |_| |_| |_/_/   \_\_| \_|_|\_\   |_| \___/ \___/(_)
                                                      
                """
                )
                isRunning = false
            }
            else -> println("Invalid choice, please select 1, 2, or 3.")
        }
    }
}
