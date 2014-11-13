package HackerRank.src.Algorithms.Warmup;

import java.util.Scanner;


public class ChocolateFeast {
	
	public static void chocolates(int N, int C, int M) {
		int baseChocolates = N / C;
		int wrappers = N/C;
		//He now has baseChocolates amount of wrappers

		
		if (baseChocolates == M) {
			baseChocolates++;
			System.out.println(baseChocolates);
		}
		else if (baseChocolates < M){
			System.out.println(baseChocolates);
		}
		else {
			while (wrappers >= M) {
				wrappers -= M;
				baseChocolates++;
				wrappers++;
			}
			System.out.println(baseChocolates);
			
		}
		
	}
	
	public static void main(String[] args) {
		String input = "3\n10 2 5\n12 4 4\n 6 2 2";
		Scanner scan = new Scanner(input);
		
		int T = scan.nextInt();
		int N = 0, C = 0, M = 0;
		
		for (int i = 0; i < T; i++) {
			N = scan.nextInt();
			C = scan.nextInt();
			M = scan.nextInt();
			chocolates(N, C, M);
		}
	}

}
