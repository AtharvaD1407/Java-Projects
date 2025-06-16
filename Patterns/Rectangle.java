import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int row = scanner.nextInt();

        System.out.print("Enter columns: ");
        int col = scanner.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}

/*
 ****
 ****

 row = 2; col = 4
 */