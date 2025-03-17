import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] str = input.nextLine().split("/");
      
      String year = String.format("%04d", Integer.parseInt(str[2]));
      String month = String.format("%02d", Integer.parseInt(str[0]));
      String day = String.format("%02d", Integer.parseInt(str[1]));

      System.out.println(year + month + day);
      input.close();
   }
}
