//SquareRoot.java
// This class calculates the square root of a number with validation
public class SquareRoot {
    public static double squareRoot(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot find square root of a negative number."); // Custom exception
        }
        return Math.sqrt(a);  // returns square root using built-in method
    }
}
