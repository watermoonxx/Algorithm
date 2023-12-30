import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        int addHour = (min + time) / 60; 
        int addMin = (min + time) % 60;
        hour = (hour + addHour) % 24;
        min = addMin;
        System.out.println(hour + " " + min);
    } 
} 