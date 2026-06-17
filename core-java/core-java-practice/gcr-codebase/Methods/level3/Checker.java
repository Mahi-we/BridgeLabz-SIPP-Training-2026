import java.util.Scanner;

public class Checker {
   public Checker() {
   }

   public static int sumOfProperDivisors(int var0) {
      int var1 = 0;

      for(int var2 = 1; var2 <= var0 / 2; ++var2) {
         if (var0 % var2 == 0) {
            var1 += var2;
         }
      }

      return var1;
   }

   public static boolean isPerfect(int var0) {
      return sumOfProperDivisors(var0) == var0;
   }

   public static boolean isAbundant(int var0) {
      return sumOfProperDivisors(var0) > var0;
   }

   public static boolean isDeficient(int var0) {
      return sumOfProperDivisors(var0) < var0;
   }

   public static int factorial(int var0) {
      int var1 = 1;

      for(int var2 = 1; var2 <= var0; ++var2) {
         var1 *= var2;
      }

      return var1;
   }

   public static boolean isStrong(int var0) {
      int var1 = var0;

      int var2;
      for(var2 = 0; var1 > 0; var1 /= 10) {
         int var3 = var1 % 10;
         var2 += factorial(var3);
      }

      return var2 == var0;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      System.out.println("\nResults for Number: " + var2);
      System.out.println("Perfect Number   : " + isPerfect(var2));
      System.out.println("Abundant Number  : " + isAbundant(var2));
      System.out.println("Deficient Number : " + isDeficient(var2));
      System.out.println("Strong Number    : " + isStrong(var2));
      var1.close();
   }
}