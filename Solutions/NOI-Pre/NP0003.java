import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int age = input.nextInt();
     
      if (age >= 1984 && age <= 2024) {
        System.out.println(age - 1983);
      }
     
      input.close();
   }
}
