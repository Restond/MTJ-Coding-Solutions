import java.util.ArrayList;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] inputs = input.nextLine().split(" ");
      
      ArrayList<Integer> position = new ArrayList<>();
      for(int i = 0; i < inputs.length; i++) {
        position.add(i, Integer.parseInt(inputs[i]));
      }

      double area = 0.5 * Math.abs(position.get(0) * position.get(3) + position.get(2) * position.get(5) + position.get(4) * position.get(1) - position.get(0) * position.get(5) - position.get(2) * position.get(1) - position.get(4) * position.get(3));
      
      System.out.printf("%.2f", area);
      input.close();
   }
}
