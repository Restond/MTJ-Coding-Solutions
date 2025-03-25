import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double r = input.nextDouble();
      double a = input.nextDouble();

      double l = 0.01745 * r * a;

      System.out.printf("%.2f", l);
      
      input.close();
   }
}
