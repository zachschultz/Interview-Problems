package HackerRank.src.Algorithms.Warmup;
import java.util.Scanner;



public class HalloweenParty {

	public static void numPieces(int K) {
		long result = 0;
		long horizCuts = 0;
		long vertCuts = 0;
		
		if (K == 0) {
			System.out.println(result);
			return;
		}
		
		// Even number of cuts, so just a 'square', amount of individual
		//	pieces = length * width
		if (K % 2 == 0) {
			horizCuts = vertCuts = K / 2;
			result = horizCuts*vertCuts;
			System.out.println(result);
			
		}
		// Not even number, so horizontal will be .5 bigger than half
		//  while the vertical will be .5 smaller than the half
		//	number of pieces still length * width
		else {
			horizCuts = (K / 2) + 1;
			vertCuts = (K / 2);
			result = horizCuts*vertCuts;
			System.out.println(result);
		}
		
	}
	public static void main(String[] args) {

		String input = "6\n5\n0\n7\n8\n10\n15";
		
    	Scanner in = new Scanner(input);
    	
    	int T = in.nextInt();
    	
    	for (int i = 0; i < T; i++) {
    		numPieces(in.nextInt());
    	}

	}

}
