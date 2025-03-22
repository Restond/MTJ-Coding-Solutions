import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      final double PI = 3.1415926;

      Scanner input = new Scanner(System.in);
      double a = input.nextDouble();

      double area = PI * a * a;
      double circumference = 2 * PI * a;

      System.out.printf("Area=%.6f\n", area);
      System.out.printf("Circumference=%.6f", circumference);

      input.close();
   }
}
