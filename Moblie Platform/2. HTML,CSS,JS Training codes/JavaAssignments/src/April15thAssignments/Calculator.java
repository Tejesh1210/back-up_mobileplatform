package April15thAssignments;

// import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            return;
        }
        
        double a = Double.parseDouble(args[0]);
        String o = args[1];
        double b = Double.parseDouble(args[2]);
        
        double result = 0;

        switch (o) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }

        System.out.println("Result: " + result);
    }
}