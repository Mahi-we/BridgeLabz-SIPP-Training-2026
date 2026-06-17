import java.util.Scanner;

public class FactorsOperations {
   public FactorsOperations() {
   }

   public static int[] findFactors(int var0) {
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

   public static int findSum(int[] var0) {
      int var1 = 0;

      for(int var5 : var0) {
         var1 += var5;
      }

      return var1;
   }

   public static long findProduct(int[] var0) {
      long var1 = 1L;

      for(int var6 : var0) {
         var1 *= (long)var6;
      }

      return var1;
   }

   public static double findSumOfSquares(int[] var0) {
      double var1 = (double)0.0F;

      for(int var6 : var0) {
         var1 += Math.pow((double)var6, (double)2.0F);
      }

      return var1;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int var2 = var1.nextInt();
      int[] var3 = findFactors(var2);
      System.out.print("Factors: ");

      for(int var7 : var3) {
         System.out.print(var7 + " ");
      }

      System.out.println();
      int var9 = findSum(var3);
      long var10 = findProduct(var3);
      double var11 = findSumOfSquares(var3);
      System.out.println("Sum of factors = " + var9);
      System.out.println("Product of factors = " + var10);
      System.out.println("Sum of squares of factors = " + var11);
      var1.close();
   }
}