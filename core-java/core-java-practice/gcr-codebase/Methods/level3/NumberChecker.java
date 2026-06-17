// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.io.PrintStream;
import java.util.Scanner;

public class NumberChecker {
   public NumberChecker() {
   }

   public static int countDigits(int var0) {
      int var1 = 0;

      for(int var2 = var0; var2 > 0; var2 /= 10) {
         ++var1;
      }

      return var1;
   }

   public static int[] getDigitsArray(int var0) {
      int var1 = countDigits(var0);
      int[] var2 = new int[var1];
      int var3 = var0;

      for(int var4 = var1 - 1; var4 >= 0; --var4) {
         var2[var4] = var3 % 10;
         var3 /= 10;
      }

      return var2;
   }

   public static boolean isDuckNumber(int[] var0) {
      for(int var1 = 1; var1 < var0.length; ++var1) {
         if (var0[var1] == 0) {
            return true;
         }
      }

      return false;
   }

   public static boolean isArmstrong(int var0, int[] var1) {
      int var2 = 0;
      int var3 = var1.length;

      for(int var7 : var1) {
         var2 += (int)Math.pow((double)var7, (double)var3);
      }

      return var2 == var0;
   }

   public static void findLargestAndSecondLargest(int[] var0) {
      int var1 = Integer.MIN_VALUE;
      int var2 = Integer.MIN_VALUE;

      for(int var6 : var0) {
         if (var6 > var1) {
            var2 = var1;
            var1 = var6;
         } else if (var6 > var2 && var6 != var1) {
            var2 = var6;
         }
      }

      System.out.println("Largest Digit = " + var1);
      System.out.println("Second Largest Digit = " + var2);
   }

   public static void findSmallestAndSecondSmallest(int[] var0) {
      int var1 = Integer.MAX_VALUE;
      int var2 = Integer.MAX_VALUE;

      for(int var6 : var0) {
         if (var6 < var1) {
            var2 = var1;
            var1 = var6;
         } else if (var6 < var2 && var6 != var1) {
            var2 = var6;
         }
      }

      System.out.println("Smallest Digit = " + var1);
      System.out.println("Second Smallest Digit = " + var2);
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      int var3 = countDigits(var2);
      int[] var4 = getDigitsArray(var2);
      System.out.println("Count of Digits = " + var3);
      System.out.print("Digits Array: ");

      for(int var8 : var4) {
         System.out.print(var8 + " ");
      }

      System.out.println();
      System.out.println("Duck Number = " + isDuckNumber(var4));
      PrintStream var10000 = System.out;
      boolean var10001 = isArmstrong(var2, var4);
      var10000.println("Armstrong Number = " + var10001);
      findLargestAndSecondLargest(var4);
      findSmallestAndSecondSmallest(var4);
      var1.close();
   }
}