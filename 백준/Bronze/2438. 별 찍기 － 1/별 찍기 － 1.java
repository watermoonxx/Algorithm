import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=1; i<num+1; i++) {
            String star = "*".repeat(i);
            System.out.println(star);

        /*
        for (int i=1; i<tc+1; i++) {
            StringBuilder star = new StringBuilder("*");
            System.out.println(star.toString().repeat(i));
        }
        */
    }
} 
