import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String[] nums = input.nextLine().split(" ");
    
    int x = Integer.parseInt(nums[0]);
    int y = Integer.parseInt(nums[1]);

    System.out.println((int) Math.pow(x + y, 3));
    input.close();
  }
}
