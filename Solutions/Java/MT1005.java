import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float num1 = input.nextFloat();
      double num2 = input.nextDouble();
      System.out.printf("You entered:%.2f and %.3f", num1, num2);
      input.close();
   }
}
