import java.util.Scanner;

class Main {
    final static double PI = 3.1415926;
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double a = input.nextDouble();
      double b = input.nextDouble();

      double area = b / 360 * PI * a * a;

      System.out.printf("%.6f", area);
      input.close();
   }
}
