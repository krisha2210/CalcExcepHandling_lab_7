//Division.java
// This class performs division and handles divide-by-zero exception
public class Division {
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed."); // Custom exception
        }
        return a / b;  // returns the quotient
    }
}
