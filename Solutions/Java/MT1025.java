import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println(String.format("%d %04o 0X%02X", 202, 202, 202));
      System.out.println(String.format("%d %04o 0X%02X", 117, 117, 117));
      System.out.println(String.format("%d %04o 0X%02X", 70, 70, 70));
      System.out.println(String.format("%d %04o 0X%02X", 130, 130, 130));
      
      input.close();
   }
}
