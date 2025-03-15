import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();
        
        int S = v * (n / (a + b));
        System.out.println(S);
      
        scanner.close();
    }
}
