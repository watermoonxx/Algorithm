import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        if ((min + time) < 59) {
            min += time;
        } else {
            hour += ((min + time) / 60);
            min = (min + time) % 60;
            if (hour > 23) {
                hour -= 24;
            }
        }
        System.out.println(hour + " " + min);
    } 
}