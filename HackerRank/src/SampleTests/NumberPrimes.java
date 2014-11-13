package HackerRank.src.SampleTests;

import java.util.*;

public class NumberPrimes {
	
	static boolean isPrime(int num) {
		for (int i = 2; i < Math.sqrt(num)+1; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	static int getNumberOfPrimes(int N) {
		int count = 0;
		for (int i = 1; i <= N; i++) {
			if (i % 2 == 0) {
				continue;
			}
			if (isPrime(i)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;
		int _a;
		_a = in.nextInt();
		res = getNumberOfPrimes(_a);
		System.out.println(res);
	}
}


