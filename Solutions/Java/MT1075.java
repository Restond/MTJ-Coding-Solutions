import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sqrt = Math.sqrt(n);
        
        System.out.printf("%d", (int)sqrt);

        sc.close();
    }
}
