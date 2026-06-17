// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class OTPGenerator {
   public OTPGenerator() {
   }

   public static int generateOTP() {
      return (int)(Math.random() * (double)900000.0F) + 100000;
   }

   public static boolean areUnique(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         for(int var2 = var1 + 1; var2 < var0.length; ++var2) {
            if (var0[var1] == var0[var2]) {
               return false;
            }
         }
      }

      return true;
   }

   public static void main(String[] var0) {
      int[] var1 = new int[10];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = generateOTP();
      }

      System.out.println("Generated OTPs:");

      for(int var5 : var1) {
         System.out.println(var5);
      }

      if (areUnique(var1)) {
         System.out.println("\nAll OTPs are unique.");
      } else {
         System.out.println("\nDuplicate OTP(s) found.");
      }

   }
}