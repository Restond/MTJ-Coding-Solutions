import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int x = input.nextInt();

      int calculate = (int) (Math.pow(x, 6) - 2 * Math.pow(x, 5) + 3 * Math.pow(x, 4) - 5 * Math.pow(x, 2) + 6 * x + 7);

      System.out.println(calculate);
      input.close();
   }
}
