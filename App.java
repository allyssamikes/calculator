import java.util.Scanner;

public class App {
    static final Scanner inputScanner = new Scanner(System.in);    
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            boolean check = true;

            while (check == true) {
            double num1 = getDouble("Enter a number");
            double num2 = getDouble("Enter another number");
            System.out.println("You want to add " + String.format("%.2f",num1) + " and " + String.format("%.2f",num2));
            System.out.println("Answer: " + calc.add(num1, num2));
            System.out.println("You want to subtract " + String.format("%.2f",num1) + " and " + String.format("%.2f",num2));
            System.out.println("Answer: " + calc.subtract(num1, num2));
            System.out.println("You want to multiply " + String.format("%.2f",num1) + " and " + String.format("%.2f",num2));
            System.out.println("Answer: " + calc.multiply(num1, num2));
            System.out.println("You want to dividde " + String.format("%.2f",num1) + " and " + String.format("%.2f",num2));
            System.out.println("Answer: " + calc.divide(num1, num2));
            inputScanner.nextLine();
            String answer = getString("Would you like to continue? y/n");
            if (answer == "y") {
                continue;  
            } else {
                System.out.println("Goodbye");
                check = false;
            } 
        }   
        }
    
     


private static String getString(String prompt) {
            System.out.println(prompt);
            return inputScanner.nextLine();
        }
        
private static double getDouble(String prompt) {
            System.out.println(prompt);
            return inputScanner.nextDouble();
}
        }
