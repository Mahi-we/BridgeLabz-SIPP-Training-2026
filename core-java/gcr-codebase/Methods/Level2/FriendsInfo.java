import java.util.Scanner;

public class FriendsInfo {
   public FriendsInfo() {
   }

   public static String findYoungest(int[] var0, String[] var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < var0.length; ++var3) {
         if (var0[var3] < var0[var2]) {
            var2 = var3;
         }
      }

      return var1[var2];
   }

   public static String findTallest(double[] var0, String[] var1) {
      int var2 = 0;

      for(int var3 = 1; var3 < var0.length; ++var3) {
         if (var0[var3] > var0[var2]) {
            var2 = var3;
         }
      }

      return var1[var2];
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      String[] var2 = new String[]{"Amar", "Akbar", "Anthony"};
      int[] var3 = new int[3];
      double[] var4 = new double[3];

      for(int var5 = 0; var5 < 3; ++var5) {
         System.out.println("Enter age of " + var2[var5] + ":");
         var3[var5] = var1.nextInt();
         System.out.println("Enter height of " + var2[var5] + " (in cm):");
         var4[var5] = var1.nextDouble();
      }

      String var7 = findYoungest(var3, var2);
      String var6 = findTallest(var4, var2);
      System.out.println("\nYoungest Friend: " + var7);
      System.out.println("Tallest Friend: " + var6);
      var1.close();
   }
}