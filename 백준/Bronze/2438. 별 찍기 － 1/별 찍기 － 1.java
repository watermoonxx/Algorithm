import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int tc = sc.nextInt();
    for (int i=1; i<tc+1; i++) {
        StringBuilder star = new StringBuilder("*");
        System.out.println(star.toString().repeat(i));
    }
  }
}
