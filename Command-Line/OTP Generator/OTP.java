import java.util.Scanner;
import java.util.Random;

public class OTP {

    public static int generateOTP(int l) {
        Random R = new Random();

        String otp = "";

        for (int i = 0; i < l; i++) {
            int randInt = R.nextInt(9) + 1;
            otp += randInt;
        }

        return Integer.parseInt(otp);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the otp: (4 or 6) ");
        int len = scanner.nextInt();

        System.out.println(generateOTP(len));

        scanner.close();
    }
}