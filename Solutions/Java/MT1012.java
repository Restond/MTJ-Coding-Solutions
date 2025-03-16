import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Size of int: " + Integer.SIZE/8 + " bytes");
      System.out.println("Size of float: " + Float.SIZE/8 + " bytes");
      System.out.println("Size of double: " + Double.SIZE/8 + " bytes");
      System.out.println("Size of char: " + Character.SIZE/16 + " byte");
      input.close();
   }
}
