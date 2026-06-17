import java.util.Scanner;

public class BMICalculator {
   public BMICalculator() {
   }

   public static double calculateBMI(double var0, double var2) {
      double var4 = var2 / (double)100.0F;
      return var0 / (var4 * var4);
   }

   public static String getBMIStatus(double var0) {
      if (var0 < (double)18.5F) {
         return "Underweight";
      } else if (var0 < (double)25.0F) {
         return "Normal Weight";
      } else {
         return var0 < (double)30.0F ? "Overweight" : "Obese";
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      double[][] var2 = new double[10][3];
      String[] var3 = new String[10];

      for(int var4 = 0; var4 < 10; ++var4) {
         System.out.println("Enter details for Person " + (var4 + 1));
         System.out.print("Weight (kg): ");
         var2[var4][0] = var1.nextDouble();
         System.out.print("Height (cm): ");
         var2[var4][1] = var1.nextDouble();
         var2[var4][2] = calculateBMI(var2[var4][0], var2[var4][1]);
         var3[var4] = getBMIStatus(var2[var4][2]);
         System.out.println();
      }

      System.out.println("\nBMI REPORT");
      System.out.println("------------------------------------------------------------");
      System.out.printf("%-10s %-12s %-12s %-12s%n", "Person", "Weight", "Height", "BMI Status");
      System.out.println("------------------------------------------------------------");

      for(int var5 = 0; var5 < 10; ++var5) {
         System.out.printf("%-10d %-12.2f %-12.2f BMI=%.2f (%s)%n", var5 + 1, var2[var5][0], var2[var5][1], var2[var5][2], var3[var5]);
      }

      var1.close();
   }
}