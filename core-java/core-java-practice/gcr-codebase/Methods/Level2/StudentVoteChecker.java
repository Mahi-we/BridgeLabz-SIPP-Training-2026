import java.util.Scanner;

public class StudentVoteChecker {
   public StudentVoteChecker() {
   }

   public boolean canStudentVote(int var1) {
      if (var1 < 0) {
         return false;
      } else {
         return var1 >= 18;
      }
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int[] var2 = new int[10];
      StudentVoteChecker var3 = new StudentVoteChecker();

      for(int var4 = 0; var4 < var2.length; ++var4) {
         System.out.print("Enter age of student " + (var4 + 1) + ": ");
         var2[var4] = var1.nextInt();
         if (var3.canStudentVote(var2[var4])) {
            System.out.println("Student " + (var4 + 1) + " can vote.");
         } else {
            System.out.println("Student " + (var4 + 1) + " cannot vote.");
         }
      }

      var1.close();
   }
}