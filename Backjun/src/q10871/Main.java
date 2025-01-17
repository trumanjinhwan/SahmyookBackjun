package q10871;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int X = sc.nextInt();

		int[] arr = new int[A];
		for (int i = 0; i < A; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();

		/*
		 * ArrayList<Integer> arr2 = new ArrayList<>(); for(int i = 0; i < arr.length;
		 * i++) { if (arr[i] < X) { arr2.add(arr[i]); } else { continue; } }
		 */

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			} else {
				continue;
			}
		}

	}

}
