import java.util.Scanner;

class Main {
    public final static double PI = 3.1415926;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.printf("%.2f\n", 2 * PI * num1);
        System.out.printf("%.2f\n", PI * Math.pow(num1, 2));
        System.out.printf("%.2f\n", 4 * PI * Math.pow(num1, 2));
        System.out.printf("%.2f\n", 4 / 3.00 * PI * Math.pow(num1, 3));
        System.out.printf("%.2f\n", PI * Math.pow(num1, 2) * num2);
        input.close();
    }
}
