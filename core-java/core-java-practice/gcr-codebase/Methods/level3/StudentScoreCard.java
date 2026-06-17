// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class StudentScoreCard {
   public StudentScoreCard() {
   }

   public static int[][] generateScores(int var0) {
      int[][] var1 = new int[var0][3];

      for(int var2 = 0; var2 < var0; ++var2) {
         var1[var2][1] = (int)(Math.random() * (double)90.0F) + 10;
         var1[var2][2] = (int)(Math.random() * (double)90.0F) + 10;
         var1[var2][0] = (int)(Math.random() * (double)90.0F) + 10;
      }

      return var1;
   }

   public static double[][] calculateResults(int[][] var0) {
      int var1 = var0.length;
      double[][] var2 = new double[var1][3];

      for(int var3 = 0; var3 < var1; ++var3) {
         int var4 = var0[var3][0] + var0[var3][1] + var0[var3][2];
         double var5 = (double)var4 / (double)3.0F;
         double var7 = (double)var4 / (double)300.0F * (double)100.0F;
         var5 = (double)Math.round(var5 * (double)100.0F) / (double)100.0F;
         var7 = (double)Math.round(var7 * (double)100.0F) / (double)100.0F;
         var2[var3][0] = (double)var4;
         var2[var3][1] = var5;
         var2[var3][2] = var7;
      }

      return var2;
   }

   public static void displayScoreCard(int[][] var0, double[][] var1) {
      System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
      System.out.println("--------------------------------------------------------------------");

      for(int var2 = 0; var2 < var0.length; ++var2) {
         System.out.println(var2 + 1 + "\t" + var0[var2][0] + "\t" + var0[var2][1] + "\t\t" + var0[var2][2] + "\t" + (int)var1[var2][0] + "\t" + var1[var2][1] + "\t" + var1[var2][2] + "%");
      }

   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter number of students: ");
      int var2 = var1.nextInt();
      int[][] var3 = generateScores(var2);
      double[][] var4 = calculateResults(var3);
      displayScoreCard(var3, var4);
      var1.close();
   }
}