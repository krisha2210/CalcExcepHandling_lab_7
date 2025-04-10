// Krisha shah
// 24070126512
// b3

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
		// Taking user input for two numbers
            System.out.println("Enter two numbers:");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
			
		 // Calling and displaying results from different operations	

            System.out.println("Addition: " + Addition.add(a, b));
            System.out.println("Subtraction: " + Subtraction.subtract(a, b));
            System.out.println("Multiplication: " + Multiplication.multiply(a, b));
            System.out.println("Division: " + Division.divide(a, b));

            System.out.println("Square of " + a + ": " + Square.square(a));
            System.out.println("Cube of " + a + ": " + Cube.cube(a));
            System.out.println("Square Root of " + a + ": " + SquareRoot.squareRoot(a));
			
        // Catch block for arithmetic errors like division by zero
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic Error: " + ae.getMessage());
        } catch (IllegalArgumentException ie) {
		 // Catch block for invalid input like square root of negative number
            System.out.println("Invalid Input: " + ie.getMessage());
        } catch (Exception e) {
		 // General catch block for any other exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
