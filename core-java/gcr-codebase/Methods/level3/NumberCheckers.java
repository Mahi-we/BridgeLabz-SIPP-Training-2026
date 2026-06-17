// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class NumberCheckers {
   public NumberCheckers() {
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

   public static int sumOfDigits(int[] var0) {
      int var1 = 0;

      for(int var5 : var0) {
         var1 += var5;
      }

      return var1;
   }

   public static int sumOfSquares(int[] var0) {
      int var1 = 0;

      for(int var5 : var0) {
         var1 += (int)Math.pow((double)var5, (double)2.0F);
      }

      return var1;
   }

   public static boolean isHarshadNumber(int var0, int[] var1) {
      int var2 = sumOfDigits(var1);
      if (var2 == 0) {
         return false;
      } else {
         return var0 % var2 == 0;
      }
   }

   public static int[][] digitFrequency(int[] var0) {
      int[][] var1 = new int[10][2];

      for(int var2 = 0; var2 < 10; ++var2) {
         var1[var2][0] = var2;
         var1[var2][1] = 0;
      }

      for(int var5 : var0) {
         int var10002 = var1[var5][1]++;
      }

      return var1;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      int[] var3 = getDigitsArray(var2);
      System.out.println("\nCount of Digits: " + countDigits(var2));
      System.out.print("Digits Array: ");

      for(int var7 : var3) {
         System.out.print(var7 + " ");
      }

      System.out.println();
      System.out.println("Sum of Digits: " + sumOfDigits(var3));
      System.out.println("Sum of Squares of Digits: " + sumOfSquares(var3));
      if (isHarshadNumber(var2, var3)) {
         System.out.println(var2 + " is a Harshad Number.");
      } else {
         System.out.println(var2 + " is not a Harshad Number.");
      }

      int[][] var8 = digitFrequency(var3);
      System.out.println("\nDigit Frequencies:");
      System.out.println("Digit\tFrequency");

      for(int var9 = 0; var9 < var8.length; ++var9) {
         if (var8[var9][1] > 0) {
            System.out.println(var8[var9][0] + "\t" + var8[var9][1]);
         }
      }

      var1.close();
   }
}