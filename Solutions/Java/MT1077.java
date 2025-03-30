import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = String.valueOf(n);

        int length_n = s.length();

        for (int i = 0; i < length_n; i++) {
            int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
            
            if (temp != 4 && temp != 7) {
                System.out.print("NO");
                break;
            }

            if (i == s.length() - 1) {
                System.out.print("YES");
            }
        }

        sc.close();
    }
}
