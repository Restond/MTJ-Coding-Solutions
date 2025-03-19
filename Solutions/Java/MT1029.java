import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] str = input.nextLine().split("");

      System.out.print(str.length);

      input.close();
   }
}
