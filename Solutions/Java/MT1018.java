import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String value = input.nextLine();

      int a1 = Integer.parseInt(value.substring(0, 3));
      int a2 = Integer.parseInt(value.substring(3, 6));
      int a3 = Integer.parseInt(value.substring(6, 9));
      
      System.out.print(a1 + " " + a2 + " " + a3);
      input.close();
   }
}
