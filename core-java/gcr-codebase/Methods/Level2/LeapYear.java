import java.util.Scanner;

public class LeapYear {
   public LeapYear() {
   }

   public static boolean isLeapYear(int var0) {
      if (var0 < 1582) {
         return false;
      } else {
         return var0 % 4 == 0 && var0 % 100 != 0 || var0 % 400 == 0;
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter a year: ");
      int var2 = var1.nextInt();
      if (var2 < 1582) {
         System.out.println("The LeapYear program only works for years >= 1582.");
      } else if (isLeapYear(var2)) {
         System.out.println(var2 + " is a Leap Year.");
      } else {
         System.out.println(var2 + " is not a Leap Year.");
      }

      var1.close();
   }
}