import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String[] pairs = input.nextLine().split(",");

      int a = 0, c = 0;
      char b = ' ', d = ' ';
      
      for (String pair: pairs) {
        String[] keyValue = pair.split("=");
        String key = keyValue[0];
        String value = keyValue[1];

        switch(key) {
            case "a": a = Integer.parseInt(value); break;
            case "b": b = value.charAt(0); break;
            case "c": c = Integer.parseInt(value); break;
            case "d": d = value.charAt(0); break;
        }
      }

      System.out.printf("%d %c %d %c", a, b, c, d);
      input.close();
   }
}
