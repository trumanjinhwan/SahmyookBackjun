package q2438;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Scanner sc = new Scanner(System.in); int num = sc.nextInt(); sc.close();
		 * 
		 * for (int i = 1; i <= num; i++) { for(int j = 0; j < i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 * 
		 * }
		 */

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		for (int i = 1; i <= num; i++) {
			for (int k = num - 1; k >= i; k--) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
