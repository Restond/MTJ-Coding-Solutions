import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str0 = sc.nextLine().split(" ");

        String[] str1 = str0[0].split("/");
        String[] str2 = str0[1].split("/");

        int num_str1_0 = Integer.parseInt(str1[0]);
        int num_str1_1 = Integer.parseInt(str1[1]);
        int num_str2_0 = Integer.parseInt(str2[0]);
        int num_str2_1 = Integer.parseInt(str2[1]);

        System.out.printf("%d/%d + %d/%d=%.6f\n", num_str1_0, num_str1_1, num_str2_0, num_str2_1, ((double)num_str1_0 / (double)num_str1_1 + (double)num_str2_0 / (double)num_str2_1));
        System.out.printf("%d/%d - %d/%d=%.6f\n", num_str1_0, num_str1_1, num_str2_0, num_str2_1, ((double)num_str1_0 / (double)num_str1_1 - (double)num_str2_0 / (double)num_str2_1));
        System.out.printf("%d/%d * %d/%d=%.6f\n", num_str1_0, num_str1_1, num_str2_0, num_str2_1, (((double)num_str1_0 / (double)num_str1_1) * ((double)num_str2_0 / (double)num_str2_1)));
        System.out.printf("%d/%d / %d/%d=%.6f\n", num_str1_0, num_str1_1, num_str2_0, num_str2_1, (((double)num_str1_0 / (double)num_str1_1) / ((double)num_str2_0 / (double)num_str2_1)));

        sc.close();
    }
}
