import java.io.PrintStream;
import java.util.Scanner;

public class CollinearPoints {
   public CollinearPoints() {
   }

   public static boolean isCollinearBySlope(int var0, int var1, int var2, int var3, int var4, int var5) {
      return (var3 - var1) * (var4 - var2) == (var5 - var3) * (var2 - var0);
   }

   public static double triangleArea(int var0, int var1, int var2, int var3, int var4, int var5) {
      return (double)Math.abs(var0 * (var3 - var5) + var2 * (var5 - var1) + var4 * (var1 - var3)) / (double)2.0F;
   }

   public static boolean isCollinearByArea(int var0, int var1, int var2, int var3, int var4, int var5) {
      return triangleArea(var0, var1, var2, var3, var4, var5) == (double)0.0F;
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter x1 y1: ");
      int var2 = var1.nextInt();
      int var3 = var1.nextInt();
      System.out.print("Enter x2 y2: ");
      int var4 = var1.nextInt();
      int var5 = var1.nextInt();
      System.out.print("Enter x3 y3: ");
      int var6 = var1.nextInt();
      int var7 = var1.nextInt();
      boolean var8 = isCollinearBySlope(var2, var3, var4, var5, var6, var7);
      boolean var9 = isCollinearByArea(var2, var3, var4, var5, var6, var7);
      System.out.println("\nUsing Slope Formula: " + (var8 ? "Collinear" : "Not Collinear"));
      PrintStream var10000 = System.out;
      double var10001 = triangleArea(var2, var3, var4, var5, var6, var7);
      var10000.println("Area of Triangle = " + var10001);
      System.out.println("Using Area Formula: " + (var9 ? "Collinear" : "Not Collinear"));
      var1.close();
   }
}