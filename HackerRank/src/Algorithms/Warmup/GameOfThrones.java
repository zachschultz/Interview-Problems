package HackerRank.src.Algorithms.Warmup;
import java.util.ArrayList;
import java.util.Scanner;

public class GameOfThrones {
	

	public static void main(String[] args) {
		String input = "aaabbbb";
		String ans;
        Scanner myScan = new Scanner(input);
        String inputString = myScan.nextLine();
        
        // Create new alphabet-length array to store occurrences of each
        //	letter
        int[] count = new int[26];
        int even = 0, odd = 0;
        for (int i = 0; i < input.length(); i++) {
        	// 'a'-'a' = 97-97 = 0
        	// 'b'-'a' = 98-97 = 1...
        	// will store occurrence of each letter in its respective index
        	count[inputString.charAt(i)-'a']++;
        }
        
        // Find out if each character occurs an even or odd amount
        //	of times
        // If you have more than 1 character occurring an odd amount of times
        //	then you can't have a palindrome anagram of the string
        for (int i = 0; i < 26; i++) {
        	if (count[i] % 2 == 0) even++;
        	else odd++;
        }
        if (odd <= 1)
        	ans = "YES";
        else 
			ans = "NO";
        
        System.out.println(ans);
		
        myScan.close();
    }

}
