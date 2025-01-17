package q2292;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		int i = 1;
		int judge = 1;

		int start = 2; // 시작점 첫째항
		int last = 0;

		while (true) {

			if (num == 1) {
				System.out.println("1");
				break;
			}

			int last_up = 6 * i - 1; // 끝점 공차
			last = start + last_up;
			judge++;

			if (start <= num && num <= last) {
				System.out.println(judge);
				break;
			}

			start = last + 1; // 다음 구간의 시작점은 끝점에서 1만 증가
			i++;
		}
	}
}
