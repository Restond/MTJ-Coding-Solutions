import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double r = input.nextDouble();
      double c = input.nextDouble();
      double h = input.nextDouble();
      double l = input.nextDouble();

      double f = 0.5 * (r * l - c * (r - h));

      System.out.printf("%.3f", f);
      
      input.close();
   }
}
