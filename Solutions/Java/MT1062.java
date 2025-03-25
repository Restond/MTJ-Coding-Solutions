import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double r = input.nextDouble();
      double h = input.nextDouble();
      double PI = 3.1415926;
      System.out.printf("%.6f", PI * r * (r + Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2))));
      input.close();
   }
}
