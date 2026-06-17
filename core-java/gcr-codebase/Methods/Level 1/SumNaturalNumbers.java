import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to calculate the sum of n natural numbers
    public static int findSum(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        int sum = findSum(n);

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}