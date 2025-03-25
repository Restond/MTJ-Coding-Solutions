import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double c = input.nextDouble();
      double h = input.nextDouble();

      double r = (c * c + 4 * h * h) / (8 * h);

      System.out.printf("%.2f", r);
      
      input.close();
   }
}
