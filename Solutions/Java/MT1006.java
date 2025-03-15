import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.printf("%f*%f=%f\n", num1, num2, num1 * num2);
        System.out.printf("%f/%f=%f\n", num1, num2, num1 / num2);
        input.close();
    }
}
