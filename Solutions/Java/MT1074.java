import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        double sqrt = Math.sqrt(n);
        double lg = Math.log10(n);
        double ln = Math.log(n);

        System.out.printf("%.2f %.2f %.2f", sqrt, ln, lg);

        sc.close();
    }
}
