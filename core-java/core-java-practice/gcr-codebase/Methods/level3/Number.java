// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class Number {
   public Number() {
   }

   public static boolean isPrime(int var0) {
      if (var0 <= 1) {
         return false;
      } else {
         for(int var1 = 2; (double)var1 <= Math.sqrt((double)var0); ++var1) {
            if (var0 % var1 == 0) {
               return false;
            }
         }

         return true;
      }
   }

   public static boolean isNeon(int var0) {
      int var1 = var0 * var0;

      int var2;
      for(var2 = 0; var1 > 0; var1 /= 10) {
         var2 += var1 % 10;
      }

      return var2 == var0;
   }

   public static boolean isSpy(int var0) {
      int var1 = 0;
      int var2 = 1;

      for(int var3 = var0; var3 > 0; var3 /= 10) {
         int var4 = var3 % 10;
         var1 += var4;
         var2 *= var4;
      }

      return var1 == var2;
   }

   public static boolean isAutomorphic(int var0) {
      int var1 = var0 * var0;

      for(int var2 = var0; var2 > 0; var1 /= 10) {
         if (var2 % 10 != var1 % 10) {
            return false;
         }

         var2 /= 10;
      }

      return true;
   }

   public static boolean isBuzz(int var0) {
      return var0 % 7 == 0 || var0 % 10 == 7;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      System.out.println("\nResults for Number: " + var2);
      System.out.println("Prime Number      : " + isPrime(var2));
      System.out.println("Neon Number       : " + isNeon(var2));
      System.out.println("Spy Number        : " + isSpy(var2));
      System.out.println("Automorphic Number: " + isAutomorphic(var2));
      System.out.println("Buzz Number       : " + isBuzz(var2));
      var1.close();
   }
}