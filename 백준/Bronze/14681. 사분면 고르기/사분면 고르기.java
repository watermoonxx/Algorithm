import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num_x = sc.nextInt();
        int num_y = sc.nextInt();

        if (num_x > 0) {
            if (num_y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (num_y > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }  
} 