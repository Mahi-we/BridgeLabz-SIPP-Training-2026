public class Degrees {
   public Degrees() {
   }

   public static double convertFahrenheitToCelsius(double var0) {
      double var2 = (var0 - (double)32.0F) * (double)5.0F / (double)9.0F;
      return var2;
   }

   public static double convertCelsiusToFahrenheit(double var0) {
      double var2 = var0 * (double)9.0F / (double)5.0F + (double)32.0F;
      return var2;
   }

   public static double convertPoundsToKilograms(double var0) {
      double var2 = 0.453592;
      return var0 * var2;
   }

   public static double convertKilogramsToPounds(double var0) {
      double var2 = 2.20462;
      return var0 * var2;
   }

   public static double convertGallonsToLiters(double var0) {
      double var2 = 3.78541;
      return var0 * var2;
   }

   public static double convertLitersToGallons(double var0) {
      double var2 = 0.264172;
      return var0 * var2;
   }

   public static void main(String[] var0) {
      System.out.println("98.6°F = " + convertFahrenheitToCelsius(98.6) + "°C");
      System.out.println("37°C = " + convertCelsiusToFahrenheit((double)37.0F) + "°F");
      System.out.println("150 Pounds = " + convertPoundsToKilograms((double)150.0F) + " Kilograms");
      System.out.println("68 Kilograms = " + convertKilogramsToPounds((double)68.0F) + " Pounds");
      System.out.println("5 Gallons = " + convertGallonsToLiters((double)5.0F) + " Liters");
      System.out.println("10 Liters = " + convertLitersToGallons((double)10.0F) + " Gallons");
   }
}