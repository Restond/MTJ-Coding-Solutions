import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputs = input.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);

        int gcd = divisor(a, b);
        int lcm = (a * b) / gcd;

        System.out.println(lcm);
        input.close();
    }

    static int divisor(int x, int y) {
        int temp;
        
        while (y != 0) {
            temp = x % y;
            x = y;
            y = temp;
        }
        
        return x;
    }
}
