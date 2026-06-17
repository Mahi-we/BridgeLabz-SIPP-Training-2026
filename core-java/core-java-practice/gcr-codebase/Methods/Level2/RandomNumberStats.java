import java.util.Arrays;

public class RandomNumberStats {
   public RandomNumberStats() {
   }

   public static int[] generate4DigitRandomArray(int var0) {
      int[] var1 = new int[var0];

      for(int var2 = 0; var2 < var0; ++var2) {
         var1[var2] = (int)(Math.random() * (double)9000.0F) + 1000;
      }

      return var1;
   }

   public static double[] findAverageMinMax(int[] var0) {
      int var1 = 0;
      int var2 = var0[0];
      int var3 = var0[0];

      for(int var7 : var0) {
         var1 += var7;
         var2 = Math.min(var2, var7);
         var3 = Math.max(var3, var7);
      }

      double var8 = (double)var1 / (double)var0.length;
      return new double[]{var8, (double)var2, (double)var3};
   }

   public static void main(String[] var0) {
      int[] var1 = generate4DigitRandomArray(5);
      System.out.println("Generated Random Numbers:");
      System.out.println(Arrays.toString(var1));
      double[] var2 = findAverageMinMax(var1);
      System.out.println("Average = " + var2[0]);
      System.out.println("Minimum = " + (int)var2[1]);
      System.out.println("Maximum = " + (int)var2[2]);
   }
}