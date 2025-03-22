import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] inputs = input.nextLine().split(" ");

      double a = Double.parseDouble(inputs[0]);
      double b = Double.parseDouble(inputs[1]);

      double area = a * b;
      double perimeter = a + a + b + b;

      System.out.printf("Area=%.6f\n", area);
      System.out.printf("Perimeter=%.6f", perimeter);

      input.close();
   }
}
