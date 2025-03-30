import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && isLucky(i)) {
                System.out.println("YES");
                System.exit(0);
            }
        }

        System.out.println("NO");

        sc.close();
    }

    public static boolean isLucky (int value) {
        if (value == 0) {
            return false;
        }
        while (value != 0) {
            if (value % 10 != 4 && value % 10 != 7) {
                return false;
            }
            value /= 10;
        }
        return true;
    }
}
