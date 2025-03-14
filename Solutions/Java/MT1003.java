import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] inputs = input.nextLine().split("\\s*,\\s*");
      int num1 = Integer.parseInt(inputs[0]);
      int num2 = Integer.parseInt(inputs[1]);
      System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
      System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
      input.close();
   }
}
