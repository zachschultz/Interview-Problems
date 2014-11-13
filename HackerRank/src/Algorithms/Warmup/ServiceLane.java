package HackerRank.src.Algorithms.Warmup;
import java.util.*;

public class ServiceLane {
	
	public static void widthInterpreter(int _i, int _j, int[] _width){
		int i = _i;
		int j = _j;
		int[] width = _width;
		
		// Set vehicle constants, and min to be the largest (truck, 3)
		int min = 3;
        int truck = 3;
        int car = 2;
        int bike = 1;
        
        // Get smallest width in the service lane
        for (int x = i; x <= j; x++) {
            if (width[x] < min) {
                min = width[x];
            }
        }
        
        switch(min) {
            case 1: System.out.println(bike);
                break;
            case 2: System.out.println(car);
                break;
            case 3: System.out.println(truck);
                break;
        }
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String input = "8 5\n2 3 1 2 3 2 3 3\n0 3\n4 6\n6 7\n3 5\n0 7";
        
    	Scanner in = new Scanner(input);
        int N, T, index;
        N = in.nextInt();
        T = in.nextInt();
        
        index = 0;
        int[] width = new int[N];

        while (in.hasNextInt()) {
        	if (index == N-2) {
        		width[index] = Integer.parseInt(in.next()); 
        		width[++index] = Integer.parseInt(in.next()); 
        		break;
        	}	
            width[index] = Integer.parseInt(in.next()); 
            index++;
        }
        
        for (int x = 0; x < T; x++){
        	int _i = Integer.parseInt(in.next());
        	int _j = Integer.parseInt(in.next());
        	widthInterpreter(_i,_j, width);
        }
    
        
    }
}