import java.util.Scanner;

public class NumberChecker {
   public NumberChecker() {
   }

   public static boolean isPositive(int var0) {
      return var0 >= 0;
   }

   public static boolean isEven(int var0) {
      return var0 % 2 == 0;
   }

   public static int compare(int var0, int var1) {
      if (var0 > var1) {
         return 1;
      } else {
         return var0 == var1 ? 0 : -1;
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int[] var2 = new int[5];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         System.out.print("Enter number " + (var3 + 1) + ": ");
         var2[var3] = var1.nextInt();
      }

      System.out.println("\nChecking Numbers:");

      for(int var5 = 0; var5 < var2.length; ++var5) {
         int var4 = var2[var5];
         if (isPositive(var4)) {
            if (isEven(var4)) {
               System.out.println(var4 + " is Positive and Even");
            } else {
               System.out.println(var4 + " is Positive and Odd");
            }
         } else {
            System.out.println(var4 + " is Negative");
         }
      }

      int var6 = compare(var2[0], var2[var2.length - 1]);
      System.out.println("\nComparison of First and Last Elements:");
      if (var6 == 1) {
         System.out.println(var2[0] + " is greater than " + var2[var2.length - 1]);
      } else if (var6 == 0) {
         System.out.println(var2[0] + " is equal to " + var2[var2.length - 1]);
      } else {
         System.out.println(var2[0] + " is less than " + var2[var2.length - 1]);
      }

      var1.close();
   }
}