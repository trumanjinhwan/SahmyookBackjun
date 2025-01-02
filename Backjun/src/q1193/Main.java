package q1193;

public class Main {
	static String[][] arr = new String [10][10];
	
	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i + 1) + "/" + (j + 1);  // 분수 형태로 저장
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
