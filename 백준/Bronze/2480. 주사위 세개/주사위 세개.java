import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int num3 = sc.nextInt();
      int result;

      if ((num1 == num2) && (num2 == num3)) {
        result = 10000 + (num1 * 1000); // 3개 일치 
      } else if ((num1 == num2) || (num1 == num3)) {
        result = 1000 + (num1 * 100); // 2개 일치
      } else if ((num2 == num3)) {
        result = 1000 + (num2 * 100); // 2개 일치
      } else { // 일치하지 않음 
        result = Math.max(num1, Math.max(num2, num3)) * 100;
      }
      System.out.println(result);
    } 
} 