package HackerRank.src.Algorithms.Warmup;


import java.io.*;
import java.util.*;

public class PracticeTest {

	public static void aP(ArrayList<Integer> numbers, int N) {
		int[] diffArray = new int[N-1];
		int diffIndex = 0;
		
		for (int i = 0; i < N-1; i++) {
			diffArray[i] = numbers.get(i+1) - numbers.get(i);
		}
		for (int i = 0; i < N-1; i++) {
			if (diffArray[i+1] != diffArray[i]){
				diffIndex = i+2;
				break;
			}
		}
		numbers.add(diffIndex, numbers.get(diffIndex-1)+diffArray[0]);
		
		System.out.println(numbers.get(diffIndex));
	}
	
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        String input = "5\n1 3 5 9 11";
        Scanner scanner = new Scanner(input);
        int N = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<Integer>(N);
        
        
        int index = 0;
        while (scanner.hasNext()) {
            numbers.add(scanner.nextInt());
            
        }
        
        aP(numbers, N);
        
    }
}