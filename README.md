# Unit Converter Program

## Overview

### Introduction

The **Unit Converter Program** is a **Command-Line Interface (CLI) application** written in **Kotlin** that allows users to convert between different units of measurement. It supports conversions for various categories, including **Length, Temperature, Area, Volume, and Weight**. The program also maintains a **conversion history**, allowing users to review or clear past conversions.

### Features

- ✅ **User-Friendly Menu System** – A structured menu guides users through different unit conversions.
- ✅ **Multiple Conversion Categories** – Supports **Length, Temperature, Area, Volume, and Weight** conversions.
- ✅ **Accurate Unit Conversions** – Uses pre-defined conversion factors and formulas for precise calculations.
- ✅ **Conversion History** – Stores past conversions and provides an option to review or clear them.
- ✅ **Error Handling** – Ensures valid user input and prevents crashes from invalid entries.

## How It Works

### 1. Main Menu

Users select from three options:

- **[1] Convert** – Opens the conversion menu.
- **[2] View History** – Displays past conversions with a clear option.
- **[3] Quit** – Exits the program.

### 2. Conversion Menu

- Users choose a **conversion category** (e.g., Length, Temperature, Volume, etc.).
- They select the **unit to convert from** and **unit to convert to**.
- They input the **value** for conversion.
- The program **calculates and displays the result**.
- The conversion is **stored in history**.

### 3. Conversion History

- Displays all past conversions.
- Allows users to clear history if desired.

## Supported Conversion Categories & Units

### 1. Length Conversion

- Centimeters, Meters, Kilometers, Inches, Feet, Yards, Miles, etc.

### 2. Temperature Conversion

- Celsius, Fahrenheit, Kelvin

### 3. Area Conversion _(Planned)_

- Square Meters, Square Kilometers, Acres, Hectares, etc.

### 4. Volume Conversion _(Now Added! 🎉)_

- Milliliters, Liters, Cubic Meters, Gallons, Pints, etc.

### 5. Weight Conversion _(Planned)_

- Grams, Kilograms, Pounds, Ounces, etc.

## Technical Details

- **Programming Language**: Kotlin
- **Data Structures**: Uses **maps** for unit conversions and **lists** for storing conversion history.
- **Error Handling**: Ensures valid user input through **helper functions**.
- **Modular Code**: Organized functions for different conversion types, improving readability.

## Future Improvements

🔹 Add **more unit categories** (e.g., Speed, Pressure, Time).  
🔹 Implement **unit conversion formulas for Area & Weight**.  
🔹 Provide **a GUI version** for better user experience.  
🔹 Save **history to a file** for persistence after program exit.

## Conclusion

This **Unit Converter Program** is a simple yet effective CLI tool for quick and accurate conversions. With a clean menu system, robust unit conversion logic, and history tracking, it provides a seamless user experience. Future updates can expand its capabilities with more unit categories and enhanced features. 🚀

[Unit Converter Demo Video](http://youtube.link.goes.here)

# Development Environment

- **Kotlin version**: 2.1.0-release-394 (JRE 23.0.1+11-39)
- **IDE**: Visual Studio Code

# Useful Websites

- [Calculator.Net](https://www.calculator.net/conversion-calculator.html)
- [Visual Studio Code](https://code.visualstudio.com/)
- [Learn X in Y minutes](https://learnxinyminutes.com/kotlin/)
- [Kotlin](https://kotlinlang.org/)
