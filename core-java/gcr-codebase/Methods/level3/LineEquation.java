// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Scanner;

public class LineEquation {
   public LineEquation() {
   }

   public static double findDistance(double var0, double var2, double var4, double var6) {
      return Math.sqrt(Math.pow(var4 - var0, (double)2.0F) + Math.pow(var6 - var2, (double)2.0F));
   }

   public static double[] findLineEquation(double var0, double var2, double var4, double var6) {
      double[] var8 = new double[2];
      double var9 = (var6 - var2) / (var4 - var0);
      double var11 = var2 - var9 * var0;
      var8[0] = var9;
      var8[1] = var11;
      return var8;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter x1: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter y1: ");
      double var4 = var1.nextDouble();
      System.out.print("Enter x2: ");
      double var6 = var1.nextDouble();
      System.out.print("Enter y2: ");
      double var8 = var1.nextDouble();
      double var10 = findDistance(var2, var4, var6, var8);
      if (var2 == var6) {
         System.out.println("\nThe line is vertical.");
         System.out.println("Equation: x = " + var2);
      } else {
         double[] var12 = findLineEquation(var2, var4, var6, var8);
         double var13 = var12[0];
         double var15 = var12[1];
         System.out.printf("\nEuclidean Distance = %.2f%n", var10);
         System.out.printf("Slope (m) = %.2f%n", var13);
         System.out.printf("Y-Intercept (b) = %.2f%n", var15);
         System.out.printf("Equation of Line: y = %.2fx + %.2f%n", var13, var15);
      }

      var1.close();
   }
}