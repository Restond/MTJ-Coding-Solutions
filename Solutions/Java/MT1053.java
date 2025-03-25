import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = input.nextDouble();

        double theta = input.nextDouble();
        theta = Math.toRadians(theta);

        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);

        System.out.printf("%.2f,%.2f", x, y);
    }
}
