import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      String[] value = input.nextLine().split("");
      System.out.println(value[1] + value[0]);

      input.close();
   }
}
