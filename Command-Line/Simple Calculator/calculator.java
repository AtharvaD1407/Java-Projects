import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                1. Add
                2. Subtract
                3. Multiply
                4. Divide
                """);
        String choice = scanner.nextLine();

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        int result = 0;

        switch (choice) {
            case "1":
                result = num1 + num2;
                break;

            case "2":
                result = num1 - num2;
                break;

            case "3":
                result = num1 * num2;
                break;

            case "4":
                try {
                    result = num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero.");
                }
                break;

            default:
                System.out.println("Invalid input.");
                break;
        }
        
        System.out.printf("Result : %d", result);

        scanner.close();
    }
}