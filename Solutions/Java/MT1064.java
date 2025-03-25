import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double a = input.nextDouble();
      System.out.printf("%.6f", Math.pow(a, 2) * 6);
      input.close();
   }
}
