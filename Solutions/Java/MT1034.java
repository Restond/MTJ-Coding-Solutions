import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();

    for (int i = 1; i <= n; i++) {
      if (i % 2 == 0 && Math.pow(i, 2) <= n) {
        System.out.println((int) Math.pow(i, 2));
      }
    }

    input.close();
  }
}
