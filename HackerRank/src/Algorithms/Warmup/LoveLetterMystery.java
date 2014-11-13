package HackerRank.src.Algorithms.Warmup;
import java.util.*;

public class LoveLetterMystery {
	
	public static void palindromeCreator(String word) {
		// Using a StringBuilder to easily adjust the entire string
		StringBuilder word_ = new StringBuilder(word);
		int count = 0;
		
		// First check if word is already a palindrome
		if (isPalindrome(word))
			System.out.println("0");
		
		// If not, find out min steps to make it one
		else {
			
			// Start at i = 1 so we can get 'tempBack' to be the last element
			for (int i = 1; i <= word.length() / 2; i++) {
				char tempFront = word.charAt(i-1);
				char tempBack = word.charAt(word.length()-i);
				// a < b, further down the alphabet gives a higher value
				if (tempFront < tempBack) {
					while (tempBack != tempFront) {
						// Keep going backwards through the alphabet until you
						//	match the other character
						tempBack--;
						count++;
					}
					word_.setCharAt(word.length()-i, tempBack);
				}
				else if (tempFront > tempBack) {
					while (tempBack != tempFront) {
						tempFront--;	
						count++;
					}
					word_.setCharAt(i-1, tempBack);					
				}
			}
			System.out.println(count);
		}
	}
	
	public static boolean isPalindrome(String word) {
		int length = word.length();
		String reverse = "";
		
		// Start at end, build 'reverse' string
		for (int i = length - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		// Check if the reversed string == the original one
		if (word.equals(reverse))
			return true;
		else 
			return false;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	String input = "3\nabc\nabcba\nabcd";
    	Scanner in = new Scanner(input);
    	
    	int T = in.nextInt();
    	for (int i = 0; i < T; i++) {
    		palindromeCreator(in.next());		
    	}
    
    }
}