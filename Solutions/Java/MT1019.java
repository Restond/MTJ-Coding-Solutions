import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int a = input.nextInt();
      int b = input.nextInt();
      double c = 18.16054;
      double d = 17.676767;
      System.out.printf("%" + a + "." + b + "f %" + a + "." + b + "f%n", c, d);
      input.close();
   }
}
