import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      float a = input.nextFloat();
      float b = input.nextFloat();

      double area = a * b / 2;

      System.out.printf("Area=%.2f", area);

      input.close();
   }
}
