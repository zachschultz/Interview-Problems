package HackerRank.src.Algorithms.Warmup;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GemStones {

    public static void main(String[] args) 
    {
    	Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        String[] rocks = new String[N];
        int count = 0;
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        input.nextLine();
       
        for(int i = 0; i < N; i++)
        {
        	rocks[i] = input.nextLine();
        }

        // Only need to check against first rock
        for(int i = 0; i< rocks[0].length(); i++)
        {
        	boolean inAll = true;
        	char c = rocks[0].charAt(i);

        	if(!charMap.containsKey(c))
        	{
        		charMap.put(c, 1);
	        	for(int j = 0; j < rocks.length; j++)
	        	{
	        		if(!rocks[j].contains(String.valueOf(c)))
	        		{
	        			inAll = false;
	        			break;
	        		}
	        	}
	        }
	        else
	        {
	        	inAll = false;
	        }

        	if(inAll)
        		count++;
        }
        System.out.println(count);
    }
}