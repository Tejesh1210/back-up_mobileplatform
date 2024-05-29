package April15thAssignments;

public class ArithmeticExceptionMain { 

    public static void main(String[] args) { 

        try { 

            // Attempting to divide by zero 

            int n = 10; 

            int d = 0; 

            int r = n/ d; 

            System.out.println("Result: " + r); 

        } catch (ArithmeticException e) { 

            // Custom error message for ArithmeticException 

            System.out.println("Error: Cannot divide by zero."); 

        } 

    } 

}