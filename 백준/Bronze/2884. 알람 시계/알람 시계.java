import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min >= 45) {
            min -= 45;
        } else {
            if (hour == 0) {
                min += 15; // 60-45+min 
                hour = 23;
            } else {
                min += 15; 
                hour -= 1;
            }
        }
        System.out.println(hour + " " + min);
    }  
} 