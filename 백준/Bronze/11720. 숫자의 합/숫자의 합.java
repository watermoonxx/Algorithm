import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        String nums = sc.next();
        int sum = 0;
          
        for (int i=0; i<tc; i++) {
            sum += nums.charAt(i) - '0'; 
          /*
            sum이 int형 변수이므로 해당하는 문자의 10진수가 저장된다 
            ex. 문자 '5'는 10진수로 53이므로 53이 저장됨 
            10진수 53에서 48(문자 '0')을 빼서 숫자 5를 저장 
          */
        }
        System.out.println(sum);
    } 
} 