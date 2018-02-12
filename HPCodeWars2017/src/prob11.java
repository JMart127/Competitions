import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class prob11 {
	public static void main(String[] args) throws IOException {
		File file = new File("prob11-1-in.txt");
		Scanner sc = new Scanner(file);
		int numRows = sc.nextInt();
		int numColumns = sc.nextInt();
		int numPerLetter = sc.nextInt();
		char[][] letters = new char[numRows][numColumns];
		int numWords = sc.nextInt();
		int[] wordLengths = new int[numWords];

		for (int i = 0; i < numWords; i++) {
			wordLengths[i] = sc.nextInt();
		}

		String nothing = sc.nextLine();
		for (int i = 0; i < numRows; i++) {

			String line = sc.nextLine();
			line = line.replace(" ", "");
			letters[i] = line.toCharArray();
		}

		char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', };
		int[] numOfEachLetter = new int[26];

		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				for (int x = 0; x < alphabet.length; x++) {
					
					if (letters[i][j] == alphabet[x]) {
						numOfEachLetter[x]++;

					}
				}
			}
		}

		ArrayList<Character> validLetters = new ArrayList<Character>();

		for (int i = 0; i < alphabet.length; i++) {
			if(numOfEachLetter[i] < numPerLetter){
				validLetters.add(alphabet[i]);
			}
		}
		
		ArrayList<Character> goodLettersInOrder = new ArrayList<Character>();
		
		for (int i = 0; i < numRows; i++) {
			for (int j = 0; j < numColumns; j++) {
				for (int x = 0; x < validLetters.size(); x++) {
					if (letters[i][j] == validLetters.get(x)) {
						goodLettersInOrder.add(letters[i][j]);
					}
				}
			}
		}
		
		
		
		String goodLetterString = "";
		for(int i =0; i < goodLettersInOrder.size(); i++){
			goodLetterString += goodLettersInOrder.get(i);
		}
		
		
		int length = 0;
		int word = 0;
		for(int i =0; i < goodLetterString.length(); i ++){
			System.out.print(goodLetterString.charAt(i));
			length ++;
			if(length == wordLengths[word]){
				length =0;
				word++;
				System.out.print(" ");
			}
			
		}
		
	}
}
