import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();

      double area = (a + b) * c / 2;

      System.out.printf("%.2f", area);
      input.close();
   }
}
