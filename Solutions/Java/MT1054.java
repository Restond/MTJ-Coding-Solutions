import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double r = input.nextDouble();
      double h = input.nextDouble();

      double C = 2 * Math.sqrt(h * (2 * r - h));

      System.out.printf("%.2f", C);
      
      input.close();
   }
}
