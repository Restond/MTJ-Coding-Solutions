import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int s = n * (n + 1) / 2 + 1;
      System.out.println(s);
      input.close();
   }
}
