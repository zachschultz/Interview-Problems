package CrackingTheCodingInterview.src;
import java.util.HashMap;
import java.util.Scanner;

public class PermutationCheck1_3 {
	
	public static boolean permutationCheck(String first, String second) {
		if (first.length() != second.length())
			return false;
		
		HashMap<String, Integer> firstMap = new HashMap<String, Integer>();
		HashMap<String, Integer> secondMap = new HashMap<String, Integer>();
		
		for (int i = 0; i < first.length(); i++) {
			char firstChar = first.charAt(i);
			char secondChar = second.charAt(i);
			String firstStr = Character.toString(firstChar);
			String secondStr = Character.toString(secondChar);
			// Take care or organizing first hashmap
			if (firstMap.containsKey(firstStr)) {
				int value = firstMap.get(firstStr);
				value++;
				firstMap.put(firstStr, value);	
			} else {
				firstMap.put(firstStr, 1);
			}
			// Organize second hashmap
			if (secondMap.containsKey(secondStr)) {
				int value = secondMap.get(secondStr);
				value++;
				secondMap.put(secondStr, value);
			} else {
				secondMap.put(secondStr, 1);
			}
				
		}
		
		for (String key : firstMap.keySet()) {
			if (!secondMap.containsKey(key))
				return false;
			if (secondMap.get(key) != firstMap.get(key))
				return false;
		}
		
		
		return true;
	}

	public static void main(String[] args) {

		while (true) {
			Scanner input = new Scanner(System.in);
			String first = input.nextLine();
			String second = input.nextLine();
			boolean checker = permutationCheck(first, second);
			System.out.println(permutationCheck(first, second));
			if (checker) 
				break;
			else 
				continue;
			
		}
		
		

	}

}
