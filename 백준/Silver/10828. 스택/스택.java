import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<String> stack1 = new Stack<>();

		// BufferedReader 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc;
		try {
            tc = Integer.parseInt(br.readLine());
			for (int i=0; i<tc; i++) {
				String cmd = br.readLine();

				String[] arrStr = cmd.split(" ");
				switch (arrStr[0]) {
				case "push":
					stack1.push(arrStr[1]);
					break;
				case "top":
					if (stack1.isEmpty()) {
						int empty = -1;
						System.out.println(empty); // 스택이 비어 있는 경우
					} else {
						System.out.println(stack1.peek()); // top 정수 출력
					}
					break;
				case "size":
					System.out.println(stack1.size()); // 정수 개수
					break;
				case "empty":
					if (stack1.isEmpty()) {
						System.out.println(1);
					} else {
						System.out.println(0);
					}
					break;
				case "pop":
					if (stack1.isEmpty()) {
						int empty = -1;
						System.out.println(empty);
					} else {
						System.out.println(stack1.pop());
					}
					break;
				}
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}