import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("128 " + Integer.toOctalString(128) + " " + Integer.toHexString(128).toUpperCase());
      System.out.println("456789 " + Integer.toOctalString(456789) + " " + Integer.toHexString(456789).toUpperCase());
      input.close();
   }
}
