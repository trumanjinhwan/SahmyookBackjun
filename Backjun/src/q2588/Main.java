package q2588;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num1 = sc.next();
		String num2 = sc.next();
		sc.close();

		Mul mul = new Mul(num1, num2);
		mul.print(mul.line1Print(), mul.line2Print(), mul.line3Print());

	}

}

class Mul {
	private String num1;
	private String num2;

	Mul(String num1, String num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	String line1Print() {
		int num2_third = Integer.parseInt(String.valueOf(this.num2.charAt(2))); // 5

		int num1_third = Integer.parseInt(String.valueOf(this.num1.charAt(2))); // 2
		String res1 = String.valueOf(num1_third * num2_third); // "10"
		int line1_fourth = (res1.length() == 1) ? Integer.parseInt(String.valueOf(res1.charAt(0)))
				: Integer.parseInt(String.valueOf(res1.charAt(1))); // 0

		int num1_second = Integer.parseInt(String.valueOf(this.num1.charAt(1))); // 7
		String res2 = String.valueOf(num1_second * num2_third); // "35"
		int line1_third = (res1.length() == 1) ? Integer.parseInt(String.valueOf(res2.charAt(0)))
				: Integer.parseInt(String.valueOf(res2.charAt(1))) + Integer.parseInt(String.valueOf(res1.charAt(0))); // 6

		int num1_first = Integer.parseInt(String.valueOf(this.num1.charAt(0))); // 4
		String res3 = String.valueOf(num1_first * num2_third); // "20"
		int line1_fs = Integer.parseInt(res3) + Integer.parseInt(String.valueOf(res2.charAt(0))); // 20 + 3 = 23

		String line1 = String.format("%d%d%d", line1_fs, line1_third, line1_fourth);
		System.out.println(line1);

		return line1;
	}

	String line2Print() {
		int num2_second = Integer.parseInt(String.valueOf(this.num2.charAt(1))); // 8

		int num1_third = Integer.parseInt(String.valueOf(this.num1.charAt(2))); // 2
		String res1 = String.valueOf(num1_third * num2_second); // "16"
		int line1_fourth = (res1.length() == 1) ? Integer.parseInt(String.valueOf(res1.charAt(0)))
				: Integer.parseInt(String.valueOf(res1.charAt(1))); // 0

		int num1_second = Integer.parseInt(String.valueOf(this.num1.charAt(1))); // 7
		String res2 = String.valueOf(num1_second * num2_second); // "54"
		int line1_third = (res1.length() == 1) ? Integer.parseInt(String.valueOf(res2.charAt(0)))
				: Integer.parseInt(String.valueOf(res2.charAt(1))) + Integer.parseInt(String.valueOf(res1.charAt(0))); // 6

		int num1_first = Integer.parseInt(String.valueOf(this.num1.charAt(0))); // 4
		String res3 = String.valueOf(num1_first * num2_second); // "32"
		int line1_fs = Integer.parseInt(res3) + Integer.parseInt(String.valueOf(res2.charAt(0))); // 32 + 5 = 37

		String line2 = String.format("%d%d%d", line1_fs, line1_third, line1_fourth);
		System.out.println(line2);

		return line2;
	}

	String line3Print() {
		int num2_first = Integer.parseInt(String.valueOf(this.num2.charAt(0))); // 3

		int num1_third = Integer.parseInt(String.valueOf(this.num1.charAt(2))); // 2
		String res1 = String.valueOf(num1_third * num2_first); // "6"
		int line1_fourth = (res1.length() == 1) ? Integer.parseInt(String.valueOf(res1.charAt(0)))
				: Integer.parseInt(String.valueOf(res1.charAt(1)));

		int num1_second = Integer.parseInt(String.valueOf(this.num1.charAt(1))); // 7
		String res2 = String.valueOf(num1_second * num2_first); // "21"
		int line1_third = (res1.length() == 1) ? Integer.parseInt(String.valueOf(res2.charAt(1)))
				: Integer.parseInt(String.valueOf(res2.charAt(1))) + Integer.parseInt(String.valueOf(res1.charAt(0))); //

		int num1_first = Integer.parseInt(String.valueOf(this.num1.charAt(0))); // 4
		String res3 = String.valueOf(num1_first * num2_first); // "12"
		int line1_fs = Integer.parseInt(res3) + Integer.parseInt(String.valueOf(res2.charAt(0))); // 12 + 2 = 14

		String line3 = String.format("%d%d%d", line1_fs, line1_third, line1_fourth);
		System.out.println(line3);

		return line3;
	}

	void print(String line1, String line2, String line3) {
		int l_line1 = Integer.parseInt(line1);
		int l_line2 = Integer.parseInt(line2) * 10;
		int l_line3 = Integer.parseInt(line3) * 100;

		String last = String.valueOf(l_line1 + l_line2 + l_line3);

		System.out.println(last);
	}
}
