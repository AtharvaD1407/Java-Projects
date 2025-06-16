import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int row = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < row; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*
 ***
  ***
   ***

row = 3
 */