# Java Calculator Project

## Description

This project is a simple, menu-driven Java Calculator designed with modular programming principles. It performs basic arithmetic and mathematical operations such as addition, subtraction, multiplication, division, square, cube, and square root. Each operation is implemented in a separate `.java` file with proper exception handling to ensure smooth performance and maintainability.

---

## ✅ Functionality and Method Descriptions

The calculator supports the following operations:

- **Addition**: Implemented in `Addition.java` through the method `performAddition()`. This method takes two numbers as input and returns their sum.

- **Subtraction**: Defined in `Subtraction.java` using the `performSubtraction()` method. It subtracts the second number from the first and returns the result.

- **Multiplication**: Found in `Multiplication.java`, the method `performMultiplication()` takes two numbers and returns their product.

- **Division**: The `performDivision()` method in `Division.java` divides the first number by the second. It includes exception handling for `ArithmeticException` to prevent division by zero errors.

- **Square**: The `calculateSquare()` method in `Square.java` calculates and returns the square of the given number.

- **Cube**: Implemented in `Cube.java`, the `calculateCube()` method computes and returns the cube of the input number.

- **Square Root**: In `SquareRoot.java`, the `calculateSquareRoot()` method returns the square root of a number. It includes a check to throw an `IllegalArgumentException` if the input is negative.

- **Main Program**: The `CalculatorMain.java` file contains the `main()` method, which provides a menu-driven interface for the user to choose operations. It handles user input, manages program flow, and calls the appropriate methods from each class.

---

