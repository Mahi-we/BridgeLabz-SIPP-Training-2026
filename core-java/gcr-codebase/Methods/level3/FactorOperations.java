import java.util.Scanner;

public class FactorOperations {
   public FactorOperations() {
   }

   public static int[] getFactors(int var0) {
      int var1 = 0;

      for(int var2 = 1; var2 <= var0; ++var2) {
         if (var0 % var2 == 0) {
            ++var1;
         }
      }

      int[] var5 = new int[var1];
      int var3 = 0;

      for(int var4 = 1; var4 <= var0; ++var4) {
         if (var0 % var4 == 0) {
            var5[var3++] = var4;
         }
      }

      return var5;
   }

   public static int greatestFactor(int[] var0) {
      return var0[var0.length - 1];
   }

   public static int sumOfFactors(int[] var0) {
      int var1 = 0;

      for(int var5 : var0) {
         var1 += var5;
      }

      return var1;
   }

   public static long productOfFactors(int[] var0) {
      long var1 = 1L;

      for(int var6 : var0) {
         var1 *= (long)var6;
      }

      return var1;
   }

   public static double productOfCubes(int[] var0) {
      double var1 = (double)1.0F;

      for(int var6 : var0) {
         var1 *= Math.pow((double)var6, (double)3.0F);
      }

      return var1;
   }

   public static void displayFactors(int[] var0) {
      for(int var4 : var0) {
         System.out.print(var4 + " ");
      }

      System.out.println();
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      int[] var3 = getFactors(var2);
      System.out.print("\nFactors: ");
      displayFactors(var3);
      System.out.println("Greatest Factor: " + greatestFactor(var3));
      System.out.println("Sum of Factors: " + sumOfFactors(var3));
      System.out.println("Product of Factors: " + productOfFactors(var3));
      System.out.println("Product of Cubes of Factors: " + productOfCubes(var3));
      var1.close();
   }
}