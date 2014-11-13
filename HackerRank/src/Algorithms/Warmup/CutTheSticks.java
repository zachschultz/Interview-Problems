package HackerRank.src.Algorithms.Warmup;
import java.util.*;



public class CutTheSticks {
	
	public static void cutSticks(ArrayList<Integer> sticks) {
		int min = Integer.MAX_VALUE;
		int cuts = 0;
		
		// Done with recursion
		if (sticks.isEmpty())
			return;
		// Find the smallest stick size
		for (int stick : sticks) {
			if (stick < min) 
				min = stick;
		}
		
		for (int i = 0; i < sticks.size(); i++) {
			int temp = sticks.get(i) - min;
			// Remove stick from group, i-- to adjust for index change after removal
			if (temp == 0) {
				sticks.remove(i);
				i--;
			}
			// If not removing, adjust stick size to the newly cut one
			else {
				sticks.set(i, temp);
			}
			// Increment the amount of cuts taken
			cuts++;
		}
		
		// Output for solution
		System.out.println(cuts);
		// Recursive call to cut the new group of sticks
		cutSticks(sticks);
		
		
	}

	public static void main(String[] args){
		String input = "6\n5 4 4 2 2 8";
		
    	Scanner in = new Scanner(input);
    	
    	int T = in.nextInt();
    	ArrayList<Integer>sticks = new ArrayList<Integer>();
    	
    	for (int i = 0; i < T; i++) {
    		sticks.add(i,in.nextInt());
    	}
    	
    	cutSticks(sticks);
	}
}
