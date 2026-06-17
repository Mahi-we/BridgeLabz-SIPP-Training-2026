import java.io.PrintStream;
import java.util.Scanner;

public class CheckerNumber {
   public CheckerNumber() {
   }

   public static int countDigits(int var0) {
      int var1 = 0;
      int var2 = Math.abs(var0);
      if (var2 == 0) {
         return 1;
      } else {
         while(var2 > 0) {
            ++var1;
            var2 /= 10;
         }

         return var1;
      }
   }

   public static int[] getDigitsArray(int var0) {
      int var1 = countDigits(var0);
      int[] var2 = new int[var1];
      int var3 = Math.abs(var0);

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var2[var4] = var3 % 10;
         var3 /= 10;
      }

      return var2;
   }

   public static int[] reverseArray(int[] var0) {
      int[] var1 = new int[var0.length];

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1[var2] = var0[var0.length - 1 - var2];
      }

      return var1;
   }

   public static boolean compareArrays(int[] var0, int[] var1) {
      if (var0.length != var1.length) {
         return false;
      } else {
         for(int var2 = 0; var2 < var0.length; ++var2) {
            if (var0[var2] != var1[var2]) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean isPalindrome(int[] var0) {
      int[] var1 = reverseArray(var0);
      return compareArrays(var0, var1);
   }

   public static boolean isDuckNumber(int[] var0) {
      for(int var1 = 1; var1 < var0.length; ++var1) {
         if (var0[var1] == 0) {
            return true;
         }
      }

      return false;
   }

   public static void displayArray(int[] var0) {
      for(int var4 : var0) {
         System.out.print(var4 + " ");
      }

      System.out.println();
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      int[] var3 = getDigitsArray(var2);
      System.out.println("\nCount of Digits: " + countDigits(var2));
      System.out.print("Digits Array: ");
      displayArray(var3);
      int[] var4 = reverseArray(var3);
      System.out.print("Reversed Array: ");
      displayArray(var4);
      PrintStream var10000 = System.out;
      boolean var10001 = compareArrays(var3, var4);
      var10000.println("Arrays Equal: " + var10001);
      if (isPalindrome(var3)) {
         System.out.println(var2 + " is a Palindrome Number.");
      } else {
         System.out.println(var2 + " is not a Palindrome Number.");
      }

      if (isDuckNumber(var3)) {
         System.out.println(var2 + " is a Duck Number.");
      } else {
         System.out.println(var2 + " is not a Duck Number.");
      }

      var1.close();
   }
}