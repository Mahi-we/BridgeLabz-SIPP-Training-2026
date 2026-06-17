// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.Random;

public class FootballTeamHeight {
   public FootballTeamHeight() {
   }

   public static int findSum(int[] var0) {
      int var1 = 0;

      for(int var5 : var0) {
         var1 += var5;
      }

      return var1;
   }

   public static double findMean(int[] var0) {
      return (double)findSum(var0) / (double)var0.length;
   }

   public static int findShortest(int[] var0) {
      int var1 = var0[0];

      for(int var5 : var0) {
         if (var5 < var1) {
            var1 = var5;
         }
      }

      return var1;
   }

   public static int findTallest(int[] var0) {
      int var1 = var0[0];

      for(int var5 : var0) {
         if (var5 > var1) {
            var1 = var5;
         }
      }

      return var1;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[11];
      Random var2 = new Random();

      for(int var3 = 0; var3 < var1.length; ++var3) {
         var1[var3] = var2.nextInt(101) + 150;
      }

      System.out.println("Player Heights (cm):");

      for(int var8 = 0; var8 < var1.length; ++var8) {
         System.out.println("Player " + (var8 + 1) + ": " + var1[var8]);
      }

      int var9 = findSum(var1);
      double var4 = findMean(var1);
      int var6 = findShortest(var1);
      int var7 = findTallest(var1);
      System.out.println("\nResults:");
      System.out.println("Total Height = " + var9 + " cm");
      System.out.println("Mean Height = " + var4 + " cm");
      System.out.println("Shortest Height = " + var6 + " cm");
      System.out.println("Tallest Height = " + var7 + " cm");
   }
}