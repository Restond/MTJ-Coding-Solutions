import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double r = input.nextDouble();
      double l = input.nextDouble();

      double a = (57.296 * l) / r;

      System.out.printf("%.2f", a);
      
      input.close();
   }
}
