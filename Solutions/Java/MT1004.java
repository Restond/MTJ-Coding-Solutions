import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      int num3 = input.nextInt();
      int num4 = input.nextInt();
      System.out.printf("%d%%%d=%d\n", num1, num2, num1 % num2);
      System.out.printf("%d%%%d=%d", num3, num4, num3 % num4);
      input.close();
   }
}
