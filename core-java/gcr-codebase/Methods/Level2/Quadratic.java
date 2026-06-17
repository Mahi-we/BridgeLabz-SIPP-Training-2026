import java.util.Scanner;

public class Quadratic {
   public Quadratic() {
   }

   public static double[] findRoots(double var0, double var2, double var4) {
      double var6 = Math.pow(var2, (double)2.0F) - (double)4.0F * var0 * var4;
      if (var6 > (double)0.0F) {
         double var12 = (-var2 + Math.sqrt(var6)) / ((double)2.0F * var0);
         double var10 = (-var2 - Math.sqrt(var6)) / ((double)2.0F * var0);
         return new double[]{var12, var10};
      } else if (var6 == (double)0.0F) {
         double var8 = -var2 / ((double)2.0F * var0);
         return new double[]{var8};
      } else {
         return new double[0];
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter value of a: ");
      double var2 = var1.nextDouble();
      System.out.print("Enter value of b: ");
      double var4 = var1.nextDouble();
      System.out.print("Enter value of c: ");
      double var6 = var1.nextDouble();
      double[] var8 = findRoots(var2, var4, var6);
      if (var8.length == 2) {
         System.out.println("Root 1 = " + var8[0]);
         System.out.println("Root 2 = " + var8[1]);
      } else if (var8.length == 1) {
         System.out.println("Only one root = " + var8[0]);
      } else {
         System.out.println("No Real Roots");
      }

      var1.close();
   }
}