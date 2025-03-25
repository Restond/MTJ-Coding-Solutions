import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x = scanner.nextFloat();
        float y = scanner.nextFloat();

        float r, o, val;
        val = 180.0f / (float) Math.PI;
        r = (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        o = (float) Math.atan(y / x) * val;

        System.out.printf("%.1f %.1f", r, o);

        scanner.close();
    }
}
