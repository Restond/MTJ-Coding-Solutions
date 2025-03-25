import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      int segments = n * (n - 1) / 2;
      System.out.println(segments);
      input.close();
   }
}
