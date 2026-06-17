// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class ZaraBonusCalculator {
   public ZaraBonusCalculator() {
   }

   public static int[][] generateEmployeeData(int var0) {
      int[][] var1 = new int[var0][2];

      for(int var2 = 0; var2 < var0; ++var2) {
         var1[var2][0] = (int)(Math.random() * (double)90000.0F) + 10000;
         var1[var2][1] = (int)(Math.random() * (double)10.0F) + 1;
      }

      return var1;
   }

   public static double[][] calculateBonus(int[][] var0) {
      int var1 = var0.length;
      double[][] var2 = new double[var1][2];

      for(int var3 = 0; var3 < var1; ++var3) {
         int var4 = var0[var3][0];
         int var5 = var0[var3][1];
         double var6;
         if (var5 > 5) {
            var6 = (double)var4 * 0.05;
         } else {
            var6 = (double)var4 * 0.02;
         }

         double var8 = (double)var4 + var6;
         var2[var3][0] = var6;
         var2[var3][1] = var8;
      }

      return var2;
   }

   public static void displayReport(int[][] var0, double[][] var1) {
      double var2 = (double)0.0F;
      double var4 = (double)0.0F;
      double var6 = (double)0.0F;
      System.out.println("\n---------------------------------------------------------------");
      System.out.printf("%-5s %-12s %-10s %-12s %-12s%n", "Emp", "OldSalary", "Years", "Bonus", "NewSalary");
      System.out.println("---------------------------------------------------------------");

      for(int var8 = 0; var8 < var0.length; ++var8) {
         int var9 = var0[var8][0];
         int var10 = var0[var8][1];
         double var11 = var1[var8][0];
         double var13 = var1[var8][1];
         var2 += (double)var9;
         var4 += var11;
         var6 += var13;
         System.out.printf("%-5d %-12d %-10d %-12.2f %-12.2f%n", var8 + 1, var9, var10, var11, var13);
      }

      System.out.println("---------------------------------------------------------------");
      System.out.printf("Total Old Salary : %.2f%n", var2);
      System.out.printf("Total Bonus      : %.2f%n", var4);
      System.out.printf("Total New Salary : %.2f%n", var6);
   }

   public static void main(String[] var0) {
      byte var1 = 10;
      int[][] var2 = generateEmployeeData(var1);
      double[][] var3 = calculateBonus(var2);
      displayReport(var2, var3);
   }
}