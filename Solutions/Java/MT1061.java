import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double r = input.nextDouble();
      double h = input.nextDouble();
      double PI = 3.1415926;
      double V = 1/3.00 * PI * r * r * h;
      System.out.printf("%.6f", V);
      input.close();
   }
}
