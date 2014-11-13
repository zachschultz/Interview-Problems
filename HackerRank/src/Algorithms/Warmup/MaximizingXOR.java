package HackerRank.src.Algorithms.Warmup;
import java.util.*;

public class MaximizingXOR {
	
	public static void maximize(int l, int r) {
		int max = 0;
		
		// i starts at left int
		for (int i = l; i <= r; i++) {
			// j starts at i, increments all the way to r for a single iteration
			//	of i
			for (int j = i; j <= r; j++) {
				// ^ is XOR in Java
				int temp = i ^ j;
				if (temp > max)
					max = temp;
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		String input = "1\n10";

    	Scanner in = new Scanner(input);
   
    	int L = in.nextInt();
    	int R = in.nextInt();
 
    	maximize(L, R);
	}
}
