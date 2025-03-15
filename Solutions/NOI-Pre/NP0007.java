import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if (a < 1 || a > 1000 || b < 1 || b > 1000) {
            System.exit(1);
        }
        
        int C = 2 * a + 2 * b;
        int S = a * b;
        
        System.out.printf("%d %d", C, S);
        
        scanner.close();
    }
}
