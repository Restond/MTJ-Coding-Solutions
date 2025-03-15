import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        System.out.printf("%f\n", num1 + num2 + num3);
        System.out.printf("%f", (num1 + num2 + num3) / 3);
        input.close();
    }
}
