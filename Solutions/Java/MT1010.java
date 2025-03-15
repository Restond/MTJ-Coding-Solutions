import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split(",");
        char str1 = str[0].charAt(0);
        char str2 = str[1].charAt(0);
        System.out.println("The ASCII code of " + str[0] + " is " + (int)str1);
        System.out.println("The ASCII code of " + str[1] + " is " + (int)str2);
        input.close();
    }
}
