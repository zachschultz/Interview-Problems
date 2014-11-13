package HackerRank.src.Algorithms.Search;

import java.util.Scanner;


public class ManasaAndStones {

	public static void solver(int n, int a, int b) {
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		n -= 1;
		int val = n * a;
		int dval = b - a;
		
		System.out.print(val);
		if (dval > 0) {
			while (n > 0) {
				System.out.print(" " + (val += dval));
				n--;
			}
		}
		System.out.println();
		
			
		
	}
	
	public static void main(String[] args) {
		String input = "2\n3\n1\n2\n4\n10\n100";
		Scanner in = new Scanner(input);
		
		int T = in.nextInt();
		int index = 0;
		int n = 0, a = 0, b = 0;
		
		while (index < T) {
			n = in.nextInt();
			a = in.nextInt();
			b = in.nextInt();
			solver(n, a, b);
			index++;
		}
		
	}
}
