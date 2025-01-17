package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();
		int start = 1;

		int count = 0;
		while (start <= end) {
			int sum = 0;
			String str = sc.next();
			for (char c : str.toCharArray()) {
				if (c == 'O') { // 'O'일 때 count 누적
					count += 1;
					sum += count;
				} else { // 'X'일 때 count 0으로 초기화
					count = 0;
					sum += count;
				}
			}
			count = 0; // 다음 문자열을 위해 0으로 초기화
			start += 1;
			System.out.println(sum);
		}
		sc.close();
	}
}
