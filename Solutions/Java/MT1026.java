import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      int a = input.nextInt();
      int b = input.nextInt();
      int c = input.nextInt();

      System.out.print(a * 100 + b * 10 + c);

      input.close();
   }
}
