package q10845;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		Scanner sc = new Scanner(System.in);
		int start = 1;
		int end = sc.nextInt();

		while (start <= end) {
			String command = sc.next();

			switch (command) {

			case ("push"):
				int value = sc.nextInt();
				queue.offer(value);
				break;

			case ("pop"):
				System.out.println((queue.isEmpty() ? -1 : queue.poll()));
				break;

			case ("size"):
				System.out.println(queue.size());
				break;

			case ("empty"):
				System.out.println((queue.isEmpty() ? 1 : 0));
				break;

			case ("front"):
				System.out.println((queue.isEmpty() ? -1 : queue.peek()));
				break;

			case ("back"):
				System.out.println((queue.isEmpty()) ? -1 : queue.toArray()[queue.size() - 1]);
				break;

			default:
				System.out.println("오류 발생");
				break;
			}
			start += 1;
		}

		sc.close();

	}

}
