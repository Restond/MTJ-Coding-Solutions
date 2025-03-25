import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        int x3 = input.nextInt();
        int y3 = input.nextInt();
        int x4 = input.nextInt();
        int y4 = input.nextInt();

        double s1 = 0.5 * Math.abs(x1 * y2 - x1 * y3 + x2 * y3 - x2 * y1 + x3 * y1 - x3 * y2);
        double s2 = 0.5 * Math.abs(x1 * y2 - x1 * y4 + x2 * y4 - x2 * y1 + x4 * y1 - x4 * y2);
        double s3 = 0.5 * Math.abs(x4 * y2 - x4 * y3 + x2 * y3 - x2 * y4 + x3 * y4 - x3 * y2);
        double s4 = 0.5 * Math.abs(x1 * y4 - x1 * y3 + x4 * y3 - x4 * y1 + x3 * y1 - x3 * y4);

        double S = (s1 + s2 + s3 + s4) / 2;

        System.out.printf("%.2f", S);

        input.close();
    }
}
