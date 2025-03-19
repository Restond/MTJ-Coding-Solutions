import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        System.out.printf("%.6f %.2f %8.3f", num, num, num);
        input.close();
    }
}
