package CrackingTheCodingInterview.src;

import java.util.Scanner;

public class BasicCompression1_5 {
	
	public static void compressor(String original) {
		StringBuilder newStr = new StringBuilder();
		int exitCode = 0;
		for (int i = 0; i < original.length(); i++) {
			if (newStr.length() > original.length()) {
				exitCode = 1;
				break;
			}
			int count = 1, temp_i = i;
			if (i == original.length() - 1) {
				newStr.append(original.charAt(i));
				newStr.append(count);
			}
			
			while (original.charAt(temp_i) == original.charAt(temp_i + 1) ) {
				count++;
				temp_i++;
				if (temp_i == original.length() - 1)
					break;
			}
			i = temp_i;
			newStr.append(original.charAt(i)); 
			newStr.append(count);
		}
		if (exitCode == 1)
			System.out.println(original);
		else 
			System.out.println(newStr.toString());
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		compressor(str);
	}
}
