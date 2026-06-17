public class UnitConverter {
   public UnitConverter() {
   }

   public static double convertKmToMiles(double var0) {
      double var2 = 0.621371;
      return var0 * var2;
   }

   public static double convertMilesToKm(double var0) {
      double var2 = 1.60934;
      return var0 * var2;
   }

   public static double convertMetersToFeet(double var0) {
      double var2 = 3.28084;
      return var0 * var2;
   }

   public static double convertFeetToMeters(double var0) {
      double var2 = 0.3048;
      return var0 * var2;
   }

   public static void main(String[] var0) {
      double var1 = (double)10.0F;
      double var3 = (double)5.0F;
      double var5 = (double)20.0F;
      double var7 = (double)50.0F;
      System.out.println(var1 + " km = " + convertKmToMiles(var1) + " miles");
      System.out.println(var3 + " miles = " + convertMilesToKm(var3) + " km");
      System.out.println(var5 + " meters = " + convertMetersToFeet(var5) + " feet");
      System.out.println(var7 + " feet = " + convertFeetToMeters(var7) + " meters");
   }
}