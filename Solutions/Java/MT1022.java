import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      double a = 3.1415926;
      double b = 12345678.123456789;
      String String_a = String.format("%e", a).replace("e+", "e+0");
      String String_b = String.format("%e", b).replace("e+", "e+0");
      System.out.printf("%.6f %s\n", a, String_a);
      System.out.printf("%.6f %s", b, String_b);
      input.close();
   }
}
