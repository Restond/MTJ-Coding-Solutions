import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] str = input.nextLine().split("/");

      int a = Integer.parseInt(str[0]);
      int b = Integer.parseInt(str[1]);
      int divisor = divisor(a, b);

      System.out.print(a / divisor + "/" + b / divisor);

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
