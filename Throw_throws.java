// Example of throw_throws for exception
public class Throw_throws {
   
    // Method to divide two integers
    public static int divide(int a, int b) throws ArithmeticException {
       int result = a / b;  
       return result;
    }
 
    public static void main(String[] args) {
       try {
           // Attempting division by zero
           int c = divide(7, 0);
           System.out.println(c);
       } 
       catch (ArithmeticException e) {
           // Catching the specific ArithmeticException
           System.out.println("Cannot divide by zero: " + e.getMessage());
       }
       catch (Exception e) {
           // Generic exception handler, just in case
           System.out.println("An unexpected error occurred.");
       }
    }
 }
 