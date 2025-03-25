import java.util.*;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double PI = 3.1415926;
      double r = input.nextDouble();
      double h = input.nextDouble();
      double Area = PI * r * (r + Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2)));

      System.out.printf("Surface area=%.2f", Area);
      
      input.close();
   }
}
