import java.util.Scanner;

public class Gokul20 {
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("enter number :");
      int var2 = var1.nextInt();
      switch (var2) {
         case 1 -> System.out.println("Monday");
         case 2 -> System.out.println("Tuesday");
         case 3 -> System.out.println("Wednesday");
         case 4 -> System.out.println("Thursday");
         case 5 -> System.out.println("Friday");
         case 6 -> System.out.println("Saturday");
         case 7 -> System.out.println("Sunday");
         default -> System.out.println("Invalid day");
      }

   }
}
