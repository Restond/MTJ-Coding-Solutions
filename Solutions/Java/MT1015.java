import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] pairs = input.nextLine().split(",");

      for (String pair: pairs) {
        String[] keyValue = pair.split("=");
        System.out.print(keyValue[1] + " ");
      }
      input.close();
   }
}
