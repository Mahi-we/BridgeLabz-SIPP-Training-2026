import java.util.Scanner;

public class Number_Check {

    // Method to check the number
    public static int checkNumber(int number) {
        if (number > 0) {
            return 1;      // Positive
        } else if (number < 0) {
            return -1;     // Negative
        } else {
            return 0;      // Zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println(number + " is a Positive Number.");
        } else if (result == -1) {
            System.out.println(number + " is a Negative Number.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}