package CrackingTheCodingInterview.src;
import java.util.Scanner;

public class ReplaceSpaces1_4 {
	
	public static char[] replaceSpaces(String input, int trueLength) {
		int numSpaces = 0;	// keep track of spaces
		int index = 0; 		// will keep track of our new sentence
		char[] chArray = new char[trueLength];
		
		for (int i = 0; i < trueLength; i++) {
			chArray[i] = input.charAt(i);
			if (chArray[i] == ' ')
				numSpaces++;
		}
		
		char[] newSentence = new char[trueLength + numSpaces*3];
		
		for (int i = 0; i < trueLength; i++) {
			if (chArray[i] == ' ') {
				newSentence[index++] = '%';
				newSentence[index++] = '2';
				newSentence[index++] = '0';
			}
			else {
				newSentence[index++] = chArray[i];
			}
		}
		
		return newSentence;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String sentence = input.nextLine();
		int trueLength = input.nextInt();
		char[] finalSentence = replaceSpaces(sentence, trueLength);
		
		System.out.println(finalSentence);
	}

}
