import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int integer = input.nextInt();
      System.out.print("You entered:" + integer);
      input.close();
   }
}
