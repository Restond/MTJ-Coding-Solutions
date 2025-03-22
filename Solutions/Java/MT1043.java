import java.util.Scanner;

class Main {
   final static double PI = 3.1415926;
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] inputs = input.nextLine().split(" ");

      double a = Double.parseDouble(inputs[0]);
      double b = Double.parseDouble(inputs[1]);

      double area = a * b * PI;

      System.out.printf("Area = %.6f", area);

      input.close();
   }
}
