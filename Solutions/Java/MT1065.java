import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double l = input.nextDouble();
      double h = input.nextDouble();
      double w = input.nextDouble();
      
      System.out.printf("%.6f", l*h*2+l*w*2+h*w*2);
      input.close();
   }
}
