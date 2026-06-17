public class UnitConverters {
   public UnitConverters() {
   }

   public static double convertYardsToFeet(double var0) {
      double var2 = (double)3.0F;
      return var0 * var2;
   }

   public static double convertFeetToYards(double var0) {
      double var2 = 0.333333;
      return var0 * var2;
   }

   public static double convertMetersToInches(double var0) {
      double var2 = 39.3701;
      return var0 * var2;
   }

   public static double convertInchesToMeters(double var0) {
      double var2 = 0.0254;
      return var0 * var2;
   }

   public static double convertInchesToCentimeters(double var0) {
      double var2 = 2.54;
      return var0 * var2;
   }

   public static void main(String[] var0) {
      double var1 = (double)10.0F;
      double var3 = (double)30.0F;
      double var5 = (double)5.0F;
      double var7 = (double)20.0F;
      System.out.println(var1 + " yards = " + convertYardsToFeet(var1) + " feet");
      System.out.println(var3 + " feet = " + convertFeetToYards(var3) + " yards");
      System.out.println(var5 + " meters = " + convertMetersToInches(var5) + " inches");
      System.out.println(var7 + " inches = " + convertInchesToMeters(var7) + " meters");
      System.out.println(var7 + " inches = " + convertInchesToCentimeters(var7) + " centimeters");
   }
}