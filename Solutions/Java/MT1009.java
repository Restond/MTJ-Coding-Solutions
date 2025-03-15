import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        double num3 = (1 / 2.0) * (num1 * num2 + (num1 + num2) / (4.0 * num2));
        System.out.printf("%.2f", num3);
        input.close();
    }
}
