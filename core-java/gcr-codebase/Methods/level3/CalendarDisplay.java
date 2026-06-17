import java.io.PrintStream;
import java.util.Scanner;

public class CalendarDisplay {
   static String[] months = new String[]{"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
   static int[] daysInMonth = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

   public CalendarDisplay() {
   }

   public static boolean isLeapYear(int var0) {
      return var0 % 400 == 0 || var0 % 4 == 0 && var0 % 100 != 0;
   }

   public static String getMonthName(int var0) {
      return months[var0 - 1];
   }

   public static int getDaysInMonth(int var0, int var1) {
      return var0 == 2 && isLeapYear(var1) ? 29 : daysInMonth[var0 - 1];
   }

   public static int getFirstDay(int var0, int var1) {
      int var2 = var0;
      int var3 = var1;
      if (var0 < 3) {
         var2 = var0 + 12;
         var3 = var1 - 1;
      }

      byte var4 = 1;
      int var5 = var3 % 100;
      int var6 = var3 / 100;
      int var7 = (var4 + 13 * (var2 + 1) / 5 + var5 + var5 / 4 + var6 / 4 + 5 * var6) % 7;
      return (var7 + 6) % 7;
   }

   public static void displayCalendar(int var0, int var1) {
      int var2 = getFirstDay(var0, var1);
      int var3 = getDaysInMonth(var0, var1);
      PrintStream var10000 = System.out;
      String var10001 = getMonthName(var0);
      var10000.println("\n      " + var10001 + " " + var1);

      for(int var4 = 0; var4 < var2; ++var4) {
         System.out.print("    ");
      }

      for(int var5 = 1; var5 <= var3; ++var5) {
         System.out.printf("%3d ", var5);
         if ((var5 + var2) % 7 == 0) {
            System.out.println();
         }
      }

      System.out.println();
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter Month (1-12): ");
      int var2 = var1.nextInt();
      System.out.print("Enter Year: ");
      int var3 = var1.nextInt();
      displayCalendar(var2, var3);
      var1.close();
   }
}