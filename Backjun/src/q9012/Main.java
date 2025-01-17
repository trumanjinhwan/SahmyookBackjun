package q9012;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int end = sc.nextInt();
		//sc.nextLine();
		int start = 1;

		while (start <= end) {
			String str = sc.next();
			int count = 0;

			for (char i : str.toCharArray()) {
				if (i == '(') {
					count += 1;
				} else if (i == ')') {
					count -= 1;
					if (count < 0) {
						break; // 닫는 괄호가 더 많으면 끝 - > NO
					}
				}
			}

			System.out.println((count == 0) ? "YES" : "NO");
			start += 1;
		}

		sc.close();
	}
}
