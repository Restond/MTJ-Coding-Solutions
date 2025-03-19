import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        String str1 = str.substring(0, 3);
        
        System.out.printf("%6s", str1);
        input.close();
    }
}
