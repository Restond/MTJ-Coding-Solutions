import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] value = input.nextLine().split("");

      for(int i = 0; i < value.length; i++) {
        System.out.print(value[value.length - 1 - i]);
      }

      input.close();
   }
}
