import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[10];
        double sum = 0;
        int i = 0;

        while (i < 10) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) {
                break;
            }

            arr[i] = num;
            i++;
        }

        System.out.println("Numbers entered:");

        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
            sum += arr[j];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}
