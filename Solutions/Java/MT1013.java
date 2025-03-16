import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Size of int = " + Integer.SIZE/8 + " bytes");
      System.out.println("Size of long int = " + Long.SIZE/8 + " bytes");
      System.out.println("Size of long long int = " + Long.SIZE/8 + " bytes");
      System.out.println("Size of double = " + Double.SIZE/8 + " bytes");
      System.out.println("Size of long double = " + Double.SIZE*4/16 + " bytes");
      input.close();
   }
}
