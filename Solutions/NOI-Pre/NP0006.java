import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        
        if (r < 1 || r > 1000) {
            System.exit(1);
        }
        
        double PI = 3.14;
        double C = 2 * PI * r;
        double S = PI * r * r;
        
        System.out.printf("%.2f %.2f", C, S);
        
        scanner.close();
    }
}
