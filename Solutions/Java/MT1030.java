import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] value = input.nextLine().split(" ");

      int num1 = Integer.parseInt(value[0]);
      int num2 = Integer.parseInt(value[1]);

      System.out.print(divisor(num1, num2));
      
      input.close();
   }

   static int divisor(int x, int y) {
      int temp;
      while (y != 0) {
          temp = x % y;
          x = y;
          y = temp;
      }
      return x;
   }
}
