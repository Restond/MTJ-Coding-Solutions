import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        double k = n + m;
        
        if (k >= 12) {
            k %= 12;
        }

        System.out.printf("%3.0f", k);

        sc.close();
    }
}
