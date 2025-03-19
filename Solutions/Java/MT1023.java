import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      System.out.print(num + " " + Integer.toOctalString(num) + " " + Integer.toHexString(num).toLowerCase() + " " + Integer.toUnsignedString(num));
      input.close();
   }
}
