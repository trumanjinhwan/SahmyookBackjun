package q10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	/*
	 * static ArrayList<Integer> list = new ArrayList<>();
	 * 
	 * static void push(int num) { list.add(num); }
	 * 
	 * static int pop() { return list.isEmpty() ? -1 : list.remove(list.size() - 1);
	 * }
	 * 
	 * static int size() { return list.size(); }
	 * 
	 * static int empty() { return list.isEmpty() ? 1 : 0; }
	 * 
	 * static int top() { return list.isEmpty() ? -1 : list.get(list.size() - 1); }
	 */

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int y = 1;
		int x = Integer.parseInt(br.readLine());
		JinStack stack = new JinStack();

		while (y <= x) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String command = st.nextToken();

			switch (command) {
			case "push":
				stack.push(Integer.parseInt(st.nextToken()));
				break;

			case "pop":
				bw.write(stack.pop() + "\n");
				break;

			case "size":
				bw.write(stack.size() + "\n");
				break;

			case "empty":
				bw.write(stack.empty() + "\n");
				break;

			case "top":
				bw.write(stack.top() + "\n");
				break;

			default:
				break;
			}
			y += 1;
		}

		bw.flush(); 
		bw.close();
		br.close();
	}
}

class JinStack {

	ArrayList<Integer> list = new ArrayList<>();

	void push(int num) {
		list.add(num);
	}

	int pop() {
		return list.isEmpty() ? -1 : list.remove(list.size() - 1);
	}

	int size() {
		return list.size();
	}

	int empty() {
		return list.isEmpty() ? 1 : 0;
	}

	int top() {
		return list.isEmpty() ? -1 : list.get(list.size() - 1);
	}
}
