import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int hundred = number / 100;
        int ten = number / 10 % 10;
        int units = number % 10;
        
        int total = hundred + ten + units;
        System.out.println(total);
    }
}
