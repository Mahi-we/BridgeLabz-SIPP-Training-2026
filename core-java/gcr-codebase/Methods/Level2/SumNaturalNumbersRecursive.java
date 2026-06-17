import java.util.Scanner;

public class SumNaturalNumbersRecursive {
   public SumNaturalNumbersRecursive() {
   }

   public static int recursiveSum(int var0) {
      return var0 == 1 ? 1 : var0 + recursiveSum(var0 - 1);
   }

   public static int formulaSum(int var0) {
      return var0 * (var0 + 1) / 2;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a natural number: ");
      int var2 = var1.nextInt();
      if (var2 <= 0) {
         System.out.println("Please enter a valid natural number.");
      } else {
         int var3 = recursiveSum(var2);
         int var4 = formulaSum(var2);
         System.out.println("Sum using Recursion = " + var3);
         System.out.println("Sum using Formula = " + var4);
         if (var3 == var4) {
            System.out.println("Both computations are correct and give the same result.");
         } else {
            System.out.println("The results do not match.");
         }
      }

      var1.close();
   }
}