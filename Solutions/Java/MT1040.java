import java.util.Scanner;

class Main {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int N = input.nextInt();

       String str = Integer.toBinaryString(N);
       char[] arr = str.toCharArray(); 

       String reversedStr = new StringBuilder(new String(arr)).reverse().toString();
       arr = reversedStr.toCharArray();  

       for(int i = 1; i < arr.length; i += 2) {
           arr[i] = '0';
       }

       String reversedStr1 = new StringBuilder(new String(arr)).reverse().toString();
       int result = Integer.parseInt(reversedStr1, 2);

       System.out.println(result);

       input.close();
   }
}
