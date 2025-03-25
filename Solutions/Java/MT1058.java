import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double r = input.nextDouble();
      double c = input.nextDouble();

      double h = r - 0.5 * Math.sqrt(4 * r * r - c * c);

      System.out.printf("%.2f", h);
      
      input.close();
   }
}
