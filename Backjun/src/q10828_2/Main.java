package q10828_2;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		// StringTokenizer st;

		int start = 1;
		int end = sc.nextInt();

		while (start <= end) {
			String command = sc.next();

			switch (command) {

			case ("push"):
				int value = sc.nextInt();
				stack.push(value);
				break;

			case ("pop"):
				System.out.println((stack.isEmpty() ? -1 : stack.pop()));
				break;

			case ("size"):
				System.out.println(stack.size());
				break;

			case ("empty"):
				System.out.println((stack.isEmpty() ? 1 : 0));
				break;

			case ("top"):
				System.out.println((stack.isEmpty() ? -1 : stack.peek()));
			}
			start += 1;
		}

		sc.close();
		// st.close();
	}
}
