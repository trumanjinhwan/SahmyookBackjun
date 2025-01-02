package q1913;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        int N = scanner.nextInt(); // 홀수 N
        int target = scanner.nextInt(); // 좌표를 찾을 숫자

        if (N % 2 == 0) {
            System.out.println("N은 홀수여야 합니다!");
            return;
        }

        // 달팽이 배열 생성
        int[][] matrix = generateSnailMatrix(N);

        // 달팽이 배열 출력
        printMatrix(matrix);

        // 좌표 찾기
        int[] position = findPosition(matrix, target);
        if (position != null) {
            System.out.printf("%d %d%n", position[0], position[1]);
        } else {
            System.out.println(target + "는 행렬에 없습니다.");
        }
    }

    // 달팽이 모양 행렬 생성
    public static int[][] generateSnailMatrix(int N) {
        int[][] matrix = new int[N][N];
        int x = N / 2, y = N / 2; // 중앙 시작
        int num = 1;             // 시작 숫자
        matrix[x][y] = num;

        int step = 1; // 이동 단계
        num++;

        while (step < N) {
            // 위로 이동
            for (int i = 0; i < step; i++) {
                x--;
                matrix[x][y] = num++;
            }

            // 오른쪽 이동
            for (int i = 0; i < step; i++) {
                y++;
                matrix[x][y] = num++;
            }

            step++;

            // 아래로 이동
            for (int i = 0; i < step; i++) {
                x++;
                matrix[x][y] = num++;
            }

            // 왼쪽 이동
            for (int i = 0; i < step; i++) {
                y--;
                matrix[x][y] = num++;
            }

            step++;
        }

        // 마지막 위쪽 이동
        for (int i = 0; i < step - 1; i++) {
            x--;
            matrix[x][y] = num++;
        }

        return matrix;
    }

    // 행렬 출력
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // 특정 숫자의 좌표 찾기
    public static int[] findPosition(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i + 1, j + 1}; // 1-based index
                }
            }
        }
        return null; // 찾지 못함
    }
}



