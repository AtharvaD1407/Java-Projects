import java.util.Scanner;
import java.util.Random;

public class guessNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random R = new Random();
        int randNum = R.nextInt(10) + 1;

        System.out.println("You only have 3 chance.");
        
        int count = 1;
        
        while (true) {
            System.out.print("Enter number: (1 - 10) ");
            int num = scanner.nextInt();

            if (randNum == num) {
                System.out.println("Noice");
                break;
            }
            count += 1;

            if (count > 3) {
                System.out.println("Chance over.");
                break;
            }
        }

        scanner.close();
    }
}