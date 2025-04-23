import java.util.Scanner;

class isprime {

   public static boolean prime(int n) {
      // num is less then 2
      if (n < 2) {
         return false;
      }

      for (int i = 2; i < n; i++) {
         if (n % i == 0) {
            return false;
         }

      }
      return true;

   }

   public static void main(String args[]) {

      System.out.println("Enter any number: ");
      Scanner scan = new Scanner(System.in);
      int my_num = scan.nextInt();

      System.out.println(prime(my_num));
   }
}