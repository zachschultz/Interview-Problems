package CrackingTheCodingInterview.src;
import java.util.Scanner;

public class ReplaceSpaces1_4 {
	
	public static char[] replaceSpaces(String input, int length) {
		char[] newString = new char[length*2];
		int index = 0;
		for (int i = 0; i < length; i++) {
			if (input.charAt(i) == ' ') {
				newString[index++] = '%';
				newString[index++] = '2';
				newString[index++] = '0';
			}
			else {
				newString[index] = input.charAt(i);
				index++;}
		}
		
		
		return newString;
	}

	public static void main(String[] args) {

		char[] answer = replaceSpaces("ad sd s", 7);
		System.out.println(answer);
	}

}
