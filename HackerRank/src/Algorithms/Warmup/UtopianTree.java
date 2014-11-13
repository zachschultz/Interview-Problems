package HackerRank.src.Algorithms.Warmup;
import java.util.*;

public class UtopianTree {

	public static void heightCalc(int _cycles) {
		int cycles = _cycles;
		// season = 0 -> summer (finalHeight*2)
		// season = 1 -> spring (finalHeight+1)
		int season = 0;
		int finalHeight = 1;
		
		for (int i = 0; i < cycles; i++) {
            if (season == 0) {
                finalHeight *= 2;
                season = 1;
            } else {
                finalHeight += 1;
                season = 0;
            }
        }
		System.out.println(finalHeight);
	}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	String input = "2\n3\n4";

    	Scanner in = new Scanner(input);
   
    	int T = in.nextInt();
   
    	for (int i = 0; i < T; i++) {
    		
    		heightCalc(in.nextInt());
    	}
    	
    }
}