package q10828;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<Integer> list = new ArrayList<>();
	
	static void push(int num) {
		list.add(num);
	}
	
	static void pop(){
		 System.out.printf("%d\n", (list.isEmpty() ? -1 : list.remove(list.size() - 1)));
		}
	
	
	static void size() {
		System.out.println(list.size());
	}
	
	static void empty() {
		System.out.printf("%d\n", (list.size() == 0 ? 1 : 0));
	}
	
	static void top() {
		System.out.printf("%d\n", (list.isEmpty() ? -1 : list.get(list.size() - 1)));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.nextLine();
		int y = 1;
		while(y <= x) {
			String z = sc.nextLine();
			Scanner sc2 = new Scanner(z);
			
			switch (sc2.next()) {
			case ("push"):
				push(sc2.nextInt());
				break;
				
			case ("pop"):
				pop();
				break;
				
			case ("size"):
				size();
				break;
				
			case ("empty"):
				empty();
				break;
				
			case ("top"):
				top();
				break;
				
			default:
				break;
				
			}
			y++;
			sc2.close();
		}
		sc.close();
	}

}
