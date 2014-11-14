package CrackingTheCodingInterview.src;
import java.util.Arrays;

public class ReverseCharArray1_2 {

		public static char[] chArray = new char[10];
		
		ReverseCharArray1_2(char[] charArray) {
			chArray = charArray;
		}
		
		public void reverse() {
			char temp;
			
			for (int i = 0; i <= chArray.length / 2; i++) {
				temp = chArray[i];
				chArray[i] = chArray[chArray.length-i-1];
				chArray[chArray.length-i-1] = temp;
			}	
		}
		

		public static void main (String[] args) {
			char[] testStr = {'H','e','l','l','o'};
			
			ReverseCharArray1_2 charArray = new ReverseCharArray1_2(testStr);
		
			System.out.println("BEFORE reverse");
			System.out.println(Arrays.toString(charArray.chArray));
			charArray.reverse();
			System.out.println("AFTER reverse");
			System.out.println(Arrays.toString(charArray.chArray));
		}
}
